package com.springbootdemo.repository;

import com.springbootdemo.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
