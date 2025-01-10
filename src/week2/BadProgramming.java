package week2;

public class BadProgramming {

    public static void main(String[] args) {
        for (int count = 1; count < 10; count++) {
            System.out.print(count);
            if (count > 5)
                break;
        }

    }
}
