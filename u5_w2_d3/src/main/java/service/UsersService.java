package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import entity.Utente;
import repository.UserRepository;

public class UsersService {
	@Autowired
	private UserRepository userRepository;

	public Page<Utente> find(int pagina, int grandezza, String ordine) {

		Pageable pageable = PageRequest.of(pagina, grandezza, Sort.by(ordine));

		return userRepository.findAll(pageable);

	}

}
