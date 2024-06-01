import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        Object [] convertirMonedaTemperatura ={
                "Conversor de Moneda",
                "Conversor de Temperatura"
        };
        JOptionPane.showInputDialog(null,"Seleccione una opción de Conversion","Menú",JOptionPane.QUESTION_MESSAGE,null,convertirMonedaTemperatura,convertirMonedaTemperatura[0]);


        int montoConvertir = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:"));
        JOptionPane.showMessageDialog(null,montoConvertir);

        Object [] opcionConvertir ={
                "Pesos MXN a Dólar",
                "Pesos MXN a Euros",
                "Pesos MXN Libras Esterlinas",
                "Pesos MXN Yen Japonés",
                "Pesos MXN Won sul-Coreano",
                "Dólar a Pesos MXN",
                "Euros a Pesos MXN",
                "Libras Esterlinas a Pesos MXN",
                "Yen Japonés a Pesos MXN",
                "Won sul-Coreano a Pesos MXN"
        };

        JOptionPane.showInputDialog(null,"Elije la moneda a la que deseas convertir tu dinero","Monedas",JOptionPane.QUESTION_MESSAGE,null,opcionConvertir,opcionConvertir[0]);





    }


}

