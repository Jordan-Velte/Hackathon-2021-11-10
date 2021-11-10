public class Hardware {
    int _preis;
    String _name;
    String _beschreibung;
    public Hardware (int preis, String name, String beschreibung){
        setBeschreibung(beschreibung);
        setName(name);
        setPreis(preis);
    }
    public void setBeschreibung(String beschreibung) {
        this._beschreibung = beschreibung;
    }
    public void setName(String name) {
        this._name = name;
    }
    public void setPreis(int preis) {
        this._preis = preis;
    }
    public String getBeschreibung() {
        return _beschreibung;
    }
    public String getName() {
        return _name;
    }
    public int getPreis() {
        return _preis;
    }

}
