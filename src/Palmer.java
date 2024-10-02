public class Palmer extends Växter implements Vätska{
public Palmer(String name, double height) {
    super(name, height);

}
@Override
 public double räknaVätskeBehov() {
    return 0.5 * getHeight();
}
@Override
public Vätsketyp getVätsketyp() {
        return Vätsketyp.KRANVATTEN;
    }

}
