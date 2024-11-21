<%--
  Created by IntelliJ IDEA.
  User: zarip
  Date: 11/17/2024
  Time: 12:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    <title>Category</title>
</head>
<body>

<div class="row">
    <div class="col-6 offset-3">
        <div class="card">
            <div class="card-header">
                Add category
            </div>
            <div class="card-body">
                <form action="/categories/save" method="post">
                    <input type="text" placeholder="Name" name="name" class="form-control my-3">
                    <button class="btn btn-dark">Save</button>
                </form>
            </div>
        </div>
    </div>
</div>

</body>
</html>
