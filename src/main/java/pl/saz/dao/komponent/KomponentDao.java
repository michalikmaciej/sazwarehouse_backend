package pl.saz.dao.komponent;

import pl.saz.model.komponent.KomponentModel;

import java.util.List;

/**
 * Created by maciej on 01.05.18.
 */
public interface KomponentDao {
    KomponentModel getKomponentByName(String name);
    List<KomponentModel> getAllKomponents();
    KomponentModel saveKomponent(KomponentModel komponentModel);
    KomponentModel updateKomponent(KomponentModel komponentModel);
    boolean deleteKomponent(String kompoenentName);
    boolean deleteKomponentChild(String childName);
}
