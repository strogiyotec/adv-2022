package org.adv2022.day1;

import java.util.List;
import java.util.PriorityQueue;

public final class Part2 {

    public long biggestCalories(final List<String> lines) {
        int index = 0;
        final PriorityQueue<Long> queue = new PriorityQueue<>();
        long currentSum = 0L;
        final int maxElements = 3;
        while (index < lines.size()) {
            final String line = lines.get(index);
            if (line.isEmpty()) {
                queue.offer(currentSum);
                if (queue.size() > maxElements) {
                    queue.poll();
                }
                currentSum = 0L;
            } else {
                currentSum += Long.parseLong(line);
            }
            index++;
        }
        return queue.poll() + queue.poll() + queue.poll();
    }
}
