package br.com.curso.carlos.demo.Controllers;

import br.com.curso.carlos.demo.converters.Math;
import br.com.curso.carlos.demo.converters.NumberConverter;
import br.com.curso.carlos.demo.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    private Math math = new Math();

    @RequestMapping("/sum/{one}/{two}")
    public Double sum(
            @PathVariable("one") String one,
            @PathVariable("two") String two) throws Exception {

        if(!NumberConverter.isNumeric(one) && !NumberConverter.isNumeric(two))
            throw new UnsupportedMathOperationException("O valor fornecido não e numérico");
    return math.sum(NumberConverter.convertToDouble(one), NumberConverter.convertToDouble(two));
    }

    @RequestMapping("/substract/{one}/{two}")
    public Double substract(
            @PathVariable("one") String one,
            @PathVariable("two") String two) throws Exception {

        if(!NumberConverter.isNumeric(one) && !NumberConverter.isNumeric(two))
            throw new UnsupportedMathOperationException("O valor fornecido não e numérico");
        return math.subtracao(NumberConverter.convertToDouble(one) , NumberConverter.convertToDouble(two));
    }

    @RequestMapping("/multiplec/{one}/{two}")
    public Double multiplec(
            @PathVariable("one") String one,
            @PathVariable("two") String two) throws Exception {

        if(!NumberConverter.isNumeric(one) && !NumberConverter.isNumeric(two))
            throw new UnsupportedMathOperationException("O valor fornecido não e numérico");
        return math.multiplicacao(NumberConverter.convertToDouble(one) , NumberConverter.convertToDouble(two));
    }

    @RequestMapping("/divide/{one}/{two}")
    public Double divide(
            @PathVariable("one") String one,
            @PathVariable("two") String two) throws Exception {

        if(!NumberConverter.isNumeric(one) && !NumberConverter.isNumeric(two))
            throw new UnsupportedMathOperationException("O valor fornecido não e numérico");
        return math.divide(NumberConverter.convertToDouble(one) , NumberConverter.convertToDouble(two));
    }

    @RequestMapping("/media/{one}/{two}")
    public Double media(
            @PathVariable("one") String one,
            @PathVariable("two") String two) throws Exception {

        if(!NumberConverter.isNumeric(one) && !NumberConverter.isNumeric(two))
            throw new UnsupportedMathOperationException("O valor fornecido não e numérico");
        return math.media(NumberConverter.convertToDouble(one) , NumberConverter.convertToDouble(two)) /2;
    }


    @RequestMapping("/squad/{number}")
    public Double squad(
            @PathVariable("number") String number
         ) throws Exception {

        if(!NumberConverter.isNumeric(number))
            throw new UnsupportedMathOperationException("O valor fornecido não e numérico");
        return  math.squad((NumberConverter.convertToDouble(number)));

    }
}
