package demo20180723;

/**
 * Created by Administrator on 2018/7/24.
 */
public class Student {


    public Student(String name, Integer age) {
        this.setName(name);
        this.setAge(age);
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
