package com.smarterbham.api.controller;

import com.smarterbham.api.dto.ThingsNetworkPayload;
import com.smarterbham.api.model.AirQuality;
import com.smarterbham.api.model.Connection;
import com.smarterbham.api.model.Device;
import com.smarterbham.api.repository.AirQualityRepository;
import com.smarterbham.api.repository.ConnectionRepository;
import com.smarterbham.api.repository.DeviceRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ThingsNetworkController {

    private final AirQualityRepository airQualityRepository;
    private final ConnectionRepository connectionRepository;
    private final DeviceRepository deviceRepository;

    public ThingsNetworkController(AirQualityRepository airQualityRepository, ConnectionRepository connectionRepository, DeviceRepository deviceRepository) {
        this.airQualityRepository = airQualityRepository;
        this.connectionRepository = connectionRepository;
        this.deviceRepository = deviceRepository;
    }

    @PostMapping("/thingsNetworkPayload")
    void newThingsNetworkPayload(@RequestBody ThingsNetworkPayload thingsNetworkPayload) {

        try {
            Device device = new Device(thingsNetworkPayload);
            Optional<Device> deviceFound = deviceRepository.findById(device.getDeviceId());
            if (deviceFound.isEmpty()) {
                device = deviceRepository.save(device);
            } else {
                device = deviceFound.get();
            }

            Connection connection = new Connection(thingsNetworkPayload, device);
            connection = connectionRepository.save(connection);

            AirQuality airQuality = new AirQuality(thingsNetworkPayload, connection, device);
            airQualityRepository.save(airQuality);
        } catch (Exception e) {
            System.out.println(thingsNetworkPayload);
            throw (e);
        }
    }

    @GetMapping("/airQuality")
    List<AirQuality> getAirQuality() {
        return airQualityRepository.findTop50ByOrderByReceivedAtDesc();
    }

    @GetMapping("/connection")
    List<Connection> getConnections() {
        return connectionRepository.findTop50ByOrderByReceivedAtDesc();
    }
}
