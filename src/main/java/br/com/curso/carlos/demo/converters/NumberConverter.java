package br.com.curso.carlos.demo.converters;

import br.com.curso.carlos.demo.exception.UnsupportedMathOperationException;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) throws IllegalArgumentException {

        if (strNumber == null || strNumber.isEmpty())
            throw new UnsupportedMathOperationException("valor nao informado!");
        String number = strNumber.replace(",", "."); // R$ 5,00 USD 5.00
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String sternum)  {
        if(sternum == null || sternum.isEmpty()) return false;
        String number = sternum.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
