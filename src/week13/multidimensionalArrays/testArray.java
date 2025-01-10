package week13.multidimensionalArrays;

public class testArray {

    public static void main(String[] args) {
        int[][] theArray = new int[3][4];
        for (int col = 0; col < 4; col++) {
            theArray[0][col] = col;
        }
        for (int row = 1; row <= 2; row++) {
            for (int col = 0; col <= 2; col++) {
                theArray[row][col] = theArray[row - 1][col + 1] + 1;

            }
        }

        PrintUtils.printIntMatrix(theArray);
    }
}