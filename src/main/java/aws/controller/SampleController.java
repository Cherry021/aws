package aws.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aws.model.Book;
import aws.model.Books;

@RestController
@RequestMapping("/sample")
public class SampleController {

	@GetMapping("/version")
	public String getname() {
		return "Success, AWS project is working with v1";
	}
	@PostMapping("/book")
	public String setBook(@Validated @RequestBody Book b ) {
		Books.setBook(b);
		return b.getName()+" inserted successfully";
	}
	@GetMapping("/book")
	public String getBooks() {
		return new Books().toString();
	}
	
}
