package br.com.zup.estrelas.marvel.api.controller;

import static org.springframework.http.HttpStatus.OK;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.estrelas.marvel.api.response.ComicsResponse;
import br.com.zup.estrelas.marvel.api.service.impl.MarvelServiceImpl;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/marvel")
public class MarvelController {

	private MarvelServiceImpl service;

	@ResponseStatus(OK)
	@GetMapping("/comics")
	public ComicsResponse findAll() {
		return service.findAll();
	}
}
