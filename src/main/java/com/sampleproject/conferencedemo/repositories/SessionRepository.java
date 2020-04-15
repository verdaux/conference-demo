package com.sampleproject.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sampleproject.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
