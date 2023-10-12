package swarm.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import swarm.domain.item.MasterLot;

@RestController
public class TestController {

    @GetMapping("/")
    public String get() {
        return "hello";
    }

    @GetMapping("/2")
    public String get2() {
        MasterLot.
    }
}
