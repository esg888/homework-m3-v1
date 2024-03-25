/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.homework_m2_v2;


import lombok.Getter;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author esg88
 */
@Getter

public class CreatEvent extends ApplicationEvent{

    private final Student student;


    public CreatEvent(Object source, Student student) {
        super(source);
        this.student = student;

    }




}
