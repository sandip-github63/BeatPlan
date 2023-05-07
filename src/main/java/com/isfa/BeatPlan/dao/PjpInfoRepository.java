package com.isfa.BeatPlan.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.isfa.BeatPlan.entities.PjpInfo;
import com.isfa.BeatPlan.response.BeatDto;

@Repository
public interface PjpInfoRepository extends JpaRepository<PjpInfo, Long> {

//	@Query("SELECT new com.isfa.BeatPlan.response.BeatDto(o.pjpId, c.storeId,o.pjpDate, c.storeCode , c.storeName, c.storeCategory , c.address,c.latitude,c.longitude,c.activeStatus ,c.storeImage1,c.phoneNo) FROM PjpInfo o INNER JOIN o.store c WHERE o.userId = :userId AND o.dateCreated BETWEEN :startDate AND :endDate")
//	public List<BeatDto> findByUserIdAndDateCreatedBetween(@Param("userId") long userId,
//			@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

	@Query("SELECT new com.isfa.BeatPlan.response.BeatDto(o.pjpId, c.storeId,o.pjpDate, c.storeCode , c.storeName, c.storeCategory , c.address,c.latitude,c.longitude,c.activeStatus ,c.storeImage1,c.phoneNo) FROM PjpInfo o JOIN StoreDetail c ON o.storeId = c.storeId WHERE o.userId = :userId AND o.pjpDate = :startDate  AND o.companyId = :companyId  ORDER BY o.pjpDate DESC")
	List<BeatDto> findByUserIdAndPjpDateAndCompanyId(@Param("userId") Long userId,
			@Param("startDate") LocalDate startDate, @Param("companyId") Long companyId);

	@Query(value = "SELECT store_id FROM tt_attendanceinfo WHERE user_id = :userId AND current_status = 'active' AND in_date = :date", nativeQuery = true)
	List<Long> findStoreIdsByUserIdAndStatusAndDate(@Param("userId") Long userId, @Param("date") LocalDate date);

}
