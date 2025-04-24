package br.com.curso.carlos.demo.converters;

import br.com.curso.carlos.demo.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class Math {


    public Double sum(Double one, Double two) throws Exception {
         return one + two;
    }

    public Double subtracao(Double one, Double two) throws Exception {
        return one - two;
    }


    public Double multiplicacao(Double one, Double two) throws Exception {
        return one * two;
    }


    public Double divide(Double one, Double two) throws Exception {
        return one / two;
    }


    public Double media(Double one, Double two)throws Exception {
        return (one + two) /2;
    }

    public Double squad(Double number) throws Exception {
        return java.lang.Math.sqrt((number));
    }


}
