public class Notebook extends Hardware {
    float _akkulaufzeit;
    public Notebook(int preis, String name, String beschreibung, float akkulaufzeit){
        super(preis, name, beschreibung);
        setAkkulaufzeit(akkulaufzeit);

    }
    public void setAkkulaufzeit(float akkulaufzeit) {
        this._akkulaufzeit = akkulaufzeit;
    }
    public float getAkkulaufzeit() {
        return _akkulaufzeit;
    }
}
