package de.marcelhuber.referenzprojektjavase7.view;

/**
 *
 * @author Marcel Huber
 */
public enum EnumUserRole {

    DIREKTOR("Direktor"),
    KONTAKTPERSON("Kontaktperson"),
    EXTERN("Extern"),
    NONE(""),
    BREAK("break"),
    ;
    private boolean loginOK;
    private String userRole;

    private EnumUserRole(String loginTyp) {
        this.userRole = loginTyp;
    }

    public String getLoginTyp() {
        return userRole;
    }

    public boolean isLoginOK() {
        return loginOK;
    }
}
