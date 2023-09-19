import java.util.*;
public class mandn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int sum2=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                sum+=i;
            }
            else{
                sum2+=i;
            }
        }
        int ans = sum-sum2;
        if(ans<0){
            System.out.println(-1*ans);
        }
        else{
        System.out.println(ans);}
    }
}
