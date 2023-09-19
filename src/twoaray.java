import java.util.*;
public class twoaray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("enter the no of rows:");
        int rows= sc.nextInt();
        System.out.println("enter the  no of cols:");
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the num u want to find:");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==x){
                    System.out.println("x found at"+"("+i+","+j+")");
                }
            }
        }


    }

}
