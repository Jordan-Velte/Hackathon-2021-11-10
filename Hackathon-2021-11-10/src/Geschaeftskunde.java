public class Geschaeftskunde extends Person {
    String _firma;
    public Geschaeftskunde (String vorname, String nachname, String firma){
        super(vorname, nachname);
        setFirma(firma);
    }
    public void setFirma(String firma) {
        this._firma = firma;
    }
    public String getFirma() {
        return _firma;
    }
}
