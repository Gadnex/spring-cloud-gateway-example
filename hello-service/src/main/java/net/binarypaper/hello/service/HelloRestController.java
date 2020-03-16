package net.binarypaper.hello.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloRestController {

    @GetMapping(path = "{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name;
    }

}
