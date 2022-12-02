package org.adv2022.day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public final class Day1 {

    public static void main(String[] args) throws IOException {
        final List<String> lines = Files.readAllLines(Path.of("/home/strogiyotec/IdeaProjects/algs/adv2022/adv-2022/adv-2022/src/main/resources/day1_part1.txt"));
        //System.out.println(new Part1().biggestCalories(lines));
        System.out.println(new Part2().biggestCalories(lines));
    }
}
