package br.com.curso.carlos.demo.Controllers;

import br.com.curso.carlos.demo.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api")
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Hello, %s!";


//    @GetMapping("/greeting")
//    public Greeting greeting(@RequestParam(
//            value = "name", defaultValue = "mundo")String name){
//        String content = String.format("Olá, %s!", name);
//        return new Greeting(counter.incrementAndGet(), content);
//    }

    @GetMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "mundo")
            String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
