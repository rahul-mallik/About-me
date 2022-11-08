package array;

import java.util.*;

public class boby_question {
    public static int armstrong(int a){
        int sum_d=0;
        while(a>0){
            int r = a%10;
            sum_d = sum_d+(r*r*r);
            a=a/10;
        }
        return sum_d;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n,m;

        System.out.print("enter the first value : ");
        n = sc.nextInt();
        System.out.print("enter the 2nd value(minimum a 3 digit value) : ");
        m = sc.nextInt();

        for (;n<=m; n++){
            int result = armstrong(n);
            if (result == n){
                System.out.println(n+" is an Armstrong no.");
            }else{
                continue;
            }

        }

    }
}
