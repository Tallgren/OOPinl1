import javax.swing.*;

public class Kaktus extends Växter {

    public Kaktus(String namn, double längd) {
        super(namn, längd);
        växtTyp = VäxtTyp.KAKTUS;
    }

    @Override
    public void Print(Växter element) {
        double mängd = getMängdVätska(element);
        JOptionPane.showMessageDialog(null,"Kaktusen " + element.namn +
                            " behöver " + mängd + " liter av typen " + VäxtTyp.KAKTUS.vätska);
    }

    public double getMängdVätska(Växter kaktus) {
        return växtTyp.mängd;
    }
}
