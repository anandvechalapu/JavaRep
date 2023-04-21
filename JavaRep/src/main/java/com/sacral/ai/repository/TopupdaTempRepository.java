package com.sacral.ai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacral.ai.entity.TopupdaTempEntity;

@Repository
public interface TopupdaTempRepository extends JpaRepository<TopupdaTempEntity, Long> {
    
    TopupdaTempEntity findByTopupId(Long topupId);
    
    void save(TopupdaTempEntity topupdaTempEntity);
    
}