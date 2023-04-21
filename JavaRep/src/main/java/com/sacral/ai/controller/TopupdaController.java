package com.sacral.ai.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.ai.entity.TopupdaEntity;
import com.sacral.ai.entity.TopupdaTempEntity;
import com.sacral.ai.service.TopupdaService;
import com.sacral.ai.service.TopupdaTempService;

@RestController
@RequestMapping("/api/v1/topupda")
public class TopupdaController {
    
    @Autowired
    private TopupdaService topupdaService;
    
    @Autowired
    private TopupdaTempService topupdaTempService;
    
    @PostMapping
    public TopupdaEntity createTopupda(@RequestBody TopupdaEntity topupdaEntity) {
        return topupdaService.save(topupdaEntity);
    }
    
    @PutMapping("/{topupId}")
    public void sendToApprove(@PathVariable Long topupId) {
        topupdaService.sendToApprove("Pending", "Pending", new Date(), topupId);
    }
    
    @GetMapping("/{id}")
    public Optional<TopupdaEntity> getTopupdaById(@PathVariable Long id) {
        return topupdaService.findById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteTopupdaById(@PathVariable Long id) {
        topupdaService.deleteById(id);
    }
    
    @PostMapping("/temp")
    public TopupdaTempEntity createTopupdaTemp(@RequestBody TopupdaTempEntity topupdaTempEntity) {
        return topupdaTempService.save(topupdaTempEntity);
    }
    
    @GetMapping("/temp/{topupId}")
    public Optional<TopupdaTempEntity> getTopupdaTempByTopupId(@PathVariable Long topupId) {
        return topupdaTempService.findByTopupId(topupId);
    }

}