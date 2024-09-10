import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Mezclar {
    
    static List<Integer> merge(List<Integer> lista1,List<Integer> lista2) {
        List<Integer> listaOUT = new ArrayList<Integer>();

        listaOUT.addAll(lista2);
        listaOUT.addAll(lista1);

        Collections.sort(listaOUT);

        return listaOUT;
    }

    public static void main(String[] args) {
        
        //checar por errores

        String[] entrada1 = args[0].split("[\\s|,|.]");
        String[] entrada2 = args[1].split("[\\s|,|.]");

        int[] entradaInt1 = new int[entrada1.length];
        int[] entradaInt2 = new int[entrada2.length];

        for (int i = 0; i<entrada1.length; i++) {
            entradaInt1[i] = Integer.parseInt(entrada1[i]);
        }

        for (int i = 0; i<entrada2.length; i++) {
            entradaInt2[i] = Integer.parseInt(entrada2[i]);
        }

        List<Integer> resultado = merge(Arrays.stream(entradaInt1).boxed().collect(Collectors.toList()),Arrays.stream(entradaInt2).boxed().collect(Collectors.toList()));

        System.out.println("mezclar la primera lista " + args[0]);
        System.out.println("con la segunda lista " + args[1]);
        System.out.println("nos da esta lista:");
        System.out.println(resultado.toString());

        

    }
}