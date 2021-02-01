package br.com.zup.estrelas.marvel.api.service.impl;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import br.com.zup.estrelas.marvel.api.client.MarvelComicsClient;
import br.com.zup.estrelas.marvel.api.response.ComicsResponse;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MarvelServiceImpl {
	
	private static final String PUBLIC_KEY = "21b5b3a86f9ef8b45df0097828036588";
	private static final String PRIVATE_KEY = "6550b15e4e7a27e81b9ff0bbc51b1bfdf6e9e2b3";

	private MarvelComicsClient client;

	public ComicsResponse findAll() {
		Long timeStamp = new Date().getTime();

		return client.getAll(timeStamp, PUBLIC_KEY, buildHash(timeStamp));
	}

	private String buildHash(Long timeStamp) {
		return DigestUtils.md5Hex(timeStamp + PRIVATE_KEY + PUBLIC_KEY);
	}
}
