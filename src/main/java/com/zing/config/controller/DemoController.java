/**
 * 
 */
package com.zing.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 48 - Tran Trung Vinh - 18079461
 *
 */
@Controller
public class DemoController {
	@GetMapping("/home")
	public String showHome() {
		return "home";
	}

}
