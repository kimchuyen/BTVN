public class nguyento {
    boolean SNT(int so) // kt số nguyen tố
    {
        int i=1;
        if (so<2){
            return false;
        }
        for ( i=2; i<= Math.sqrt(so); i++){
            if (so %i==0) {
                return false;
            }
        }
     /*   while(i<so){
          if(so % i ==0)
          {
              return false; 
          }
          i++;
        }*/
        return true;  
    }
    void inNT()
    { 
        int dem=0;
        int j=3;
        while(dem<10)
        {
            if(SNT(j)==true)
            {
                System.out.println(j);
                dem= dem+1;
            }   
            j++;
        }
    }
    void in100(){
        int c=3;
        while(c<100)
        {
            if(SNT(c)==true){
                System.out.println(c);
            }
            c++;
        }

    }
}
