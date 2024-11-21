package uz.pdp.demo10.servlets;

import uz.pdp.demo10.DB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/categories/delete")
public class deleteCategoryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Id = req.getParameter("categoryId");
        Integer categoryId = Integer.parseInt(Id);
        DB.CATEGORIES.removeIf(item -> item.getId().equals(categoryId));
        resp.sendRedirect("/categories.jsp");
    }
}
