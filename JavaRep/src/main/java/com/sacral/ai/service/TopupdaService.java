package com.sacral.ai.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.ai.entity.TopupdaEntity;
import com.sacral.ai.repository.TopupdaRepository;

@Service
public class TopupdaService {

    @Autowired
    private TopupdaRepository topupdaRepository; 

    public void sendToApprove(String topupStatus, String amountStatus, Date modifiedOn, Long topupId) {
        topupdaRepository.sendToApprove(topupStatus, amountStatus, modifiedOn, topupId);
    }

    public TopupdaEntity save(TopupdaEntity topupdaEntity) {
        return topupdaRepository.save(topupdaEntity);
    }

    public Optional<TopupdaEntity> findById(Long id) {
        return topupdaRepository.findById(id);
    }

    public void deleteById(Long id) {
        topupdaRepository.deleteById(id);
    }
}