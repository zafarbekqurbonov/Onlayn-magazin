<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>

<div class="container mt-5">
    <h2 class="text-center mb-4">Add Product</h2>
    <form action="/product/add" method="post" enctype="multipart/form-data">
        <form>
            <!-- Product Image -->
            <div class="mb-3">
                <label for="productImage" class="form-label">Product Image</label>
                <input name="productImage" type="file" class="form-control" id="productImage" required>
            </div>
            <!-- Product Name -->
            <div class="mb-3">
                <label for="productName" class="form-label">Product Name</label>
                <input name="name" type="text" class="form-control" id="productName" placeholder="Enter product name"
                       required>
            </div>
            <!-- Product Price -->
            <div class="mb-3">
                <label for="productPrice" class="form-label">Product Price</label>
                <input name="price" type="number" class="form-control" id="productPrice"
                       placeholder="Enter product price" required>
                <button type="submit" class="btn btn-primary w-100">Save</button>
        </form>
    </form>
</div>
</body>
</html>
