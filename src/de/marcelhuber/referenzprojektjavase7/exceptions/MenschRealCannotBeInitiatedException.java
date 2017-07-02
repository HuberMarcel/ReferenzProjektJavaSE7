package de.marcelhuber.referenzprojektjavase7.exceptions;

/**
 *
 * @author Marcel Huber
 */
public class MenschRealCannotBeInitiatedException extends NullPointerException {

    public MenschRealCannotBeInitiatedException() {
        super("\nException: Das MenschDaten-Objekt referenziert null!");
    }

//    public MenschRealCannotBeInitiatedException(String text) {
//        super(text);    
//    }
}
