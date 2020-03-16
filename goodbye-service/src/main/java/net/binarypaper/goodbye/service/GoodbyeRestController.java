package net.binarypaper.goodbye.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("goodbye")
public class GoodbyeRestController {

    @GetMapping(path = "{name}")
    public String sayHello(@PathVariable String name) {
        return "Goodbye " + name;
    }

}
