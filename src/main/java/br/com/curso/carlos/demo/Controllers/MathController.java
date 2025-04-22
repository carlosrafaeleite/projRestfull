package br.com.curso.carlos.demo.Controllers;

import br.com.curso.carlos.demo.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping("/sum/{one}/{two}")
    public Double sum(
            @PathVariable("one") String one,
            @PathVariable("two") String two) throws Exception {

        if(!isNumeric(one) && !isNumeric(two))
            throw new UnsupportedMathOperationException("O valor fornecido não e numérico");
    return convertToDouble(one) + convertToDouble(two);
    }

    private Double convertToDouble(String strConverter) throws IllegalAccessException {
        if(strConverter == null || strConverter.isEmpty())
            throw new UnsupportedMathOperationException("O valor fornecido não e numérico");
        String number = strConverter.replace(",", ".");
        return Double.parseDouble(strConverter);
    }

    private boolean isNumeric(String sternum)  {
                if(sternum == null || sternum.isEmpty()) return false;
        String number = sternum.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }


}
