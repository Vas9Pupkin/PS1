import java.util.Random;
import java.util.Scanner;

public class Task7PS1 {
    /**
     * @author Burkov Vladimir
     * 01-961
     * Problem Set 1 Task 07
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rd.nextInt(7);
                System.out.print(arr[i][j] + " ");


            }
            System.out.println(" ");
        }
int sym=0;
        int[][] arr2 = new int[n][n];
        for (int ii = 0; ii < n; ii++) {
            for (int jj = 0; jj < n; jj++) {
                if(ii==jj) {
                    arr2[ii][jj]=arr[ii][jj];
                    sym += arr2[ii][jj];


                }

            }
            System.out.println(" ");

        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Сумма1 ");
        System.out.print(sym);
        System.out.println(" ");

        int sym2=0;
        int sss=n;
        int[][] arr3 = new int[n][n];
        for (int iii = 0; iii < n; iii++,sss-=2) {
            for (int jjj = 0; jjj < n; jjj++) {
                if((iii+sss-1==jjj)) {
                    arr3[iii][jjj]=arr[iii][jjj];
                    sym2 += arr3[iii][jjj];


                }

            }
            System.out.println(" ");

        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Сумма2 ");
        System.out.print(sym2);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Макс сумма");
        if (sym>sym2){System.out.print(sym);}
        else {System.out.print(sym2);}











    }
}
