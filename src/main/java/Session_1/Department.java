package Session_1;

import lombok.Data;

import java.io.*;

@Data
public class Department implements Externalizable {
   private String departmentId;
   private String departmentName;
   private String departmentType;
   private String location;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.departmentName);
        out.writeObject(this.departmentId);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        departmentName = (String)in.readObject();
        departmentId = (String)in.readObject();
    }

    public static void serialize(Department d1){
        try {
            FileOutputStream out = new FileOutputStream("department.ser");
            ObjectOutputStream oStream = new ObjectOutputStream(out);
            oStream.writeObject(d1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Department deserialize(){
        ObjectInputStream iStream = null;
        try {
            FileInputStream in = new FileInputStream("department.ser");
            iStream = new ObjectInputStream(in);
            return (Department)iStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Department d1 = new Department();
        d1.setDepartmentId("500");
        d1.setDepartmentName("Department serialize");
        serialize(d1);
        Department d2 = deserialize();
        System.out.println(d2.toString());
    }
}
