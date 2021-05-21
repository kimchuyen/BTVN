import java.util.Scanner;

public class mangda {
    void mangda2()
    {
        int x;
        int y;
        int z;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap phan tư thư x:");
        x= sc.nextInt();
        System.out.println("nhap phần thử thứ y:");
        y= sc.nextInt();
        System.out.println("nhap phần thử thứ z:");
        z= sc.nextInt();
        int a[][][]= new int[x][y][z];
        // nhap mảng đa chiều
        for(int i=0;i<x;i++)
        {
            for (int j=0;j<y;j++)
            {
                for (int k=0;k<z;k++)
                {
                    System.out.println("nhap nhan thu thu:["+x+"]["+y+"]["+k+"]");
                    a[i][j][k]= sc.nextInt();
                }
            }
        }
        // in mảng đa chiều
        for(int i=0;i<x;i++)
        {
            for (int j=0;j<y;j++)
            {
                for (int k=0;k<z;k++)
                {
                    System.out.print(a[i][j][k]);
                }
                System.out.println("\n");
            }
        }
        // tong phan thư chia hết cho 5
        int tong=0;
        for(int i=0;i<x;i++)
        {
            for (int j=0;j<y;j++)
            {
                for (int k=0;k<z;k++)
                {
                    if(a[i][j][k] %5==0)
                    {
                       tong=tong+a[i][j][k];
                    }
                }

            }
        }
        System.out.println("tong các số chia hết cho 5 là:"+tong);
    }
}
