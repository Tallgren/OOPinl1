import javax.swing.*;

public class Palm extends Växter {

    public Palm(String namn, double längd) {
        super(namn, längd);
        växtTyp = VäxtTyp.PALM;
    }

    @Override
    public void Print(Växter element) {
        double mängd = getMängdVätska(element);
        JOptionPane.showMessageDialog(null,"Palmen " + element.namn +
                            " behöver " + mängd + " liter av typen " + VäxtTyp.PALM.vätska);
    }

    public double getMängdVätska(Växter palm) {
        return växtTyp.mängd * palm.getLängd();
    }
}
