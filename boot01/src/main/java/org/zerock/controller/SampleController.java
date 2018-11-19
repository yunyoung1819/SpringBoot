package org.zerock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.SampleVO;

@RestController	// REST 방식의 컨트롤러입니다. 
public class SampleController {
	
	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello World";
	}
	
	// Lombok 적용
	@GetMapping("/sample")
	public SampleVO makeSample() {
		
		SampleVO vo = new SampleVO();
		vo.setVal1("Macbook Pro");
		vo.setVal2("iMac");
		vo.setVal3("Apple Watch4");
		
		System.out.println(vo);
		
		return vo;
		
	}

}
