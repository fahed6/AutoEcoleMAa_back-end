package tn.AutoEcoleMAa.jwt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.AutoEcoleMAa.jwt.entity.CalendarEvent;

public interface CalendarEventRepository extends JpaRepository<CalendarEvent, Long> {
   
}