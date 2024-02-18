package presentation;

import dao.IDaoImpl;
import metier.MetierImpl;


public class Presentation {
    public static void main(String[] args) {
        IDaoImpl d = new IDaoImpl();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);
        System.out.println("Res="+metier.calcul());
    }
}
