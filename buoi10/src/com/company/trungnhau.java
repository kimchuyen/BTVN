package com.company;

import java.util.Scanner;

public class trungnhau {
    void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vào chuỗi ký tự");
        String a= sc.nextLine();
        System.out.println( "chuôi là:"+a);
        System.out.println("dãy đã bị xóa trùng nhau");
        StringBuilder b = new StringBuilder(a);
        for (int i=0; i <b.length();i++)
        {
            for (int j=i+1;j<b.length();j++)
            {
                if (b.charAt(i)==b.charAt(j)) {
                    b.deleteCharAt(j);
                }
            }
        }
        System.out.println(b);

    }
}
