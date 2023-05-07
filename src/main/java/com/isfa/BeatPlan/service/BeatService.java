package com.isfa.BeatPlan.service;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface BeatService {

	public ResponseEntity<?> getAllBeat(long userid, LocalDate startDate, Long companyId);

}
