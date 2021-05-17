public class bai5{
    String a = "You only live once, but if you do it right, once is enough";
    int i;
   int d=0;
    void dem(){   
        for ( i=0; i <a.length(); i++)
        {
            if (a.charAt(i)=='o')
            {
                System.out.println(i);
            }
        }
    }
    void bt15 ()
    {
        for ( i=0; i <a.length(); i++)
        {
            if (a.charAt(i)=='o')
            {
                d++;
            }
        }
        System.out.println(d);
    }
}