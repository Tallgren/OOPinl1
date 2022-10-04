import javax.swing.*;
import java.util.ArrayList;

public class Huvudprogram {
    private ArrayList<Växter> setUpPlants() {
        ArrayList<Växter> växtLista = new ArrayList<Växter>();
        växtLista.add(new Kaktus("Igge", 0.2));
        växtLista.add(new Palm("Laura", 5));
        växtLista.add(new KöttätandeVäxt("Meatloaf", 0.7));
        växtLista.add(new Palm("Putte", 1));
        return växtLista;
    }

    public void printOut(ArrayList<Växter> växtLista) {
        String input = JOptionPane.showInputDialog(null, "Vilken växt ska få mat?");
        int counter = 0;

        for (Växter element : växtLista) {


            if (input.equals(element.getNamn())) {
                    element.Print(element);
                    counter++;
            }
        }
        if (counter == 0) {
            JOptionPane.showMessageDialog(null, "Namnet finns inte på växthotellet!");
        }
    }

    public static void main(String[] args) {
        Huvudprogram huvudprogram = new Huvudprogram();
        huvudprogram.printOut(huvudprogram.setUpPlants());
    }
}