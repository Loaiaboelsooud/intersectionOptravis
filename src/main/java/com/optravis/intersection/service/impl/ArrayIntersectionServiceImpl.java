package com.optravis.intersection.service.impl;

import com.optravis.intersection.model.ArrayIntersection;
import com.optravis.intersection.service.ArrayIntersectionService;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ArrayIntersectionServiceImpl implements ArrayIntersectionService {

    @Override
    public ArrayIntersection calcualteArrayIntersectionCountAndTime(ArrayIntersection arrayIntersection) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        List<Integer> list;
        Set<Integer> set;

        if (arrayIntersection.isArrayOneToSet()) {
            list = generateRandomArray(arrayIntersection.getArrayTwoSize());
            set = generateRandomSet(arrayIntersection.getArrayOneSize());
        } else {
            list = generateRandomArray(arrayIntersection.getArrayOneSize());
            set = generateRandomSet(arrayIntersection.getArrayTwoSize());
        }

        int arrayIntersectionCount = 0;
        if (arrayIntersection.isIterateOverSet()) {
            for (Integer element : set) {
                if (list.contains(element)) {
                    arrayIntersectionCount++;
                }
            }
        } else {
            for (Integer element : list) {
                if (set.contains(element)) {
                    arrayIntersectionCount++;
                }
            }
        }
        arrayIntersection.setIntersectionCount(arrayIntersectionCount);

        stopWatch.stop();
        arrayIntersection.setTimeTaken(stopWatch.getTotalTimeSeconds());

        return arrayIntersection;
    }

    private List generateRandomArray(int arraySize) {
        return new Random().ints(arraySize, 0, Integer.MAX_VALUE)
                .boxed()
                .collect(Collectors.toList());
    }

    private Set generateRandomSet(int setSize) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();

        while (set.size() < setSize) {
            while (set.add(random.nextInt(Integer.MAX_VALUE)) != true) ;
        }
        return set;
    }
}
