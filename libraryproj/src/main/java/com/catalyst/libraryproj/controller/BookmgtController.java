package com.catalyst.libraryproj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.libraryproj.model.BookRegister;
import com.catalyst.libraryproj.repository.BookmgtRepo;

@RestController
@RequestMapping("/api/bookinfo")
public class BookmgtController {
	@Autowired
	BookmgtRepo bookRepo;
	
	@GetMapping("/allbooks")
	public List<BookRegister> getAllStudents(){
		System.out.println("Fetching all books list ....");
		return bookRepo.findAll();				
	}
	
	@PostMapping("/saveBookDetails")
	public BookRegister saveBookDetails(@RequestBody BookRegister bookData) {
		
		BookRegister book = null;
		try {
			book = bookRepo.save(bookData);
			System.out.println("Book Information Saved Successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return book;
		
	}

}
