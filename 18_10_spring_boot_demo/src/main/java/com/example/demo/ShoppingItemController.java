package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/shoppingItems")
@Tag(name = "Shopping Items API", description = "Manage your shopping items")
public class ShoppingItemController {

    private final List<ShoppingItem> shoppingItems = new ArrayList<>();

    @PostMapping
    @Operation(summary = "Add a new shopping item", responses = {
            @ApiResponse(responseCode = "201", description = "Item created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid request payload")
    })
    public ResponseEntity<ShoppingItem> addItem(@RequestBody ShoppingItem shoppingItem) {
        shoppingItems.add(shoppingItem);
        return new ResponseEntity<>(shoppingItem, HttpStatus.CREATED);
    }

    @GetMapping
    @Operation(summary = "Get all shopping items")
    public List<ShoppingItem> getAllItems() {
        return shoppingItems;
    }

    @GetMapping("/{name}")
    @Operation(summary = "Get a shopping item by name", responses = {
            @ApiResponse(responseCode = "200", description = "Item found"),
            @ApiResponse(responseCode = "404", description = "Item not found")
    })
    public ResponseEntity<ShoppingItem> getItemByName(@PathVariable String name) {
        return shoppingItems.stream()
                .filter(item -> item.getName().equalsIgnoreCase(name))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PutMapping("/{name}")
    @Operation(summary = "Update a shopping item by name")
    public ResponseEntity<ShoppingItem> updateItem(@PathVariable String name, @RequestBody ShoppingItem updatedItem) {
        for (ShoppingItem item : shoppingItems) {
            if (item.getName().equalsIgnoreCase(name)) {
                item.setAmount(updatedItem.getAmount());
                return ResponseEntity.ok(item);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping("/{name}")
    @Operation(summary = "Delete a shopping item by name")
    public ResponseEntity<Void> deleteItem(@PathVariable String name) {
        boolean removed = shoppingItems.removeIf(item -> item.getName().equalsIgnoreCase(name));
        if (removed) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
