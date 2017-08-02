// das Interface zur Daten-Übertragung bzgl. eines Grundschullehrers
package de.marcelhuber.referenzprojektjavase7.daointerface;

import de.marcelhuber.referenzprojektjavase7.model.GrundschulLehrer;
import java.util.Collection;

/**
 *
 * @author Marcel Huber
 * letzte Änderung: 02.08.2017
 */
public interface InterfaceGrundschulLehrerDao {

    /**
     * die Methode soll alle Grundschullehrer zurückliefern
     *
     * @return eine "Ansammlung" aller Grundschullehrer
     */
    Collection<GrundschulLehrer> findAllGrundschulLehrer();

    /**
     *
     * @param uid: die id des Grundschullehrers
     * @return den zur uid passenden Grundschullehrer
     */
    GrundschulLehrer findGrundschulLehrerById(int uid);

    /**
     * legt einen neuen Grundschullehrer (gsL) an
     *
     * @param gsL der Grundschullehrer gsL, der gespeicher werden soll
     * @return Anzahl der neu angelegten Daten (normalerweise 0 bei Misserfolg,
     * 1 bei Erfolg)
     */
    int create(GrundschulLehrer gsL);
    
    /**
     * löschte einen Grundschullehrer (gsL)
     * @param gsL der Grundschullehrer gsL, der gespeicher werden soll 
     * @return true, falls Löschung erfolgrich, false bei Fehlschlag
     */
    boolean delete(GrundschulLehrer gsL);

    /**
     * 
     * @param gsL der Grunschullehrer wird mit den Daten von gsL geupdatet 
     */
    void update(GrundschulLehrer gsL);
}
