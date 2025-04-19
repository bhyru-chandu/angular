import java.util.Scanner;
class ReverseString
{
    public static void main(String args[])
    {
        System.out.println("ENTER THE STRING");
        Scanner s=new Scanner(System.in);
        String str=s.next();
        StringBuilder rev=new StringBuilder(str).reverse();
        System.out.println("REVERSED STRING  :  "+rev);
    }
}