package com.isfa.BeatPlan.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isfa.BeatPlan.model.BeatPlanRequest;
import com.isfa.BeatPlan.service.BeatService;

@RestController
@RequestMapping("/api")
public class BeatPlanController {

	@Autowired
	BeatService service;

	@PostMapping("/V2/beatPlan")
	public ResponseEntity<?> getBeatPlan(@RequestBody BeatPlanRequest req) {

		try {
			Long userId = req.getUserId();

			LocalDate startDate = LocalDate.parse(req.getDate());

			Long companyId = req.getCompanyId();

			// ResponseEntity<?> data = service.getAllBeat(userId, startDate, endDate);

			ResponseEntity<?> data = service.getAllBeat(userId, startDate, companyId);

			return data;
		} catch (Exception e) {
			System.out.println("error  " + e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("bad request!!!");
		}
	}

}
