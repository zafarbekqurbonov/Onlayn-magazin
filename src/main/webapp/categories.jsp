<%@ page import="com.example.demo.DB" %>
<%@ page import="com.example.demo.entity.Category" %>
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
<h1 class="bg-dark text-white pg-3">Category</h1>
<a href="addCategory.jsp" class="btn btn-dark">Add category</a>
<table class="table">
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Category Id</th>
    </tr>
    </thead>
    <tbody>
    <%
        for (Category category : DB.CATEGORIES) {
    %>

    <tr>
        <td><%=category.getId()%>
        </td>
        <td><%=category.getName()%>
        </td>
        <td>
            <a href="product.jsp?categoryId=<%=category.getId()%>" class="btn btn-dark">Go</a>
        </td>
        <td class="d_flex">
            <form action="/categories/delete" method="post">
                <input type="hidden" name="categoryId" value="<%=category.getId()%>">
                <button class="btn btn-outline-dark">Delete</button>
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
