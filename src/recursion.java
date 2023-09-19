public class recursion {
    public static void main(String[] args) {
        printnum(10);
        System.out.println("abi eh");
    }

    public static void printnum(int n) {
        if(n==0){
            return;
        }
        int sum;
        System.out.println(n);
        printnum(n-1);
        System.out.println("otha avalo dhan da");

    }
}
