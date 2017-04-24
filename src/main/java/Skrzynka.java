import java.util.List;

/**
 * Created by franc on 24.04.2017.
 */
public class Skrzynka implements Kontener {
    double waga;
    double cena;
    List<Owoc> zawartosc;
    double podajCene()
    {
        return cena;
    }
   public double podajWage()
    {
    return waga;
    }
   public boolean dodaj(Owoc o)
    {
       if(o.podajWage() + waga < 2)
       {
           zawartosc.add(o);
           cena = cena + o.podajCeneZaKg() * o.podajWage();
           return true;
       }
       else return false;
    }
     public boolean usun(Owoc o)
     {
         if(zawartosc.contains(o))
         {
             zawartosc.remove(o);
             cena = cena - o.podajCeneZaKg() * o.podajWage();
             return true;
         }
         else return false;
     }
    public List<Owoc> pobierzWszystkie()
    {
        return zawartosc;
    }
}
