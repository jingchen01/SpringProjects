package com.springbootdemo.service;

import com.springbootdemo.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
