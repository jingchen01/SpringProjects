package com.springbootdemo.repository;

import com.springbootdemo.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("User1-FirstName");
        speaker.setLastName("User2-LastName");

        speakers.add(speaker);

        return speakers;
    }
}
