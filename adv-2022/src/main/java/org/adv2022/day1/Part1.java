package org.adv2022.day1;

import java.util.List;

public final class Part1 {

    public long biggestCalories(final List<String> lines) {
        int index = 0;
        long biggest = 0L;
        long currentSum = 0L;
        while (index < lines.size()) {
            final String line = lines.get(index);
            if (line.isEmpty()) {
                biggest = Math.max(biggest, currentSum);
                currentSum = 0L;
            } else {
                currentSum += Long.parseLong(line);
            }
            index++;
        }
        return biggest;
    }
}
