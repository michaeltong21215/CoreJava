package Session_1;

import java.io.*;

public class SerializationTest {
    public static void serialize(Employee employee){
        try {
            FileOutputStream out = new FileOutputStream("data.ser");
            ObjectOutputStream oStream = new ObjectOutputStream(out);
            oStream.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Employee deserialize(){
        ObjectInputStream iStream = null;
        try {
            FileInputStream in = new FileInputStream("data.ser");
            iStream = new ObjectInputStream(in);
            return (Employee)iStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Department d1 = new Department();
        d1.setDepartmentName("d1 name");
        d1.setDepartmentId("1000");
        Employee employee = new Employee("1", "Michael", 27,"Tong","Chase", d1);
        System.out.println(employee.toString());
        serialize(employee);
        Employee employee1 = deserialize();
        System.out.println(employee1.toString());
    }
}
