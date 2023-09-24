package com.catalyst.libraryproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalyst.libraryproj.model.BookRegister;

public interface BookmgtRepo extends JpaRepository<BookRegister, Integer> {
	// Nothing here to override
}
