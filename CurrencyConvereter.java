import java.util.*;
public class CurrencyConvereter 
{
    public static double StartingAmount;

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
    int StartingCurrency;

    System.out.println("Welcome to Currency Converter by Sidiq Moltaet");
    System.out.println();
    System.out.println("1: Rupee    2: Dollar   3: Pound"); 
        StartingCurrency = scanner.nextInt();
    System.out.println();
    System.out.println("What is your starting amount?");
        StartingAmount = scanner.nextInt();

        switch(StartingCurrency)
        {
        case 1:
            rupee();
            break;
        case 2:
            dollar(StartingCurrency);
            break;
        case 3:
            pound(StartingCurrency);
            break;
        }
        scanner.close();
 }
 //global and local variables
    public static void rupee() 
    {
        System.out.println();
        System.out.println("1 Rupee = $0.012");
        System.out.println("1 Rupee = £0.0097");
        System.out.println();

        double RupeeDollar = StartingAmount*.012;
            System.out.println(RupeeDollar);
        
        double RupeePound = StartingAmount*.0097;
            System.out.println(RupeePound);
    }

    public static void dollar(double amount)
    {
        System.out.println();
        System.out.println("1$ = £.80");
        System.out.println("1$ = 82.86 Rupee");
        System.out.println();

        double DollarRupee = StartingAmount*.80;
            System.out.println(DollarRupee);
        
        double DollarPound = StartingAmount*82.86;
            System.out.println(DollarPound);
    }

    public static void pound(double amount)
    {
        System.out.println();
        System.out.println("£1 = 103.01 Rupee");
        System.out.println("1£ = $1.24");
        System.out.println();

        double PoundRupee = StartingAmount*103.01;
            System.out.println(PoundRupee);

        double PoundDollar = StartingAmount*1.24;
            System.out.println(PoundDollar);

    }

}
