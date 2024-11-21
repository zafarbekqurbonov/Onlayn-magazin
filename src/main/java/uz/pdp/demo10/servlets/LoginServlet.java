package uz.pdp.demo10.servlets;


import uz.pdp.demo10.DB;
import uz.pdp.demo10.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    public static User currentUser = null;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String phone = req.getParameter("phone");
        String password = req.getParameter("password");
        Optional<User> userOptional = DB.USERS.stream().filter(item -> item.getPhone().equals(phone) && item.getPassword().equals(password)).findFirst();
        if (userOptional.isPresent()) {
            currentUser = userOptional.get();
            resp.sendRedirect("/categories.jsp");
        } else {
            resp.sendRedirect("/login.jsp");
        }
    }
}

protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
    String phone = req.getParametr("phone");
    String password = req.getParamter("password");
    Optional<User> userOptional = DB.USERS.stream().filter(item -> iteam.getphone().equals(phone) && item.getpassword().equals(password)).findFirst();
    if (userOptional.isPresent()) {
        currentUser = userOptinal.get();
        resp.sendRedirect("/categories.jsp");
    }else
        
    }
}