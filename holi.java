import java.util.*;
class Holiday{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    String S=sc.nextLine();
    if(S.equalsIgnoreCase("Saturday"))
    {
        System.out.print("Yes");
    }
    else if(S.equalsIgnoreCase("Sunday"))
    {
        System.out.print("Yes");
    }
    else
    {
        System.out.print("No");
    }
}
}
