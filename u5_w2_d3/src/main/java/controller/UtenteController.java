package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import entity.Utente;
import service.UsersService;

@RestController
@RequestMapping("/utenti")
public class UtenteController {

	@Autowired
	private UsersService usersService;

	@GetMapping("")
	public Page<Utente> listaUtenti(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size, @RequestParam(defaultValue = "id") String sortBy) {
		return usersService.find(page, size, sortBy);
	}

}
