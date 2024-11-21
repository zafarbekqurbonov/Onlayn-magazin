package uz.pdp.demo10;


import uz.pdp.demo10.entity.Category;
import uz.pdp.demo10.entity.Product;
import uz.pdp.demo10.entity.User;

import java.util.ArrayList;
import java.util.List;

public interface DB {

    List<User> USERS = new ArrayList<>(List.of(
            new User("ali", "aliyev", "12345678", "123"),
            new User("vali", "valiyev", "87654321", "321")
    ));

    List<Category> CATEGORIES = new ArrayList<uz.pdp.demo10.entity.Category>(List.of(
            new Category("Yegulik"),
            new Category("Ichgulik"),
            new Category("Kiygulik")
    ));
    List<Product> PRODUCTS = new ArrayList<uz.pdp.demo10.entity.Product>();

}

