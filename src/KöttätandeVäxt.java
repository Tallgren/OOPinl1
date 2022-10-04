import javax.swing.*;

public class KöttätandeVäxt extends Växter {

    public KöttätandeVäxt(String namn, double längd) {
        super(namn, längd);
        växtTyp = VäxtTyp.KÖTTÄTANDEVÄXT;
    }

    @Override
    public void Print(Växter element) {
        double mängd = getMängdVätska(element);
        JOptionPane.showMessageDialog(null, "Den köttätande växten " +
                element.namn + " behöver " + mängd + " liter av typen " + VäxtTyp.KÖTTÄTANDEVÄXT.vätska);
    }

    public double getMängdVätska(Växter köttätandeväxt) {
        return 0.1 + (växtTyp.mängd * köttätandeväxt.getLängd());
    }
}
