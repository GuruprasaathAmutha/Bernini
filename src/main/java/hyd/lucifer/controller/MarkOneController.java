package hyd.lucifer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MarkOneController {

	
	@GetMapping("/endpointone")
	public String getMethodName(@RequestParam String param) {
		return "Got it";
	}
	
	
}
