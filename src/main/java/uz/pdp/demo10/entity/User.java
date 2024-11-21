package uz.pdp.demo10.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id = idGen++;
    private String firstName;
    private String lastName;
    private String phone;
    private String password;
    private static Integer idGen = 1;


    public User(String firstName, String lastName, String number, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = number;
        this.password = password;
    }
}
