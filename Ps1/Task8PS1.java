import java.util.Random;
import java.util.Scanner;

public class Task8PS1 {
    /**
     * @author Burkov Vladimir
     * 01-961
     * Problem Set 1 Task 08
     */

    public static void main(String[] args) {

        Scanner qq = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Сколько чисел хочешь ");
        int n = qq.nextInt();
        int [] arr= new int[n];
        int vv=0;
        int xx=0;
        int vv1=0;
        int vv2=0;
        int xx2=0;
        int vv3=0;
        System.out.println("Ну вот и числа твои, ты доволен? ");
        for(int j=0;j<n;j++)
        {arr[j]= rd.nextInt(105);
            System.out.print(arr[j] +" ");
            if (arr[j]>vv) {vv = arr[j];xx = j;}}
        for(int jj=0;jj<n;jj++)
        {if (arr[jj]>vv1&&jj!=xx)
        {vv1 = arr[jj];}}

        Task8PS1.printarr2();Task8PS1.printarr2();System.out.println("Макс сумма ");System.out.print(vv+vv1);
        for(int jjj=0;jjj<n;jjj++)
        {if (arr[jjj]<vv2)
        {vv2 = arr[jjj];xx2 = jjj;}
        else if(jjj==0)
        {vv2 = arr[jjj];xx2 = jjj;}}

        for(int jjjj=0;jjjj<n;jjjj++)
        {
           if(jjjj==0) {if (xx2!=0) {vv3 = arr[0];} else{vv3 = arr[1];}}


            if (arr[jjjj]<vv3&&jjjj!=xx2)
        {vv3 = arr[jjjj];}


        }
        Task8PS1.printarr2();Task8PS1.printarr2();System.out.println("Мин сумма ");
        System.out.print(vv3+vv2);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(vv2);
        System.out.println(vv3);


    }

































    public static void printarr2(){


        System.out.println(" ");

    }


}