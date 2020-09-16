package com.springdemo.repository;

import com.springdemo.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
