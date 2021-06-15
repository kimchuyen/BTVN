import java.util.Scanner;

public class BTVN {
    public void bai1()
    {
        String str = "You Only Live Once. But if You do it right. one is Enough";
        // đến chữ in hoa
        int dem =0;
        for(int i=0; i<str.length();i++)
        {
                if (Character.isUpperCase(str.charAt(i)))
            {
                  dem=dem+1;
            }
        }
        System.out.println("số chữ viết hoa là:"+ dem);
        // in hoa chữ đầu tiên
       char[] charArray = str.toCharArray();
       boolean space = true;
       for(int i=0;i< charArray.length; i++)
       {
           if(Character.isLetter(charArray[i])) {
               if(space) {
                   charArray[i] = Character.toUpperCase(charArray[i]);
                   space = false;
               }
           }
           else {
               space = true;
           }
       }
       str= String.valueOf(charArray);
       System.out.println("chuỗi sau khi đổi:"+str);
       // chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau chấn viết hoa cong lại viết thương
    }
    public void bai2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mật khẩu: ");
        String pw = sc.nextLine();
          if (pw.length()<10){
            System.out.println("Pw yếu");
        }else if(!pw.matches("/[A-Z]/") && pw.matches("/[0-9]/") && pw.matches("[@$!%*?&]"))
        {
            System.out.println("Mk mạnh");
        } else
        System.out.println("Pw chưa đủ mạnh");

    }
    //bài 3
    public void bai3 ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào thang: ");
         int thang = sc.nextInt();
         try {
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
         } catch (Exception e)
         {
             System.out.println("lỗi"+ e.getMessage());
         }

    }
}
