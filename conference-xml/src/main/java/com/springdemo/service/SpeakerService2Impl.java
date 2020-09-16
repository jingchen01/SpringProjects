package com.springdemo.service;

import com.springdemo.model.Speaker;
import com.springdemo.repository.SpeakerRepository;

import java.util.List;

public class SpeakerService2Impl implements SpeakerService2 {

    private SpeakerRepository repository;

    public SpeakerService2Impl() {

    }

    public SpeakerService2Impl(SpeakerRepository repository) {
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }
}


