import java.util.Scanner;

public class Task1PS1 {
    /**
     * @author Burkov Vladimir
     * 01-961
     * Problem Set 1 Task 01
     */
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        int t = tr.nextInt();
        int i = 1;
int tt=t;
        while (t>0)
        {while (i<=tt) {
            if (i <= t-1) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
            i++;

        }
        i=1;
            System.out.println("");
        t--;

        }

    }
}
