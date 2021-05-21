import java.util.Scanner;

public class mang2 {
    void matran()
    {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        int d[][]= new int[3][3];
        Scanner sc = new Scanner(System.in);
        // ma tran a
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.println("nhap phần thứ a["+i+"]["+j+"]");
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("mảng vừa nhập:");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println("\n");
        }
        // ma tran b
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.println("nhap phần thứ b["+i+"]["+j+"]");
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println("mảng vừa nhập:");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println("\n");
        }
        // cong hai ma tran
        System.out.println("tong hai ma tram la:");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                c[i][j]= a[i][j]+b[i][j];
                System.out.print(c[i][j]);
            }
            System.out.println("\n");
        }
        // ma tran chuyen vi


    }
}
