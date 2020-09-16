package com.springdemo.repository;

import com.springdemo.model.Speaker;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedNum;

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("User1-FirstName");
        speaker.setLastName("User2-LastName");
        speaker.setSeedNum(seedNum);

        speakers.add(speaker);

        return speakers;
    }
}
