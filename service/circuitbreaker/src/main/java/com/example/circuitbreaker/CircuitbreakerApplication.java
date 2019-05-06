package com.example.circuitbreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;

@EnableCircuitBreaker
@RestController
@SpringBootApplication
public class CircuitbreakerApplication {

	@Autowired
	private MenuService menuService;
	
	@Autowired
	private ManageService manageService;

	@Autowired
	private MemberService memberService;

    @Bean
    public RestTemplate rest(RestTemplateBuilder builder) {
        return builder.build();
    }

    @GetMapping("/MenuService")
    public String getArticle() {
        return menuService.testCall();
	}

	@GetMapping("/manage_service")
	public String getMatching(){
		return manageService.testCall();
	}

	@GetMapping("/MemberService")
	public String getAuth(){
		return memberService.testCall();
	}

	public static void main(String[] args) {
		SpringApplication.run(CircuitbreakerApplication.class, args);
	}

}
