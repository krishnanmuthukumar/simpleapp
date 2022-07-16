package org.krish.learn.simpleapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleAppController {

	@GetMapping("/success")
	public ResponseEntity<String> getSuccess() {
		return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	}

	@GetMapping("/error")
	public ResponseEntity<String> getError() throws Exception {
		throw new Exception("ERROR");
	}

}
