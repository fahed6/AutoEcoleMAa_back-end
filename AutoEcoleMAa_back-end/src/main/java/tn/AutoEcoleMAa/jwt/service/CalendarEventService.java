package tn.AutoEcoleMAa.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.AutoEcoleMAa.jwt.dao.CalendarEventRepository;
import tn.AutoEcoleMAa.jwt.entity.CalendarEvent;

@Service
public class CalendarEventService {

    @Autowired
    private CalendarEventRepository eventRepository;

    public List<CalendarEvent> getAllEvents() {
        return eventRepository.findAll();
    }

    public CalendarEvent saveEvent(CalendarEvent event) {
        return eventRepository.save(event);
    }

    public void deleteEvent(Long eventId) {
        eventRepository.deleteById(eventId);
    }
    public boolean eventExists(Long eventId) {
        return eventRepository.existsById(eventId);
    }

    public CalendarEvent updateEvent(CalendarEvent updatedEvent) {
        // Check if the event exists
        if (eventRepository.existsById(updatedEvent.getId())) {
            // Save the updated event
            return eventRepository.save(updatedEvent);
        } else {
            throw new IllegalArgumentException("Event with ID " + updatedEvent.getId() + " does not exist.");
        }
    }

}