public class Computer extends Hardware {
   int _extra;
    public Computer (int preis, String name, String beschreibung, int extra){
        super(preis, name, beschreibung);
        setExtra(extra);
    }
    public void setExtra(int extra) {
        this._extra = extra;
    }
    public int getExtra() {
        return _extra;
    }
}
