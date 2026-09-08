import java.util.Scanner;
class Switch
{
    public static void main(String A[])
    {
       int Std = 0;
       Scanner iobj = new Scanner(System.in);

       System.out.println("Enter Your Standard ");
       
       Std = iobj.nextInt();
       switch(Std)
     {
      case 1:
       System.out.println("9:30 AM");
       break;
      case 2:
       System.out.println("10:30 AM");
       break;
      case 3:
      System.out.println("11:30 AM");
      break;
      default:
      System.out.println("Invalid");  

    }

    }   
}