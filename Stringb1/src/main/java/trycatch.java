import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch {

    public void thu()
    {
        try
        {
            int result = 7/0;
            System.out.println(result);
        }catch (Exception e)
        {
            System.out.println("khong the chia 1 số cho 0"+e.toString());
            e.printStackTrace();
        }
        finally {
            System.out.println("khối lệnh này luôn được thực thi");
        }

    }
    public void test()
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap so phan tu cua mang:");
            int size = sc.nextInt();
            int[] arr = new int[size];
        }catch (NegativeArraySizeException ex1)
        {
            System.out.println("khong duoc la so am");
        }
        catch (InputMismatchException ex2)
        {
            System.out.println("khong duoc là chu:");
        }
    }
    public void BMI()
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap chiều cao:");
            Float cc = sc.nextFloat();
            System.out.println("nhap cân nặng:");
            Float cn = sc.nextFloat();
            float bmi = cn/(cc*2);
            System.out.println("chỉ số BMI là:"+bmi);
        }catch (Exception e){
            System.out.println("lỗi"+e.getMessage());
            e.printStackTrace();
        }
    }
    public void thr(){

    }
}
