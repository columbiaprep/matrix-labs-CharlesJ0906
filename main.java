import java.lang.Math;
import java.util.Arrays;

public class main{
    public static int[][] scale(int[][] input, int sf){
        // create a new 2d array called w/ row/col count the same
        int[][] output = new int[input.length][input[0].length];
        for (int r = 0; r < input.length; r++) {
            for (int c = 0; c < input[0].length; c++) {
                output[r][c] = input[r][c] * sf;
            }
        }
        return output;
    }
    public static int det2(int[][] input){
        // algorithm for det 2
        return ((input[0][0]*input[1][1])-(input[0][1]*input[1][0]));
    }
    public static int det3(int[][] input){
        int counter = 0;
        // edge case for a non 3 by 3 matrix
        if (input.length!=3||input[0].length!=3){
            return counter;
        }
        // algorithm for det 3
        counter = input[0][0]*(input[1][1]*input[2][2]-input[1][2]*input[2][1])-
                input[0][1]*(input[1][0]*input[2][2]-input[1][2]*input[2][0])+
                input[0][2]*(input[1][0]*input[2][1]-input[1][1]*input[2][0]);
        return (counter);
    }
    public static int[][] multmatrix(int[][] input1,int[][] input2){
        // new result matrix
        int[][] result = new int[input1.length][input2[0].length];
        // loop through rows of m1 and cols of m2
        for(int r =0 ; r<result.length; r++){
            for (int c = 0; c< result[r].length;c++){
                int counter = 0;
                for(int i =0; i<input1[0].length;i++){
                    // alg for the matrix thing
                    counter += input1[r][i] * input2[i][c];
                }
                result[r][c]=counter;
            }
        }
        return (result);

    }
    public static void main(String[] args){
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sf = 2;
        int[][] scaledArray = scale(input, sf);
        System.out.println(Arrays.deepToString(scaledArray));

    }
}
