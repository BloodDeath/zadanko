import java.util.List;

/**
 * Created by franc on 24.04.2017.
 */
public interface Kontener {
   boolean dodaj(Owoc o);
   boolean usun(Owoc o);
    List<Owoc> pobierzWszystkie();
}
