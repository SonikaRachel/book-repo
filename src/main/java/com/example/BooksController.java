package com.example;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/book")
public class BooksController {
 @RequestMapping(value="/book1")
 public List<books> getAllBooks()
 {
	return Arrays.asList(
			new books(1l,"a book","sonika")); 
	
 }
}
    