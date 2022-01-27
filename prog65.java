import java.util.*;

class prog65 
{    int Deffirnce(int Brr[])
     {
          int i = 0;
          int imax = Brr[0], iMin = Brr[0];
          for(i = 0; i<Brr.length; i++)
          {
              if(Brr[i]< iMin)
              {
                  imax = Brr[i];
              }
            else if(Brr[i] > imax)
              {
                  imax = Brr[i];
              }
           }
         return imax - iMin;
       }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int ino1 = 0, iCnt = 0, iret = 0;

        System.out.println(" Emter Number Of Elements");
        ino1 = sobj.nextInt();

        int Arr[] = new int[ino1];
        System.out.println(" Enter Number");
        for(iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();

        }
     
        prog65 obj = new prog65();
       iret =  obj.Deffirnce(Arr);

      System.out.println(" Deffirance is >>"+iret);
    }

}
