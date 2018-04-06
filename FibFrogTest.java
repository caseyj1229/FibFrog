import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibFrogTest {
    @Test
    void solution() {
        //Example Input
        int[] A = {0,0,0,1,1,0,1,0,0,0,0};
        assertEquals(3,FibFrog.solution(A));

        //Extreme Case, All Jumps possible
        int[] B = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        assertEquals(2,FibFrog.solution(B));

        //Extreme Case, No Jumps possible
        int[] C = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertEquals(-1,FibFrog.solution(C));
    }
}