package com.project.uber.uberApp.strategy;

import com.project.uber.uberApp.dto.RideRequestDto;
import com.project.uber.uberApp.entities.RideRequest;

public interface RideFareCalculationStrategy {
    double RIDE_FARE_MULTIPLIER=10;
    double calculateFare(RideRequest rideRequest);
}
