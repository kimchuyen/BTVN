public class bt2 {
    int a=1;
    float b=-3;
    int c = 2;
    double del;
    double cdel;
    double x1;
    double x2;
    double x3;
    void pt()
    {
        del = (double) b*b-4*a*c;
        cdel = Math.sqrt(del);
        x1= (double)(-b-cdel)/(2*a);
        x2= (double)(-b+cdel)/(2*a);
        x3 = (double)(-b/(2*a));
       if (del >0)
       {
        System.out.println("nghiem thu 1 của phuong trinh la: " +x1);
        System.out.println("nghiệm thứ 2 của phương tình là: "+x2);
       } else if (del==0)
       {
        System.out.println("phương trình có nghiệm kép là:" +x3);
       }
       else if(del < 0){
           System.out.println("phuong trinh vo nghiem");
       }

    } 
}
