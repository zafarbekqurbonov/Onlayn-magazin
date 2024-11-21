package uz.pdp.demo10.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Integer id = idGen++;
    private String name;
    private Integer price;
    private String photoUrl;
    private static Integer idGen = 1;

    public Product(String name, Integer price, String photoUrl, String categoryId) {
        this.name = name;
        this.price = price;
        this.photoUrl = photoUrl;
    }
}
