package com.project.uber.uberApp.services;

import com.project.uber.uberApp.dto.DriverDto;
import com.project.uber.uberApp.dto.RideDto;
import com.project.uber.uberApp.dto.RideRequestDto;
import com.project.uber.uberApp.dto.RiderDto;
import com.project.uber.uberApp.entities.Rider;
import com.project.uber.uberApp.entities.User;

import java.util.List;

public interface RiderService {
    RideRequestDto requestRide(RideRequestDto rideRequestDto);
    RiderDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    DriverDto getmyProfile();

    List<RiderDto> getAllMyRides();

    Rider createNewRider(User user);
}
