import javax.swing.*;

//Ärver av klassen växter
public class Kaktus extends Växter {

    public Kaktus(String namn, double längd) {
        super(namn, längd);
        växtTyp = VäxtTyp.KAKTUS;
    }

    //Polymorfism
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
