package site.metacoding.billboard.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/genre/list")
	public String list() {
		return "/genre/list";
	}
}
