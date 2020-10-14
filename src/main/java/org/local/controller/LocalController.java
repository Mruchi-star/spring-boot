package org.local.controller;
import org.local.DAO.LocalDAO;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.atomic.AtomicLong;


@RestController
@RequestMapping
public class LocalController {

	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping(path = "/greet")
	public String greet() {
		System.out.println("Get method entered");
		return "Hello Anshu Mala !!";
	}

	@PostMapping(path = "/revert")
	public String revert( @RequestBody String vars) {
		System.out.println("Post method entered");
		return "hello "+vars;
	}
	@PutMapping(path="/give")   
	public String give (@RequestBody String var) {
		return var;
	}
	
	@GetMapping("/greeting")
	public LocalDAO greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new LocalDAO(counter.incrementAndGet(), String.format(template, name));
	}
	
}
