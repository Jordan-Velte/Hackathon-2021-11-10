public class Workstation extends Hardware{
    int _benchmark;
    
    public Workstation (int preis, String name, String beschreibung, int benchmark){
        super(preis, name, beschreibung);
        setBenchmark(benchmark);
    }
    public void setBenchmark(int benchmark) {
        this._benchmark = benchmark;
    }
    public int getBenchmark() {
        return _benchmark;
    }

}
