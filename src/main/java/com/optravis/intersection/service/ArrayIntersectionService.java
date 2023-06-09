package com.optravis.intersection.service;

import com.optravis.intersection.model.ArrayIntersection;
import org.springframework.stereotype.Service;

/**
 * Array Intersection Service
 */
@Service
public interface ArrayIntersectionService {
    /**
     * Returns ArrayIntersection Model with intersection count and time taken based on user input.
     *
     * @param ArrayIntersection arrayIntersection
     * @return ArrayIntersection
     */
    /*
     */
    ArrayIntersection calcualteArrayIntersectionCountAndTime(ArrayIntersection arrayIntersection);
}
