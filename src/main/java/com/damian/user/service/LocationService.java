package com.damian.user.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    @KafkaListener(topics = "Cab_Location.", groupId = "group-1")
    public void getCabLocation(String location) {
        System.out.println("Location received : " + location);

    }
}
