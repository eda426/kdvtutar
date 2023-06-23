import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double paraDeger,kdvTutar,kdvliTutar,kdvOran=0;

      Scanner input=new Scanner(System.in);
      System.out.print("lütfen para degeri giriniz:");
        paraDeger=input.nextDouble();


       if(paraDeger>0 && paraDeger<1000)
       {
           kdvOran=0.18;
       }
       else if(paraDeger>1000)
        {
            kdvOran=0.08;
        }
        kdvTutar=paraDeger*kdvOran;
        kdvliTutar=paraDeger+kdvTutar;

    System.out.println("Kdvsiz Tutar:"+paraDeger);
    System.out.println("Kdv oranı:"+kdvOran);
    System.out.println("Kdv Tutarı:"+kdvTutar);
    System.out.println("kdvli tutar:"+kdvliTutar);


    }
    }
