package com.adaming.wasmspringproject.service;

import com.adaming.wasmspringproject.repository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoachService {

    @Autowired
    private CoachRepository coachRepository;
}
