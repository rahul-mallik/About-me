package array;
import java.util.*;

public class array2d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of row : ");
        int i= sc.nextInt();
        System.out.print("Enter the size of column : ");
        int j = sc.nextInt();
        int matrix[][]= new int[i][j];
        for(int row = 0 ; row<i;row++){
            for(int column=0;column<j;column++) {
                System.out.print("Enter an integer : ");
                matrix[row][column] = sc.nextInt();
            }
        }

        System.out.print("Enter value for it's index : ");
        int search=sc.nextInt();
        for(int row = 0 ; row<i;row++){
            for(int column=0;column<j;column++) {
                if(matrix[row][column]==search){
                    System.out.print("Index value of "+search+" is : \n Row value= "+row+"\n Column value= "+column);
                }else{
                    continue;
                }
            }
        }

        sc.close();
    }

}
