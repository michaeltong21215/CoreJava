package Session_1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable {
    private static final long serialVersionUID = 390423423L;
    private final String EmployeeId;
    private transient String firstName;
    private int age;
    private String lastName;
    private static String orgName;
    private Department d1;

    public Employee(String employeeId, String firstName, int age, String lastName, String orgName, Department d1) {
        EmployeeId = employeeId;
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
        this.orgName = orgName;
        this.d1 = d1;
    }

}
