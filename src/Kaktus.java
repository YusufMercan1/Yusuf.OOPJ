public class Kaktus extends Växter implements Vätska{
    public Kaktus(String name, double height) {
        super(name, height);
    }
    @Override
    public double räknaVätskeBehov() {
        return 0.02;
    }
    @Override
    public Vätsketyp getVätsketyp() {
        return Vätsketyp.MINERALVATTEN;
    }
}
