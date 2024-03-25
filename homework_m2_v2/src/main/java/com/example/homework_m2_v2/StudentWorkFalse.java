package com.example.homework_m2_v2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;


@ShellComponent
@ConditionalOnProperty(prefix = "stud", name = "service", havingValue = "false")
public class StudentWorkFalse {

    @ShellMethod(key = "c")
    public String createStudent(@ShellOption(value = "n")String name,
                                @ShellOption(value = "a") int age) {
        return "Поменяйте значение stud.service";
    }

    @ShellMethod(key = "d")
    public String deleteThisStud(@ShellOption(value = "n")int id) {
        return "Поменяйте значение stud.service";
    }

}
