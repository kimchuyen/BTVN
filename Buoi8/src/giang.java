import java.util.Scanner;

public class giang {
    void nhapday()
    {
        int pt;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua dãy:");
        pt= sc.nextInt();
        int a[]= new int[pt];
        for (int i=0;i<pt;i++) {
            System.out.println("nhap phan tu thu"+i);
            a[i]=sc.nextInt();
            while (a[i]<0){
                System.out.println("nhạp lại phần tử"+i);
                a[i]=sc.nextInt();
            }
            }
        // in dãy
        for (int i=0;i<pt;i++) {
            System.out.println(a[i]);
        }
        System.out.println("\n");
        //tính tổng
        System.out.print("tong dãy là:");
        float tong=0;
        for (int i=0;i<a.length;i++) {
            float temp = (float) 1/a[i];
            tong +=  temp;
        }
        System.out.println(tong);
        }
    }

