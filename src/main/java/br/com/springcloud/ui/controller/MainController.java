package br.com.springcloud.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.springcloud.client.MarkersRepository;
import br.com.springcloud.client.model.Marker.MarkerList;

@RestController
@RequestMapping("/locations")
public class MainController {
	
	@Autowired
	private MarkersRepository repository;
	
	@RequestMapping(method = RequestMethod.GET)
	public MarkerList findAll() {
		return this.repository.findAll();
	}

}
