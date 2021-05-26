import java.util.Scanner;

public class bai1 {
    void duongcheo() {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap phan tư thư x:");
        x = sc.nextInt();
        System.out.println("nhap phần thử thứ y:");
        y = sc.nextInt();
        int a[][] = new int[x][y];
        // nhap mảng đa chiều
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("nhap nhan thu thu:[" + x + "][" + y + "]");
                a[i][j] = sc.nextInt();
            }
        }
        //in mảng
        System.out.println("mang a la:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("\n");
        }
        // đường chéo chính
        System.out.println("duong cheo chính:");
        int dem = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    System.out.println(a[i][j]);
                    dem = dem + a[i][j];
                }
            }
        }
        System.out.println("tong dương cheo chinh" + dem);
// sắp xếp hàng thứ 2 tăng dần
        int temp=0;
        int k=1;
        int i=1;
        int j=i+1;

            for( i = 0; i<y-1 ; i++)
                for( j = i+1; j<y ; j++)
                    if(a[1][j]>a[1][j-1])
                    {
                        temp = a[1][j];
                        a[1][j] = a[1][j-1];
                        a[1][j-1] = temp;

                    }
            for (i=0;i<a.length;i++)
                for (j=0;j<a.length;j++)
                    System.out.println(a[i][j]);
    }


}
