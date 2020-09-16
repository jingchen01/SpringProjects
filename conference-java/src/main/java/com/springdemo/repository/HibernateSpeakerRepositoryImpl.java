package com.springdemo.repository;

import com.springdemo.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
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
