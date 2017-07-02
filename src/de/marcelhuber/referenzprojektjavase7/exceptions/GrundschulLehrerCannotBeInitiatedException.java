package de.marcelhuber.referenzprojektjavase7.exceptions;

/**
 *
 * @author Marcel Huber
 */
public class GrundschulLehrerCannotBeInitiatedException extends NullPointerException {

    public GrundschulLehrerCannotBeInitiatedException() {
        super("\nException: Der Grundschullehrer kann nicht erzeugt werden."
                + "Reason: Ein Verweis auf null...");
    }
}
