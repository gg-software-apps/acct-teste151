package com.astra.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astra.dto.Teste151DTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class Teste151Controller {

	@GetMapping("/")
	public ResponseEntity<Teste151DTO> index() throws IOException {

		Teste151DTO oTeste151DTO = new Teste151DTO();
		oTeste151DTO.setData("Hello Word");
		return ResponseEntity.ok(oTeste151DTO);
	}

}