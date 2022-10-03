import java.util.Scanner;

public class Task2PS1 {
    /**
     * @author Burkov Vladimir
     * 01-961
     * Problem Set 1 Task 02
     */
    public static void main(String[] args) {


        Scanner dnt = new Scanner(System.in);
        System.out.println("Введите 1ое число");
        int k = dnt.nextInt();
        System.out.println("Введите 2ое число");
        int m = dnt.nextInt();
        if (m <= k) {
            while (m <= k) {
                if (m % 3 == 0) {

                    System.out.println(m);

                }
                m++;


            }
        }
        if (k <= m) {
            while (k <= m) {
                if (k % 3 == 0) {

                    System.out.println(k);

                }
                k++;


            }

        }

    }}
