package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list -> {
            List<Integer> result = new ArrayList<>();
            for (Integer value : list) {
                result.add(value / divider);
            }
            return result;
        };

    }
}
