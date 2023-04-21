package com.sacral.ai.repository; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param; 

public interface TopupdaRepository extends JpaRepository<TopupdaEntity, Long> { 
 
    @Query("UPDATE TopupdaTempEntity SET topupStatus= :topupStatus, amountStatus= :amountStatus, modifiedOn= :modifiedOn WHERE topupId= :topupId")
    void sendToApprove(@Param("topupStatus") String topupStatus, @Param("amountStatus") String amountStatus, @Param("modifiedOn") Date modifiedOn, @Param("topupId") Long topupId); 
    
    void save(TopupdaEntity topupdaEntity); 
    
    TopupdaEntity findById(Long id); 
    
    void deleteById(Long id); 
}