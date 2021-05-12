

public class tamgiac {
    int d1= 2;
    int d2= 3;
    int d3 = 4;
    void tg()
    {
       if (d1+d2 >d3 || d1+d3>d2 || d2+d3 >d1 )
       System.out.println("đây là tam giác");
       else if (d1==d2 || d2==d3)
       System.out.println("đây là tam giác cân");
       else System.out.println ("không phải là tam giác");

    }
}
