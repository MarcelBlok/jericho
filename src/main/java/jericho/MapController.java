package jericho;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapController {

        @RequestMapping("/")
        public String index() {
            return "Greetings from Jericho!";
        }

}
