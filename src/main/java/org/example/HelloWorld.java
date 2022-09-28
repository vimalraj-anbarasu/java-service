package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    @PostMapping("/maskData")
    public String maskData(@RequestHeader Map<String, String> headers, @RequestBody String payload){
        ObjectMapper objectMapper = new ObjectMapper();
        String output = "";
        try {
            Info info = objectMapper.readValue(payload, Info.class);
            Info maskedInfo = new Info(info.getName(),"LN", 99, "G");
            output = objectMapper.writeValueAsString(maskedInfo);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return output;
    }

}
