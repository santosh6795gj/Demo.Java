import java.util.*;
// program Tital : Count Vowels small
// program title:: 25/1/2022/

class prog80
{          int  CountVowels(String str)
        {
              int i = 0, iCnt = 0;
              char ch = 0;

              for ( i = 0; i < str.length(); i++)
              {
                   ch = str.charAt(i);

                   if((ch =='a' ) || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))
                   {
                       iCnt++;
                   }
                ch++;
             }
           return iCnt;
         }
    
          public static void main (String arg[])
         {
          Scanner sobj = new Scanner(System.in);
          String str;
          int iret = 0;

          System.out.println(" Enter String\n");
          str = sobj.nextLine();

          prog80 obj = new prog80();
          iret = obj.  CountVowels (str);

         System.out.println(" CountVowels>>>"+iret);
     }
}