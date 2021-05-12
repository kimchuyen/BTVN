public class btvn {
    int thang=3;
void dieukienif()
{
   
    if (thang ==1 || thang==3 || thang== 5 || thang==7 || thang==8 || thang==12)
        {
            System.out.println("tháng "+thang+" có 31 ngày");
        }
        else if (thang ==2)
        {
            System.out.print("tháng " +thang+" có 28 hoặc 29 ngày");
        }
        else if (thang==4 || thang==6 || thang== 9 || thang==11 )
        {
            System.out.println("tháng "+thang+" có 30 ngày");
        }
    else System.out.println ("không phải là tháng");
}
void dieukienCase()
{
    switch (thang)
    {
        case 1: System.out.println("tháng " +thang+ " có 31 ngay");
        break;
        case 2: System.out.println("tháng " +thang+ " có 28 hoặc 29 ngay");
        break;
        case 3: System.out.println("tháng " +thang+ " có 31 ngay");
        break;
        case 4: System.out.println("tháng " +thang+ " có 30 ngay");
        break;
        case 5: System.out.println("tháng " +thang+ " có 31 ngay");
        break;
        case 6: System.out.println("tháng " +thang+ " có 30 ngay");
        break;
        case 7: System.out.println("tháng " +thang+ " có 31 ngay");
        break;
        case 8: System.out.println("tháng " +thang+ " có 31 ngay");
        break;
        case 9: System.out.println("tháng " +thang+ " có 30 ngay");
        break;
        case 10: System.out.println("tháng " +thang+ " có 31 ngay");
        break;
        case 11: System.out.println("tháng " +thang+ " có 30 ngay");
        break;
        case 12: System.out.println("tháng " +thang+ " có 31 ngay");
        break;
        
    }
}
}
