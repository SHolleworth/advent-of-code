package day1;
import java.io.BufferedReader;
import java.io.FileReader;

class AOC1 {
    public static void main(String[] args) {
        System.out.println(new Solver(new Reader().readDepths()).solve2());
    }
}

class Solver {

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

class Reader {
    public String readDepths() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                return sb.toString();
            } finally {
                br.close();
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        return "";
    }
}