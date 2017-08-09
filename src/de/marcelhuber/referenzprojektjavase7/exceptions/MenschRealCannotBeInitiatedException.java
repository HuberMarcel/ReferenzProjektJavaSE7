package de.marcelhuber.referenzprojektjavase7.exceptions;

/**
 *
 * @author Marcel Huber; letzte Änderung: 09.08.2017
 */
public class MenschRealCannotBeInitiatedException extends NullPointerException {

    public MenschRealCannotBeInitiatedException() {
        super("\nException: Das MenschDaten-Objekt referenziert null!");
    }

//    public MenschRealCannotBeInitiatedException(String text) {
//        super(text);    
//    }
}
