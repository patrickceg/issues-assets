package org.owasp.wstg.fmtstringvuln.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VulnController {
	
	@GetMapping("/fmtstring")
	public String fmtString(final @RequestParam(value = "userName") String userName) {
		System.out.printf("DEBUG: " + userName);
		return userName;
	}

}
