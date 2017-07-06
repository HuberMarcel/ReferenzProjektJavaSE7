package de.marcelhuber.referenzprojektjavase7.view;

/**
 *
 * @author Marcel Huber
 */
public enum EnumLoginPersonen {

    DIREKTOR("Direktor"),
    KONTAKTPERSON("Kontaktperson"),
    EXTERN("Extern"),;
    private boolean loginOK;
    private String loginTyp;

    private EnumLoginPersonen(String loginTyp) {
        this.loginTyp = loginTyp;
    }

    public String getLoginTyp() {
        return loginTyp;
    }

    public boolean isLoginOK() {
        return loginOK;
    }
}
