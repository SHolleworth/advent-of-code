package aoc.day2;

import aoc.Reader;

public class AOC2 {
    public static void main(String[] args) {
        new Solver(new Reader().read("./input.txt")).solve1();
    }
}


class Solver {

    private Vector[] vectors;

    Solver(String input) {
        String[] directions = input.toString().replaceAll("\\r", "").split("\n");
        vectors = parseVectors(directions);
    }

    private Vector[] parseVectors(String[] combinedDirectionAndDistanceArray) {
        Vector[] parsedVectors = new Vector[combinedDirectionAndDistanceArray.length]; 
        for(int i = 0; i < combinedDirectionAndDistanceArray.length; i++) {
            parsedVectors[i] = new Vector(combinedDirectionAndDistanceArray[i]);
        }  
        return parsedVectors;
    }

    public void solve1() {
        System.out.println(vectors[0]);
    }

}

class Vector {
    private String direction;
    private int distance;

    Vector(String combinedDirectionAndDistance) {
        String[] splitDirectionAndDistance = combinedDirectionAndDistance.split(" ");
        direction = splitDirectionAndDistance[0];
        distance = Integer.parseInt(splitDirectionAndDistance[1]);
    }

    public String getDirection() {
        return direction;
    }

    public int getDistance() {
        return distance;
    }
}