import java.util.Scanner;

public class bai8 {
    void dem()
    {
        String str= "nhap thu chuoi nay xem sao";
        //Scanner nhap = new Scanner(System.in);
        //System.out.println("nhap vao day:");
        int a;
        int b=1;
        for ( a=0; a< str.length(); a++)
        {
            if(str.charAt(a)==' ' && str.charAt(a+1)!=' ')
            {
                b++;
            }
        }
        System.out.println(b);
    }
}
