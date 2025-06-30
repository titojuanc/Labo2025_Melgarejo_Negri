package RepasoEv0707;

public enum Software {
    MAC_OS(true), WINDOWS(false), LINUX(true), ANDROID(false);
    boolean parche;

    private Software(boolean parche){
        this.parche=parche;
    }

    public boolean isParche() {
        return parche;
    }

    public void setParche(boolean parche) {
        this.parche = parche;
    }
}
