package com.hhx.bookshelf.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * book controller
 *
 * @author huanghuaxin
 * 2020/11/27
 */
@RestController
@RequestMapping("book")
public class BookController {

	@GetMapping(value="hello")
	public String sayHello(){
		return "Hello,world!";
	}
}



