import java.util.*;
public class revereachstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] ans = str.split(" ");
        for(String a:ans){
            StringBuilder rev = new StringBuilder(a);
            rev.reverse();
            System.out.print(rev.toString()+" ");
        }



    }
}
