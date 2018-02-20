package yncrea.pw06.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import yncrea.pw06.core.entity.CalEvent;

import java.util.List;


public interface CalEventDAO extends JpaRepository<CalEvent,Long> {

}
