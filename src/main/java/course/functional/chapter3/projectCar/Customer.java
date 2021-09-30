package course.functional.chapter3.projectCar;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private String gender;
    private int age;
    private String city;
    private String education;
}
