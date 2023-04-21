package com.sacral.ai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.ai.entity.TopupdaTempEntity;
import com.sacral.ai.repository.TopupdaTempRepository;

@Service
public class TopupdaTempService {
    
    @Autowired
    private TopupdaTempRepository topupdaTempRepository;
    
    public Optional<TopupdaTempEntity> findByTopupId(Long topupId) {
        return topupdaTempRepository.findByTopupId(topupId);
    }
    
    public void save(TopupdaTempEntity topupdaTempEntity) {
        topupdaTempRepository.save(topupdaTempEntity);
    }

}