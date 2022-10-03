import java.util.Scanner;

public class Task5PS1
{
    /**
     * @author Burkov Vladimir
     * 01-961
     * Problem Set 1 Task 05
     */
    public static void main(String[] args) {

        Scanner qq = new Scanner(System.in);
        System.out.print("Ввести двоичный код ");
        int n = qq.nextInt();
        int m = n;
        int sy=0;

if(n>1){
       for (int i = 0; Math.pow(10,i)<=n || 1+Math.pow(10,i)<=n; i++){
           if (m%2==1)
           {
               sy+=1*Math.pow(2,i);
               m=m/10;
           }
           else {
               m=m/10;
           }




       }System.out.println(" ");
    System.out.println(" ");
    System.out.print("10ой системе счисления ");
    System.out.print(sy);}
        else if (n==1) { System.out.print("10ой системе счисления ");
    System.out.print(1);
}else if (n==0) { System.out.print("10ой системе счисления ");
    System.out.print(0);
}
        }





}

