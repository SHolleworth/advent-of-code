package aoc.day1;

public class AOC1 {

    private int[] depths;

    Solver(String input) {
        String[] depthsStrings = input.toString().replaceAll("\\r", "").split("\n");
        int[] temps = new int[depthsStrings.length];
        for(Integer i = 0; i < depthsStrings.length; i++) {
            temps[i] = Integer.parseInt(depthsStrings[i]);
        }
        depths = temps;
    }

    public int solve1() {
        int count = 0;
        for(int i = 1; i < depths.length; i++) {
            if(depths[i] > depths[i-1]) {
                count++;
            }
        }
        return count;
    }

    public int solve2() {
        int count = 0;
        for(int i = 0; i+3 < depths.length; i++) {
            int a = depths[i] + depths[i+1] + depths[i+2];
            int b = depths[i+1] + depths[i+2] + depths[i+3];
            if(b > a) {
                count++;
            }
        }
        return count;
    }
}