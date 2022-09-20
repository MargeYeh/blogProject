package com.tts.myawesomeproject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* controller is responsbile for processing web requests. 
 * Need to annotate to tell Java what the purpose of this class is*/

@RestController

public class MainController {
@RequestMapping("/")
public String mySnazzyHome() {
	return "hello world";
}
}
