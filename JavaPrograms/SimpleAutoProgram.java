import java.util.Random;

public class SimpleAutoProgram {

    public static void main(String[] args) {

        Random r = new Random();

        for (int i = 1; i <= 10; i++) {   // 10 times repeat

            int num = r.nextInt(100);   // Auto generate 0-99
            System.out.println("Generated:" + num);

            if (num % 2 == 0) {
                System.out.println("Square:" + (num * num));
            } else {
                System.out.println("Cube:" + (num * num * num));
            }

        }
    }
}