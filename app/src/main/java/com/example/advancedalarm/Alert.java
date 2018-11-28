package com.example.advancedalarm;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Alert {
    private String name;
    private Date eventDate;
    private boolean importance;
    private String shortDescription;
    private String description;

    public Alert(String name, Date date, boolean importance, String shortDescription, String description) {
        this.name = name;
        this.eventDate = date;
        this.importance = importance;
        this.shortDescription = shortDescription;
        this.description = description;
    }

    public Alert(String name, String date, boolean importance, String shortDescription, String description) {
        this.name = name;
        this.eventDate = new SimpleDateFormat("yyyy/MM/dd G 'at' HH/mm/ss z").parse(date, new ParsePosition(0));
        this.importance = importance;
        this.shortDescription = shortDescription;
        this.description = description;
    }

    public Alert(String name, Date eventDate, boolean importance, String description) {
        this.name = name;
        this.eventDate = eventDate;
        this.importance = importance;
        this.shortDescription = null;
        this.description = description;
    }

    public Alert(String name, String date, boolean importance, String description) {
        this.name = name;
        this.eventDate = new SimpleDateFormat("yyyy/MM/dd G 'at' HH/mm/ss z").parse(date, new ParsePosition(0));
        this.importance = importance;
        this.shortDescription = null;
        this.description = description;
    }
}
