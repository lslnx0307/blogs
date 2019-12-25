package com.lsl.blogs.listener;

import org.springframework.context.ApplicationEvent;

import java.util.EventObject;

public class MyEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public MyEvent(Object source) {
        super(source);
    }
}
