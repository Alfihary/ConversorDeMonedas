import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class  Principal {
    public static void main(String[] args) throws IOException {

        String monedaBase;
        String monedaDestino;
        ConsultaConversionMoneda consulta = new ConsultaConversionMoneda();
        GeneradorDeArchivo generador = new GeneradorDeArchivo();

        /*Object [] convertirMonedaTemperatura ={
                "Conversor de Moneda"
        };
        JOptionPane.showInputDialog(null,"Seleccione una opción de Conversion","Menú"
                ,JOptionPane.QUESTION_MESSAGE,null,convertirMonedaTemperatura,convertirMonedaTemperatura[0]);
        */

        try{
            double convertirCantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:"));

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
                    conexionAPI conversion = consulta.convertirMoneda(monedaBase,monedaDestino,convertirCantidad);
                    JOptionPane.showMessageDialog(null, "La conversion de la cantidad: " + convertirCantidad + " " + monedaBase + " a la moneda: " + monedaDestino + " es por la cantidad de: " + conversion.conversion_result());
                    generador.guardarJson(conversion);

                    break;
                case "Pesos MXN a Euros":
                    monedaBase = "MXN";
                    monedaDestino ="EUR";
                    conversion = consulta.convertirMoneda(monedaBase,monedaDestino,convertirCantidad);
                    JOptionPane.showMessageDialog(null, "La conversion de la cantidad: " + convertirCantidad + " " + monedaBase + " a la moneda: " + monedaDestino + " es por la cantidad de: " + conversion.conversion_result());
                    generador.guardarJson(conversion);
                    break;
                case "Pesos MXN Libras Esterlinas":
                    monedaBase = "MXN";
                    monedaDestino ="GBP";
                    conversion = consulta.convertirMoneda(monedaBase,monedaDestino,convertirCantidad);
                    JOptionPane.showMessageDialog(null, "La conversion de la cantidad: " + convertirCantidad + " " + monedaBase + " a la moneda: " + monedaDestino + " es por la cantidad de: " + conversion.conversion_result());
                    generador.guardarJson(conversion);
                    break;
                case"Pesos MXN Yen Japonés":
                    monedaBase = "MXN";
                    monedaDestino ="JPY";
                    conversion = consulta.convertirMoneda(monedaBase,monedaDestino,convertirCantidad);
                    JOptionPane.showMessageDialog(null, "La conversion de la cantidad: " + convertirCantidad + " " + monedaBase + " a la moneda: " + monedaDestino + " es por la cantidad de: " + conversion.conversion_result());
                    generador.guardarJson(conversion);
                    break;

                case"Pesos MXN Won sul-Coreano":
                    monedaBase = "MXN";
                    monedaDestino ="KRW";
                    conversion = consulta.convertirMoneda(monedaBase,monedaDestino,convertirCantidad);
                    JOptionPane.showMessageDialog(null, "La conversion de la cantidad: " + convertirCantidad + " " + monedaBase + " a la moneda: " + monedaDestino + " es por la cantidad de: " + conversion.conversion_result());
                    generador.guardarJson(conversion);
                    break;

                case"Dólar a Pesos MXN":
                    monedaBase = "USD";
                    monedaDestino ="MXN";
                    conversion = consulta.convertirMoneda(monedaBase,monedaDestino,convertirCantidad);
                    JOptionPane.showMessageDialog(null, "La conversion de la cantidad: " + convertirCantidad + " " + monedaBase + " a la moneda: " + monedaDestino + " es por la cantidad de: " + conversion.conversion_result());
                    generador.guardarJson(conversion);
                    break;

                case"Euros a Pesos MXN":
                    monedaBase = "EUR";
                    monedaDestino ="MXN";
                    conversion = consulta.convertirMoneda(monedaBase,monedaDestino,convertirCantidad);
                    JOptionPane.showMessageDialog(null, "La conversion de la cantidad: " + convertirCantidad + " " + monedaBase + " a la moneda: " + monedaDestino + " es por la cantidad de: " + conversion.conversion_result());
                    generador.guardarJson(conversion);
                    break;

                case"Libras Esterlinas a Pesos MXN":
                    monedaBase = "GBP";
                    monedaDestino ="MXN";
                    conversion = consulta.convertirMoneda(monedaBase,monedaDestino,convertirCantidad);
                    JOptionPane.showMessageDialog(null, "La conversion de la cantidad: " + convertirCantidad + " " + monedaBase + " a la moneda: " + monedaDestino + " es por la cantidad de: " + conversion.conversion_result());
                    generador.guardarJson(conversion);
                    break;

                case"Yen Japonés a Pesos MXN":
                    monedaBase = "JPY";
                    monedaDestino ="MXN";
                    conversion = consulta.convertirMoneda(monedaBase,monedaDestino,convertirCantidad);
                    JOptionPane.showMessageDialog(null, "La conversion de la cantidad: " + convertirCantidad + " " + monedaBase + " a la moneda: " + monedaDestino + " es por la cantidad de: " + conversion.conversion_result());
                    generador.guardarJson(conversion);
                    break;

                case"Won sul-Coreano a Pesos MXN":
                    monedaBase = "kRW";
                    monedaDestino ="MXN";
                    conversion = consulta.convertirMoneda(monedaBase,monedaDestino,convertirCantidad);
                    JOptionPane.showMessageDialog(null, "La conversion de la cantidad: " + convertirCantidad + " " + monedaBase + " a la moneda: " + monedaDestino + " es por la cantidad de: " + conversion.conversion_result());
                    generador.guardarJson(conversion);
                    break;

                default:
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Error: El valor ingresado no es un numero. Ingrese un número válido.","Error",JOptionPane.ERROR_MESSAGE);

        }



    }
}


