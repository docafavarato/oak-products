import requests
from flask import Flask, request, url_for, render_template

app = Flask(__name__)

@app.route("/", methods=["GET", "POST"])
def index():
    products = requests.get("http://localhost:8080/products/orderByPriceAsc").json()
    return render_template("index.html", products=products)

@app.route("/create-product", methods=["POST"])
def create_product():
    productName = request.form.get("productName")
    productDescription = request.form.get("productDescription")
    productPrice = request.form.get("productPrice")
    isAvailable = request.form.get("isAvailable")
    
    match isAvailable:
        case "on":
            req = requests.post("http://localhost:8080/products/insert", json={"name": productName, "description": productDescription, "price": productPrice, "available": True})
        case None:
            req = requests.post("http://localhost:8080/products/insert", json={"name": productName, "description": productDescription, "price": productPrice, "available": False})
            
    return get_all_products()

@app.route("/search-products", methods=["POST"])
def search_products():
    productName = request.form.get("productNameSearch")
    products = requests.get(f"http://localhost:8080/products/search?name={productName}").json()
    return render_template("products-table.html", products=products)

@app.route("/search-products-available", methods=["GET"])
def get_available_products():
    products = requests.get("http://localhost:8080/products/search?available=true").json()
    return render_template("products-table.html", products=products)

@app.route("/get-all-products", methods=["GET"])
def get_all_products():
    products = requests.get("http://localhost:8080/products/orderByPriceAsc").json()
    return render_template("products-table.html", products=products)


if __name__ == '__main__':
    app.run(debug=False)