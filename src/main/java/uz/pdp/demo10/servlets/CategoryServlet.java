package uz.pdp.demo10.servlets;


import uz.pdp.demo10.entity.Category;  // Bu yerda Category sinfini import qilasiz

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/categories")
public class CategoryServlet extends HttpServlet {
    private static final List<Category> CATEGORIES = new ArrayList<>(List.of(
            new Category("Yegulik"),
            new Category("Ichgulik"),
            new Category("Kiygulik")
    ));

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Pass the categories list to the JSP
        request.setAttribute("CATEGORIES", CATEGORIES);
        request.getRequestDispatcher("categories.jsp").forward(request, response);
    }
}
