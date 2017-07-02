package de.marcelhuber.referenzprojektjavase7.daointerface;

import de.marcelhuber.referenzprojektjavase7.datensatzklasse.MenschDatenKonkret;
import java.util.Collection;

/**
 *
 * @author Marcel Huber
 */
public interface InterfaceMenschRealDatenDao {

    Collection<MenschDatenKonkret> findAllMenschRealDaten();

    MenschDatenKonkret findMenschRealDatenById(int uid);

    void create(MenschDatenKonkret mrD);

    void delete(MenschDatenKonkret mrD);

    void update(MenschDatenKonkret mrD);
}
