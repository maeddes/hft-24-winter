package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/shoppingItems")
@Tag(name = "Shopping Items API", description = "Manage your shopping items")
public class ShoppingItemController {

    // goodbye in memory state private final List<ShoppingItem> shoppingItems = new ArrayList<>();

    private final ShoppingItemRepository shoppingItemRepository;

    public ShoppingItemController(ShoppingItemRepository shoppingItemRepository) {
        this.shoppingItemRepository = shoppingItemRepository;
    }

    @PostMapping
    @Operation(summary = "Add a new shopping item", responses = {
            @ApiResponse(responseCode = "200", description = "Item updated successfully"),
            @ApiResponse(responseCode = "201", description = "Item created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid request payload")
    })
    public ResponseEntity<ShoppingItem> addItem(@RequestBody ShoppingItem shoppingItem) {
        return shoppingItemRepository.findByNameIgnoreCase(shoppingItem.getName())
                .map(existingItem -> {
                    existingItem.setAmount(existingItem.getAmount() + shoppingItem.getAmount());
                    shoppingItemRepository.save(existingItem);
                    return ResponseEntity.ok(existingItem);
                })
                .orElseGet(() -> {
                    ShoppingItem savedItem = shoppingItemRepository.save(shoppingItem);
                    return ResponseEntity.status(HttpStatus.CREATED).body(savedItem);
                });
    }

    @GetMapping
    @Operation(summary = "Get all shopping items")
    public List<ShoppingItem> getAllItems() {
        return shoppingItemRepository.findAll();
    }

    @GetMapping("/{name}")
    @Operation(summary = "Get a shopping item by name", responses = {
            @ApiResponse(responseCode = "200", description = "Item found"),
            @ApiResponse(responseCode = "404", description = "Item not found")
    })
    public ResponseEntity<ShoppingItem> getItemByName(@PathVariable String name) {
        return shoppingItemRepository.findByNameIgnoreCase(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PutMapping("/{name}")
    @Operation(summary = "Update a shopping item by name", responses = {
        @ApiResponse(responseCode = "200", description = "Item updated successfully"),
        @ApiResponse(responseCode = "404", description = "Item not found")
    })
    public ResponseEntity<ShoppingItem> updateItem(@PathVariable String name, @RequestBody ShoppingItem updatedItem) {
        return shoppingItemRepository.findByNameIgnoreCase(name)
                .map(existingItem -> {
                    existingItem.setAmount(updatedItem.getAmount());
                    shoppingItemRepository.save(existingItem);
                    return ResponseEntity.ok(existingItem);
                })
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @DeleteMapping("/{name}")
    @Operation(summary = "Delete a shopping item by name")
    public ResponseEntity<String> deleteItem(@PathVariable String name) {
        return shoppingItemRepository.findByNameIgnoreCase(name)
                .map(existingItem -> {
                    shoppingItemRepository.delete(existingItem);
                    return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Item deleted successfully.");
                })
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Item not found."));
    }
}
