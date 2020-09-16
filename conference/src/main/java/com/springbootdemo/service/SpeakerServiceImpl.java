package com.springbootdemo.service;

import com.springbootdemo.model.Speaker;
import com.springbootdemo.repository.HibernateSpeakerRepositoryImpl;
import com.springbootdemo.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll() {
        return repository.findAll();
    }
}


