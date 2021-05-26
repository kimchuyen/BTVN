import java.util.Scanner;

public class xemtg {
    void nhap(){
        System.out.println("nhap vao chiều cao tam giac:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n<0)
        {
            System.out.println("nhap lại n");
            n= sc.nextInt();
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
