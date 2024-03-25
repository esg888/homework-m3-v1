package com.example.homework_m2_v2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
@ConditionalOnProperty(prefix = "stud", name = "service", havingValue = "true")
public class StudentService  {


    private final Map<Integer, Student> studentMap = new HashMap<>();

    public  void addStud(Student student)
    {
       int n=studentMap.size();
       int id=1+n;
        studentMap.put(id, student);
    }

    public  void delStud (int id) {
        studentMap.remove(id);
    }

    public void allRead()
    {
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("айдишник: " + entry.getKey() + " | имя: " + entry.getValue().getName() + " | возраст: " + entry.getValue().getAge()
            );}
    }

}