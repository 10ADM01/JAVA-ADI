import java.util.*;
public class morechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.toLowerCase();
        char x = sc.next().charAt(0);
        int[] alpa = new int[26];
        Arrays.fill(alpa,0);

        for(int i =0;i<str.length();i++){
            int exe =(int) str.charAt(i);
            alpa[exe-97]+=1;
        }
        for(int i =0;i<26;i++){
            System.out.print(alpa[i]);
        }
        System.out.println(" ");

        int max = alpa[0]; // Initialize max to the first element
        int maxIndex = 0;     // Initialize the index of max to 0

        for (int i = 1; i < alpa.length; i++) {
            if (alpa[i] > max) {
                max = alpa[i];  // Update max if a higher value is found
                maxIndex = i;      // Update maxIndex to the current index
            }
        }





        System.out.println(maxIndex);
        char ab = (char)(maxIndex+97);
        String answ = str.replace(ab,x);
        System.out.println(answ);



    }
}
