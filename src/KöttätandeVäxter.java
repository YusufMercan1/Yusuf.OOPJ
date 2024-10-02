public class KöttätandeVäxter extends Växter implements Vätska{
  public KöttätandeVäxter(String name, double height){
      super(name, height);
  }

    @Override
    public double räknaVätskeBehov() {
        return 0.1 +(0.2*getHeight());
    }

    @Override
    public Vätsketyp getVätsketyp() {
        return Vätsketyp.PROTEINDRYCK;
    }
}
