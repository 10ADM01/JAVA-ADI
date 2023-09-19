import java.util.*;

public class reversestring {



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String ab = sc.nextLine();
        for(int i =ab.length()-1;i>-1;i--){
            System.out.print(ab.charAt(i));
        }

    }
}
