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
//        return "Student{name='" + getName() + "', age=" + getAge() + "}";
        return super.toString();
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


    @Override
    public int hashCode() {
        return age.hashCode() * name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (obj instanceof Student) {
            Student student = (Student) obj;
            // 比较每个属性的值 一致时才返回true
            if (student.age == this.age && student.name.equals(this.name))
                return true;
        }
        return false;
    }
}
