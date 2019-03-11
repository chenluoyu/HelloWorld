package demo2019.month3;

import demo20180723.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo01 {


    public static void main(String[] args) {
        
        List<Student> list = new ArrayList<>();
        Map<String, Student> collect = list.stream().collect(Collectors.toMap(Student::getName, Function.identity()));
        


    }
    
    
}
