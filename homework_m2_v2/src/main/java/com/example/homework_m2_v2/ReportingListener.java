package com.example.homework_m2_v2;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author esg88*/
@Component
public class ReportingListener {

    @EventListener(CreatEvent.class)
    public void reportUserCreation(CreatEvent event) {

        System.out.println("Оно живое!: " + event);
    }
}