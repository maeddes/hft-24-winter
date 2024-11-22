from flask import Flask, render_template, request, redirect, url_for, flash
import requests
import os

app = Flask(__name__)
app.secret_key = 'your_secret_key'  # For flash messages

# Base URL for the Spring Boot API - hardcoded is bad!
# SPRING_BOOT_API_URL = "http://localhost:8080/api/shoppingItems"

# Read the environment variable
SPRING_BOOT_API_URL = os.getenv("SPRING_BOOT_API_URL", "http://localhost:8080/api/shoppingItems")  # Default value if not set

# Home Page: Display all shopping items
@app.route('/')
def index():
    response = requests.get(SPRING_BOOT_API_URL)
    if response.status_code == 200:
        items = response.json()
    else:
        items = []
        flash("Unable to fetch items from the API.", "error")
    return render_template('index.html', items=items)

# Add a new shopping item
@app.route('/add', methods=['GET', 'POST'])
def add_item():
    if request.method == 'POST':
        name = request.form['name']
        amount = request.form['amount']
        payload = {"name": name, "amount": int(amount)}

        response = requests.post(SPRING_BOOT_API_URL, json=payload)
        if response.status_code == 201:
            flash("Item added successfully!", "success")
            return redirect(url_for('index'))
        if response.status_code == 200:
            flash("Item updated successfully!", "success")
            return redirect(url_for('index'))
        else:
            flash("Failed to add item.", "error")
    return render_template('add_item.html')

# Update an existing shopping item
@app.route('/update/<string:name>', methods=['GET', 'POST'])
def update_item(name):
    if request.method == 'POST':
        amount = request.form['amount']
        payload = {"name": name, "amount": int(amount)}

        response = requests.put(f"{SPRING_BOOT_API_URL}/{name}", json=payload)
        if response.status_code == 200:
            flash("Item updated successfully!", "success")
            return redirect(url_for('index'))
        else:
            flash("Failed to update item.", "error")
    return render_template('update_item.html', name=name)

# Delete a shopping item
@app.route('/delete/<string:name>')
def delete_item(name):
    response = requests.delete(f"{SPRING_BOOT_API_URL}/{name}")
    if response.status_code == 204:
        flash("Item deleted successfully!", "success")
    else:
        flash("Failed to delete item.", "error")
    return redirect(url_for('index'))

if __name__ == '__main__':
    app.run(debug=True)
