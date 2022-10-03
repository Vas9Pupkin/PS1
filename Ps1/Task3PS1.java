import java.util.Scanner;

public class Task3PS1 {
    /**
     * @author Burkov Vladimir
     * 01-961
     * Problem Set 1 Task 03
     */
    public static void main(String[] args) {

        Scanner sy = new Scanner(System.in);
        System.out.println("А ты введи значение числа n, а я тебе результат скажу");
        int n = sy.nextInt();
        float symItogo=0;

        for (float m = 1; m<=n;m++)
        {
            symItogo+=Math.pow((m-1),2)/(2*m);

        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Держи результат");
        System.out.println(symItogo);
    }
}
