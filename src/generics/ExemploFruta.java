package generics;

import java.util.ArrayList;
import java.util.List;

public class ExemploFruta {
    public static void main(String args[]) {
        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Banana());
        frutas.add(new Abacate());
        frutas.add(new Laranja());
        imprimirFrutas(frutas);
    }
    private static void imprimirFrutas(List<? extends Fruta> lista) {
        for (Fruta fruta : lista) {
            System.out.println("Código genérico " + fruta + " para lista de frutas.");
        }
    }

}
