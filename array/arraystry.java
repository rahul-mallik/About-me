package array;

import java.util.*;

public class arraystry {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of ur array : ");
        int size = sc.nextInt();
        int num[]= new int [size];

        for(int i =0; i<size;i++){
            System.out.print("Enter an integer : ");
            num[i] = sc.nextInt();
        }
        System.out.print("Enter the value for its index value : ");
        int index = sc.nextInt();

        for(int i = 0; i<size;i++){
            if (num[i]==index){
                System.out.println("Index value of " +index+" is "+i);
            }else{
                continue;
            }
        }

        sc.close();
    }
}
