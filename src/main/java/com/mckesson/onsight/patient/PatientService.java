package com.mckesson.onsight.patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientService {

    public static void main(String[] args) {
        try {
            SpringApplication.run(PatientService.class);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
