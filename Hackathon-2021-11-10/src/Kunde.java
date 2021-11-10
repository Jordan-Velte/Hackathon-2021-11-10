public class Kunde extends Person{
    int _mitarbeiternummer;
    public Kunde (String vorname, String nachname, int mitarbeiternummer){
        super(vorname, nachname);
        setMitarbeiternummer(mitarbeiternummer);
    }
    public void setMitarbeiternummer(int mitarbeiternummer) {
        this._mitarbeiternummer = mitarbeiternummer;
    }
    public int getMitarbeiternummer() {
        return _mitarbeiternummer;
    }
}
