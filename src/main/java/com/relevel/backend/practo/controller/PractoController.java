package com.relevel.backend.practo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PractoController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

