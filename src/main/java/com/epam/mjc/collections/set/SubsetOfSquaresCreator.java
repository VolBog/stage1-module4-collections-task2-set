package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> squaresSet = new TreeSet<>();
        for (Integer num : sourceList) {
            int square = num * num;
            squaresSet.add(square);
        }

        return squaresSet.subSet(lowerBound, true, upperBound, true);
    }
}
