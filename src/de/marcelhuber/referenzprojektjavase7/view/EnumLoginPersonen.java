package de.marcelhuber.referenzprojektjavase7.view;

/**
 *
 * @author Marcel Huber
 */
public enum EnumLoginPersonen {
    DIREKTOR, KONTAKTPERSON, EXTERN,;
    private boolean loginOK;

    public boolean isLoginOK() {
        return loginOK;
    }
}
