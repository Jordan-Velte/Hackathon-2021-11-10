import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Hardware> hardware = new ArrayList<Hardware>();
        PC p1 = new PC(300, "Xy", "wasd", "Sasdf");
        PC p2 = new PC(320, "Xay", "wadsd", "Sasadf");
        Geschaeftskunde g1 = new Geschaeftskunde("asd", "dd","as");
        Geschaeftskunde g2 = new Geschaeftskunde("asdd", "ddd","asd");
        Kunde k1 = new Kunde("asdf", "dasd", 234123);
        Kunde k2 = new Kunde("asddf", "ddasd", 2323);
        Mitarbeiter m1 = new Mitarbeiter("asdf", "d");
        Mitarbeiter m3 = new Mitarbeiter("as", "dasdf");
        Notebook n1 = new Notebook(2341, "gig", "asdfasdf", 12341);
        Notebook n2 = new Notebook(21, "giasdfg", "asdfasddsdf", 123412);
        Workstation w1 = new Workstation(23123, "dasd", "asdfas", 61234);
        Workstation w2 = new Workstation(233, "dasdaasdf", "assddfas", 61234);
        ArrayList<Computer> computer = new ArrayList<Computer>();
        computer.add(new Computer(5512, "asdf", "asdf", 123));
        hardware.add(p1);
        hardware.add(p2);
        //double besser
        float maxPreis = 0;
        for (Hardware h : hardware){
            if(h.getPreis() > maxPreis){
                maxPreis = h.getPreis();
            }
        }
        System.out.println(maxPreis);
        
        
        //Besser:
        Hardware maxHardware = hardware.get(0);
        for (Hardware h_lauf : hardware){
            if(h_lauf.getPreis() > maxHardware.getPreis()){
                maxHardware = h_lauf;
            }
        }
    }
}
