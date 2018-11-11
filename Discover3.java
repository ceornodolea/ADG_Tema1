import java.lang.reflect.Field;

class Student{
    private String name;
    private  Integer age;
    public Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }
}
public class Discover3 {
    public static void main(String[] args) throws Exception{
        Student student = new Student("John", 21);
        Field field = student.getClass().getDeclaredField("name");
        field.setAccessible(true);// the power of reflection
        System.out.println(field.get(student));
    }
}
