package de.marcelhuber.referenzprojektjavase7.daointerface;

import de.marcelhuber.referenzprojektjavase7.model.GrundschulLehrer;
import java.util.Collection;

/**
 *
 * @author Marcel Huber
 */
public interface InterfaceGrundschulLehrerDao {

    Collection<GrundschulLehrer> findAllGrundschulLehrer();

    GrundschulLehrer findGrundschulLehrerById(int uid);

    void create(GrundschulLehrer gsL);

    void delete(GrundschulLehrer gsL);

    void update(GrundschulLehrer gsL);
}
