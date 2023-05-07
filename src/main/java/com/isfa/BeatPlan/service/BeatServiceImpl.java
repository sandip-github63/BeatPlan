package com.isfa.BeatPlan.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.isfa.BeatPlan.dao.PjpInfoRepository;
import com.isfa.BeatPlan.response.BaseResponse;
import com.isfa.BeatPlan.response.BeatDto;

@Service
public class BeatServiceImpl implements BeatService {

	@Autowired
	PjpInfoRepository prepo;

	@Autowired
	BaseResponse<List<BeatDto>> bresponse;

	@Override
	public ResponseEntity<?> getAllBeat(long userid, LocalDate startDate, Long companyId) {
		try {

			// List<BeatDto> data = prepo.findByUserIdAndDateCreatedBetween(userid,
			// startDate, endDate);

			List<BeatDto> data = prepo.findByUserIdAndPjpDateAndCompanyId(userid, startDate, companyId);

			try {

				List<Long> store = prepo.findStoreIdsByUserIdAndStatusAndDate(userid, startDate);

				data.stream().filter(obj -> store.contains(obj.getStoreId())).forEach(obj -> obj.setMarkin(true));

				System.out.println(store);

			} catch (Exception e) {
				System.out.println("store not found where user is markin");

			}

			if (!data.isEmpty()) {
				bresponse.setData(data);
				bresponse.setMessage("list of BeatPlan");
				bresponse.setStatus("200");

				return ResponseEntity.status(HttpStatus.OK).body(bresponse);
			} else {

				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("data not found!!!!");

			}
		} catch (Exception e) {
			System.out.println("error" + e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("something went wrong");

		}

	}

}
