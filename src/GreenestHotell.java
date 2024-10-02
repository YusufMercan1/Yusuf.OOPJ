import javax.swing.*;

public class GreenestHotell {
    public static void main(String[] args) {

        Växter[] växters = {
                new Kaktus("Igge", 0.2),
                new Palmer("Laura", 5),
                new KöttätandeVäxter("Meatloaf", 0.7),
                new Palmer("Olof", 1)
        };
        String växtNamn = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");
        boolean växtFound = false;

        for (Växter växter : växters) {
            if (växter.getName().equalsIgnoreCase(växtNamn)) {
                Vätska waterablePlant = (Vätska) växter;
                double amount = waterablePlant.räknaVätskeBehov();
                String message = växter.getName() + " behöver " + amount + " liter " + waterablePlant.getVätsketyp().getBeskrivning() + " per dag.";
                JOptionPane.showMessageDialog(null, message);
                växtFound = true;
                break;
            }

        }
        if (!växtFound) {
            JOptionPane.showMessageDialog(null, "Växten hittades inte!");
        }
    }
}//https://github.com/YusufMercan1/Yusuf.OOPJ