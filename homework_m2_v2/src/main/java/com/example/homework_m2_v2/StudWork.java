package com.example.homework_m2_v2;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;


@RequiredArgsConstructor
@ShellComponent
//@ConditionalOnProperty(prefix = "stud", name = "service", havingValue = "true")
@ConditionalOnBean(StudentService.class)
public class StudWork {

    private final StudentService studentService;
    private final ApplicationEventPublisher eventPublisher;

    @ShellMethod(key = "c")
    public String createStudent(@ShellOption(value = "n")String name,
                                @ShellOption(value = "a") int age) {
        Student student = new Student(name, age);
        studentService.addStud(student);
        this.eventPublisher.publishEvent(new CreatEvent(this, student));
        return "Студент успешно добавлен " + name;
    }

    @ShellMethod(key = "d")
    public String deleteThisStud(@ShellOption(value = "n")int id) {
        studentService.delStud(id);
        return "Студент успешно удален с id: " + id;
    }
    @ShellMethod(key = "a")
    public void allStud()
    {
studentService.allRead();
    }

}
