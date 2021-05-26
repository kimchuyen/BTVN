import java.util.Scanner;

public class bai3 {
    void nhap()
    {
        System.out.println("nhap vao phan tu n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n<0)
        {
            System.out.println("nhap lại n");
            n= sc.nextInt();
        }
        float tong =0;
        for (int i=0;i<=n;i++)
        {
            tong+= (float) (2*i+1)/(2*i+2);
        }
        System.out.println("tong là:"+tong);
    }
    void bai5()
    {
        System.out.println("nhap vao so n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n<0)
        {
            System.out.println("nhap lại n");
            n= sc.nextInt();
        }
        int res;
        while (n>0)
        {

        }
        }
}
