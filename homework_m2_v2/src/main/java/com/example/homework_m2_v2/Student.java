package com.example.homework_m2_v2;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.UUID;

//
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Student {

    private String name;
    private int age;

}
