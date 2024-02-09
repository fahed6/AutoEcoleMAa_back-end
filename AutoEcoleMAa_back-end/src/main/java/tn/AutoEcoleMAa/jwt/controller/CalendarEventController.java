package tn.AutoEcoleMAa.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.AutoEcoleMAa.jwt.entity.CalendarEvent;
import tn.AutoEcoleMAa.jwt.service.CalendarEventService;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/events")
public class CalendarEventController {

    @Autowired
    private CalendarEventService eventService;

    @GetMapping("/all")
    public List<CalendarEvent> getAllEvents() {
        return eventService.getAllEvents();
    }


    @PostMapping("/save")
    public CalendarEvent saveEvent(@RequestBody CalendarEvent event) {
        return eventService.saveEvent(event);
    }

    @DeleteMapping("/{eventId}")
    public void deleteEvent(@PathVariable Long eventId) {
        eventService.deleteEvent(eventId);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Void> updateEvent(@RequestBody CalendarEvent updatedEvent) {
        try {
            eventService.updateEvent(updatedEvent);
            return ResponseEntity.ok().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }
}