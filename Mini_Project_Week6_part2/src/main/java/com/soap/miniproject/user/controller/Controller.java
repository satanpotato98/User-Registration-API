package com.soap.miniproject.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.soap.miniproject.user.entity.Users;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/project")
public class Controller {
	
	String baseUrl = "http://localhost:9090/user";
	WebClient webClient = WebClient.create(baseUrl);

	@Autowired
	RestTemplate restTemplate;
	
	String Url = "http://localhost:9090/user";
	
	@GetMapping("/getall")
	public   List<Users>  getAll(){
			
			List<Users>  list =restTemplate.getForObject(Url+"/getall",List.class);
		
		
			System.out.println(list);
			
			return list;
	}
	
	@GetMapping("/get/{username}")
	public Mono<Users> getByUserName(@PathVariable String username){
		Mono<Users> mono=webClient.get().
				uri("/get/username/"+username).
				retrieve().
				bodyToMono(Users.class);
		return mono;
	}
	
	@GetMapping(value="getall/xml", produces="application/xml")
	public List<Users> getAllXml(){
		List<Users>  list =restTemplate.getForObject(Url+"/getall",List.class);
		
		
		System.out.println(list);
		
		return list;
	}
	
}
