// das Interface zur Übertragung der Daten eines Menschen
package de.marcelhuber.referenzprojektjavase7.daointerface;

import de.marcelhuber.referenzprojektjavase7.datensatzklasse.MenschDatenKonkret;
import java.util.Collection;

/**
 *
 * @author Marcel Huber; letzte Änderung: 02.08.2017
 */
public interface InterfaceMenschRealDatenDao {

    Collection<MenschDatenKonkret> findAllMenschRealDaten();

    MenschDatenKonkret findMenschRealDatenById(int uid);

    int create(MenschDatenKonkret mrD);
    // liefert die Anzahl der modifizierten Datensätze zurück, hier erstmal
    // 0 bei Fehlschlag, 1 bei Erfolg

    boolean delete(MenschDatenKonkret mrD);

    void update(MenschDatenKonkret mrD);
}
