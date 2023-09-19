import java.sql.SQLOutput;
import java.util.*;
public class numadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String a= String.valueOf(num);
        int n = a.length();
        int eve=0;
        int odd=0;

        for(int i = 0;i<n;i++){
            int ex = Character.getNumericValue(a.charAt(i));
           // System.out.println();
            if(ex%2==0){
                eve +=ex;
            }
            if(ex%2!=0){
                odd+=ex;
            }

        }

        System.out.println(Math.max(eve,odd));
    }
}
