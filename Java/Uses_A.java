import java.util.*;

class Department{
    int id;
    String name;
    Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id = "+id+" name = "+name;
    }
}
class University {
    List<Department> dept = new ArrayList<>();
    String name;
    University(String name, List<Department> dept) {
        this.name = name;
        this.dept = dept;
    }
    public void getDepartments() {
        dept.stream().forEach(ele-> System.out.println(ele));
    }

}
public class Uses_A {
    public static void main(String[] args) {
        Department cs = new Department(1,"CS");
        Department eee = new Department(2,"EEE");
        List<Department> depts = Arrays.asList(cs,eee);
        University uni = new University("XYZ",depts);
        uni.getDepartments();
    }
}
