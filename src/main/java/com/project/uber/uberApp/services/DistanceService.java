package com.project.uber.uberApp.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {
    double calculateDistance(Point src, Point dest);

    //call the third party api call oSRM to fetch distance
}
