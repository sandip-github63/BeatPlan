package com.isfa.BeatPlan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isfa.BeatPlan.entities.StoreDetail;

@Repository
public interface StoreInfoRepository extends JpaRepository<StoreDetail, Long> {

}
