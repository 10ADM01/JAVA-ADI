import java.util.*;
public class pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(pas(str));


    }
//    The password should have at least 4 characters.
//    It should have at least 1 digit.
//    It should have one capital letter.
//    It should not have any spaces or obliques (/).
//    The first character should not be a number.
    public static boolean pas(String str)
    {
        if(str.length()<4){
            System.out.println("len");
            return false;
        }
        if(Character.isDigit(str.charAt(0))==true){
            System.out.println("first digit");
            return false;
    }
        boolean dig=false;
        boolean cap = false;
        boolean obli = true;




        for(int i=0;i<str.length();i++){
            char exe = str.charAt(i);
            if(Character.isDigit(exe)==true ){
                dig = true;}
            if(Character.isUpperCase(exe)==true){
            cap=true;}
            if(exe==' ' ||exe=='/'){
                System.out.println("obli");
                obli=false;
            }

        }
        if(dig==true && cap ==true && obli==true){
            return true;
        }
        else{
            System.out.println("last");
        return false;}
    }
}
