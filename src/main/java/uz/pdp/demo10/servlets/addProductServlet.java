package uz.pdp.demo10.servlets;

import uz.pdp.demo10.DB;
import uz.pdp.demo10.entity.Product;


import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

@WebServlet("/product/add")
@MultipartConfig
public class addProductServlet extends HttpServlet {
    String absolutePath = "C:/Users/zarip/OneDrive/Desktop/image";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Part part = req.getPart("productImage");
        byte[] bytes = part.getInputStream().readAllBytes();
        Path path = Files.write(Path.of(absolutePath + UUID.randomUUID() + ".jpg"), bytes);
        String name = req.getParameter("name");
        Integer price = Integer.parseInt(req.getParameter("price"));
        String photoUrl = req.getParameter("photoUrl");
        String categoryId = req.getParameter("categoryId");
        Product product = new Product(
                name,
                price,
                photoUrl,
                categoryId
        );
        DB.PRODUCTS.add(product);
        resp.sendRedirect("/product.jsp");
    }

}