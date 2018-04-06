import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibFrog {
    public static int solution(int[] A){
        //Jumps will contain the legal jumps available (the fibonacci numbers)
        List<Integer> jumps = new ArrayList<>();
        jumps.add(1);
        jumps.add(1);

        int nextJump= 0;
        //All the jumps will be filled for an array of length N
        while(nextJump < A.length+1){
            nextJump = jumps.get(jumps.size()-1) + jumps.get(jumps.size()-2);
            jumps.add(nextJump);
        }

        //minJumps
        int[] minJumps = new int[A.length+2];
        Arrays.fill(minJumps, Integer.MAX_VALUE);
        minJumps[0] = 0;

        for(int i =0; i < minJumps.length; i++){
            if(i == 0 || i == minJumps.length-1 || A[i-1] == 1){
                for(int jump : jumps){
                    if(jump > i){
                        break;
                    }
                    minJumps[i] = (int) Math.min(minJumps[i], (long)minJumps[i-jump]+1);
                }
            }
        }
        // iff minJumps[minJumps.length-1] == MAX_VALUE return -1, else return minJumps[minjumps.length-1]
        return minJumps[minJumps.length-1] == Integer.MAX_VALUE ? -1 : minJumps[minJumps.length-1];
    }
}
