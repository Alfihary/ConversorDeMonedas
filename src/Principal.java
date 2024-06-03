import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;

public class  Principal {
    public static void main(String[] args) {

        String monedaBase;
        String monedaDestino;
        /*Object [] convertirMonedaTemperatura ={
                "Conversor de Moneda"
        };
        JOptionPane.showInputDialog(null,"Seleccione una opción de Conversion","Menú"
                ,JOptionPane.QUESTION_MESSAGE,null,convertirMonedaTemperatura,convertirMonedaTemperatura[0]);
        */

        double convertirCantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:"));
        JOptionPane.showMessageDialog(null, convertirCantidad);

        Object[] opciones = {
                "Pesos MXN a Dólar", // MXN a USD
                "Pesos MXN a Euros", // MXN a EUR
                "Pesos MXN Libras Esterlinas", // MXN a GBP
                "Pesos MXN Yen Japonés", // MXN a JPY
                "Pesos MXN Won sul-Coreano", // MXN a KRW
                "Dólar a Pesos MXN", // USD a MXN
                "Euros a Pesos MXN", // EUR a MXN
                "Libras Esterlinas a Pesos MXN", // GBP a MXN
                "Yen Japonés a Pesos MXN", // JPY a MXN
                "Won sul-Coreano a Pesos MXN" // KRW a MXN
        };




        String opcion = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas"
                , JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        switch (opcion){

            case "Pesos MXN a Dólar":
                monedaBase = "MXN";
                monedaDestino ="USD";

                System.out.println(monedaBase + " y "+ monedaDestino + " a " +convertirCantidad);
                break;
            case "Pesos MXN a Euros":
                monedaBase = "MXN";
                monedaDestino ="EUR";
                System.out.println(monedaBase + " y "+ monedaDestino);
                break;
            case "Pesos MXN Libras Esterlinas":
                monedaBase = "MXN";
                monedaDestino ="GBP";

                System.out.println(monedaBase + " y "+ monedaDestino);

                break;
            case"Pesos MXN Yen Japonés":
                monedaBase = "MXN";
                monedaDestino ="JPY";

                System.out.println(monedaBase + " y "+ monedaDestino);

                break;

            case"Pesos MXN Won sul-Coreano":
                monedaBase = "MXN";
                monedaDestino ="KRW";
                System.out.println(monedaBase + " y "+ monedaDestino);

                break;

            case"Dólar a Pesos MXN":
                monedaBase = "USD";
                monedaDestino ="MXN";
                System.out.println(monedaBase + " y "+ monedaDestino);
                break;

            case"Euros a Pesos MXN":
                monedaBase = "EUR";
                monedaDestino ="MXN";
                System.out.println(monedaBase + " y "+ monedaDestino);

                break;

            case"Libras Esterlinas a Pesos MXN":
                monedaBase = "GBP";
                monedaDestino ="MXN";
                System.out.println(monedaBase + " y "+ monedaDestino);
                break;

            case"Yen Japonés a Pesos MXN":
                monedaBase = "JPY";
                monedaDestino ="MXN";
                System.out.println(monedaBase + " y "+ monedaDestino);
                break;

            case"Won sul-Coreano a Pesos MXN":
                monedaBase = "kRW";
                monedaDestino ="MXN";
                System.out.println(monedaBase + " y "+ monedaDestino);
                break;

            default:
        }





    }
}


