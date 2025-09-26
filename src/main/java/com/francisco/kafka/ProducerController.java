package com.francisco.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class ProducerController {
    private final KafkaTemplate<String, String> template;
    public ProducerController(KafkaTemplate<String, String> template){ this.template = template; }

    @PostMapping("/produce")
    public String produce(@RequestParam String message){
        template.send("demo-topic", message);
        return "sent";
    }
}
