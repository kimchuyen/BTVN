import java.util.Scanner;

public class nhap {
    void nhap() {
        int b;
        System.out.println("nhap so phan tu cua day:");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        int a[] = new int[b];
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.println("nhap phan tu thu" + i);
            a[i]= sc.nextInt();
            System.out.println(a[i]);
        }
        int c=a[0];
        int d=a[0];
        int e=a[0];
        int demmin=1;
        int demmax=1;
        for (int j=0;j<a.length;j++)
        {
            if(a[j]<c)
            {
                c=a[j];
                demmin=j;
            }
        }
        for (int j=0;j<a.length;j++)
        {
            if (a[j]>d)
            {
                e=d;
                d=a[j];
                demmax=j;
            }else if (e>a[j]){
                e=a[j];
            }
        }
        System.out.println("so lớn nhất là "+d +" có index:"+demmax);
        System.out.println("số bé nhất là:"+c+" có index:"+demmin);
        System.out.println("so lớn thứ 2 là: "+e );


    }

}
