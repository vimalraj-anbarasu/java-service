package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloWorld {

    @GetMapping("/")
    public String sayHello(@RequestHeader Map<String, String> headers, @RequestBody(required=false) String payload) {
        StringBuilder output = new StringBuilder();
        output.append("ADF Demo - Hello World!! \n");

        headers.forEach((key, value) -> {
            output.append(String.format("Header '%s' = %s \n", key, value));
        });
        output.append("\n\nPayload: " + payload);
        System.out.println(output);
        return output.toString();
    }

}
