package com.company;

import java.util.Scanner;

public class cn {
    void hcn() {
        System.out.println("nhap vao chiều rộng:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n < 0) {
            System.out.println("nhap lại chiều rộng");
            n = sc.nextInt();
        }
        System.out.println("nhap vao chiều dài :");
        int m= sc.nextInt();
        while (m < 0) {
            System.out.println("nhap lại chiều dài");
            m = sc.nextInt();
        }
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=m;j++)
            {
                System.out.print("*  ");
            }
            System.out.println("\n");
        }

    }
}
