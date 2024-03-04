import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayi,i,bölen_adeti=0;

        Scanner input = new Scanner (System.in);

        System.out.println("lutfen bir sayi giriniz.");
        sayi=input.nextInt();

        for(i=1;i<=sayi;i++)
        {
            if(sayi % i==0)
            {
                bölen_adeti++;
            }
        }

        if(bölen_adeti>2)
        {
            System.out.print("girilen sayi asal sayi degildir.");
        }

        else
        {
            System.out.print("girilen sayi asal sayidir.");
        }


    }
}