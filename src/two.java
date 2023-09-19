//reverse and array
import java.util.*;

public class two {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] reverse=new int[size];
        for(int i=0;i<size;i++){
            reverse[i]=sc.nextInt();
        }
    reversee(reverse);
    }
        public static void reversee(int x[]){



            for(int i=x.length-1;i>=0;i--){
                System.out.println(x[i]);
            }


        }
    }

