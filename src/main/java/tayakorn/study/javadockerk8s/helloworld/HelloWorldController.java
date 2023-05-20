package tayakorn.study.javadockerk8s.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Hello World", description = "Hello World")
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String HelloWeold() {
        return "Hello World";
    }
}