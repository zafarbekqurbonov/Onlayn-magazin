<%@ page import="com.example.demo.DB" %>
<%@ page import="com.example.demo.entity.Product" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>

<h1 class="bg-dark text-white pg-3">Products</h1>
<a href="addProduct.jsp" class="btn btn-dark">Add product</a>
<a href="korzinka.jsp" class="btn btn-dark offset m-3"> Korzinka </a>
<table class="table">
    <thead>
    <tr>
        <th>Img</th>
        <th>Name</th>
        <th>Price</th>
        <th>Go to basket</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>

    <%
        for (Product product : DB.PRODUCTS) {
    %>

    <tr>
        <td>
            <img src="/file/<%=product.getId()%>" alt="" width="100" height="100">
        </td>
        <td><%=product.getName()%>
        </td>
        <td><%=product.getPrice()%>
        </td>
        <td>
            <input type="checkbox" name="names">
        </td>
        <td>
            <form action="/product/delete" method="post">
                <input type="hidden" name="productId" value="<%=product.getId() %>">
                <button type="submit" class="btn btn-outline-dark">Delete</button>
            </form>
        </td>
    </tr>
    </tbody>

    <%
        }
    %>


</table>
</body>
</html>