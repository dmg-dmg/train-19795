package io.choerodon.demo.api.controller.v1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
    @Value("${number}")
    private int number;
    @Value("${name}")
    private String name;

    @GetMapping("/hello")
    public String hello() {
        String ss = "Hello " + number + " " + name;
        return ss;
    }
}
