import java.util.Scanner;

public class Task4PS1 {
    /**
     * @author Burkov Vladimir
     * 01-961
     * Problem Set 1 Task 04
     */
    public static void main(String[] args) {
        Scanner qq = new Scanner(System.in);
        int n = qq.nextInt();int su = 0;int su2=0;
        for(int i =0; i<n; i++)
        {su+=Math.pow(10,i);System.out.println(su);su2+=su;}
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(su2);}}
