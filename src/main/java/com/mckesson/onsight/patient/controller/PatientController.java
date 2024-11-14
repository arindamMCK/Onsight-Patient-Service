package com.mckesson.onsight.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/onsight/patient")
@CrossOrigin("*")
public class PatientController {

  //  @Autowired
 //   private JdbcTemplate jdbcTemplate;

    @GetMapping("/fetchCount")
    public int fetchCount() {
        return 1;
    }

//    @GetMapping("/getCohortCount")
//    public ResponseEntity<String> getCohortCount() {
//        String query = "SELECT COUNT(*) FROM dmi_qa_silver_cdv_consenting_practice.data_product.cohorts";
//        try {
//            Integer count = jdbcTemplate.queryForObject(query, Integer.class);
//            System.out.println("Successfully fetched count from the database: " + count);
//            return ResponseEntity.ok("Count of records: " + count);
//        } catch (Exception e) {
//            System.err.println("Error executing query: " + e.getMessage());
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error fetching count");
//        }
//    }
}
