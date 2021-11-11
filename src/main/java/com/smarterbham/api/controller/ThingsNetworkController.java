package com.smarterbham.api.controller;

import com.smarterbham.api.model.ThingsNetworkPayload;
import com.smarterbham.api.repository.ThingsNetworkPayloadRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ThingsNetworkController {

    private ThingsNetworkPayloadRepository thingsNetworkPayloadRepository;

    public ThingsNetworkController(ThingsNetworkPayloadRepository thingsNetworkPayloadRepository) {
        this.thingsNetworkPayloadRepository = thingsNetworkPayloadRepository;
    }

    @PostMapping("/thingsNetworkPayload")
    void newThingsNetworkPayload(@RequestBody ThingsNetworkPayload thingsNetworkPayload) {
        thingsNetworkPayloadRepository.save(thingsNetworkPayload);
    }

    @GetMapping("thingsNetworkPayload")
    List<ThingsNetworkPayload> getThingsNetworkPayloads() {
        return thingsNetworkPayloadRepository.findAll();
    }
}
