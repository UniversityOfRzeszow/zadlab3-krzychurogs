package pl.edu.ur.POLab3;

import java.util.Scanner;
public class Main {
    
public void zad1()
{
    Scanner odczyt=new Scanner(System.in);
   
    System.out.println("podaj liczbe");
    int n,dzialanie;
    n=odczyt.nextInt();
  
    System.out.println("podaj opcje: 1.>>,2.<<,3.>>");
      dzialanie=odczyt.nextInt();
    switch(dzialanie)
    {
        case 1:
        {
            System.out.println("o ile bitow chcesz przesunac");
            int liczba;
            liczba=odczyt.nextInt();
            n>>=liczba;
            System.out.println("Oto wynik "+n);
            break;
        }
        case 2:
        {
            System.out.println("o ile bitow chcesz przesunac");
            int liczba;
            liczba=odczyt.nextInt();
            n<<=liczba;
            System.out.println("Oto wynik "+n);
            break;
        }
        case 3:
        {
            System.out.println("o ile bitow chcesz przesunac");
            int liczba;
            liczba=odczyt.nextInt();
            n>>>=liczba;
            System.out.println("Oto wynik "+n);
            break;
        }
    }
}

public void zad2()
{
    //NOT
    boolean x = false;
     System.out.println("Normalna wartosc logiczna dla x: "+x);
     System.out.println("NOT dla x: "+!x);
     //NOR
     
     boolean y = false;
     boolean wynik =x^y;
     System.out.println("Falsz i falsz: "+ wynik); 
     
      x = true;
      y = false;
      wynik =x^y;
     System.out.println("Prawda i falsz: "+ wynik); 
     
      x = false;
      y = true;
      wynik =x^y;
     System.out.println("Falsz i Prawda: "+ wynik); 
     
      x = true;
      y = true;
      wynik =x^y;
     System.out.println("Prawda i prawda: "+ wynik); 
}
public void zad3()
{
     System.out.println("toCharArray() zamienia napis ze Stringa na nową tablice typu char[]");
      String pierwsze = "jd";
            
            char[] a =pierwsze.toCharArray();
            for(int i = 0;i<2;i++)
            {
                System.out.print(" "+a[i]);
            }
      System.out.println("");       
    
     System.out.println("getBytes() zwraca tablice typu byte z danego napisu");
            
        byte[] b =pierwsze.getBytes();
        for(int i = 0;i<2;i++)
            {
                System.out.print(" "+b[i]);
            }
      System.out.println("");  
      System.out.println("boolean equals(String str) zwraca true jesli 2 zmienne typu String sa rowne");
            String c1 = "jd";
            String c2 = "jd";
            
            if(c1.equals(c2))
            {
                System.out.println("dwa napisy sa rowne");
            }
      System.out.println("");   
      System.out.println("boolean equalsIgnoreCase(String str)podobnie jak poprzednia metoda,tylko ignoruje wielkosc liter ");
      String d1="JD";
      String d2="Jd";
      if(d1.equalsIgnoreCase(d2))
            {
                System.out.println("dwa napisy sa rowne");
            }
      System.out.println("int campareTo(String str)porownoje dwa stringi i zwraca wartosc w zaleznosci od wartosci leksograficznej");
     String e1 = "jSd";
     String e2 = "jdSAd";
     int wynik1 = e1.compareTo(e1);
     int wynik2 = e1.compareTo(e2); 
     System.out.println("jak sa takie same "+wynik1+" jak pierwszy jest wiekszy "+wynik2);
     System.out.println("int campareToIgnoreCase(String str),podobnie jak wczensiejsza metoda tylko ignoruje wielkosc liter");
     int wynik3 = e1.compareToIgnoreCase(e1);
     int wynik4 = e1.compareToIgnoreCase(e2);
     System.out.println("jak sa takie same "+wynik3+"jak pierwszy jest wiekszy "+wynik4);
     System.out.println("int indexOf(int i),wyszukuje w zmiennej String podany przez nas znak.Zwraca index pierwszego podanego znaku ");
     String nazwa="rzeszow";
     int wynik5 = nazwa.indexOf('z');
     System.out.println(wynik5);
     System.out.println("int lastIndexOf(int i),podobnie jak wczesniejsza metoda,tylko wyswietla index ostatniego podanego znaku");
     int wynik6=nazwa.lastIndexOf('z');
     System.out.println(wynik6);
     System.out.println("String substring(int startString, int stopString),metoda zwraca czesc wartosc zmiennej typu string(w zaleznosci od tego co podamy w nawiasie)");
     System.out.println(nazwa.substring(0,3));
     System.out.println("String replace(char orginal, char zamiennik),metoda zamienia okreslony znak,podanym przez nas znakiem(np.z na c)");
     System.out.println(nazwa.replace('z','c'));
     System.out.println("String trim(),metoda usuwa indexy na poczatku i koncu zmiennej typu string");
     System.out.println(nazwa.trim());
     System.out.println("String toLowerCase(),metoda zamienia wszystkie litery na male");
     System.out.println(nazwa.toLowerCase());
     System.out.println("String toUpperrCase(),metoda zamienia wszystkie litery na male");
     System.out.println(nazwa.toUpperCase());
        System.out.println("String[] split(String regex),rozdziela String na mniejsze od podanego przez nas znaku");
    for (String retval:nazwa.split("r")) 
    {
         System.out.println(retval);
    }
} 
public static int potega(int podstawa, int wykladnik) 
{
    int wynik=1;
        for(int i=0;i<wykladnik;i++)
        {
          wynik*=podstawa;
        }
     return wynik;   
}

    public static int potegarek(int podstawa, int wykladnik) {
        if (wykladnik == 0) {
            return 1;
        }
        return podstawa * potegarek(podstawa,--wykladnik);
    }

    public static int Fibonacci(int n)
    {
        if ((n == 1) || (n == 2))
        {
            return 1;
        } else 
        {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
  public static void main(String[] args) 
  {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
    
    int n;
    Scanner odczyt=new Scanner(System.in);
    System.out.println("podaj nr zadania(1-5)");
    n=odczyt.nextInt();
    Main ob=new Main();
    
    switch(n)
    {
        case 1:
        {
            ob.zad1();
            break;
        }   
        case 2:
        {
            ob.zad2();
            break;
        }
        case 3:
        {
            ob.zad3();
            break;
        }
        case 4:
        {
            int podstawa,wykladnik;
            System.out.println("podaj podstawe:");
            podstawa=odczyt.nextInt();
            System.out.println("podaj wykladnik: ");
            wykladnik=odczyt.nextInt();
            System.out.println("Potega interacyjnie");
            System.out.println(potega(podstawa,wykladnik));
            System.out.println("Potega rekurencyjnie:");
            System.out.println(potegarek(podstawa,wykladnik));
            break;
        }
        case 5:
        {
            int c;
            System.out.println("Podaj wyraz ciagu fibonacciego: ");
            c=odczyt.nextInt();
            System.out.println("Podany przez ciebie wyraz ciagu ma wartosc "+Fibonacci(c));
            break;
        }    
    }
}
    
    
}
