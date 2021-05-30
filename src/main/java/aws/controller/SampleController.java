package aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

	@GetMapping("/version")
	public String getname() {
		return "Success, AWS project is working with v1";
	}
}
