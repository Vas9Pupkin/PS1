import java.util.Random;
import java.util.Scanner;

public class Task6PS1 {
    /**
     * @author Burkov Vladimir
     * 01-961
     * Problem Set 1 Task 06
     */
    public static void main(String[] args) {
        Scanner qq = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Величина массива ");
        int n = qq.nextInt();
        int [] arr= new int[n];

        System.out.println("Исходный массив ");
            for(int j=0;j<n;j++)
            {

                    arr[j]= rd.nextInt(10);
                    System.out.print(arr[j] +" ");
    }
        System.out.println(" ");

        int [] arr2= new int[n];
        int ss = n;
        System.out.println("Полученный массив ");
        for(int jj=0;jj<n;jj++, ss--)
        {

            arr2[jj]=arr[ss-1] ;
            System.out.print(arr2[jj] +" ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задание выполнено ");








    }
}
