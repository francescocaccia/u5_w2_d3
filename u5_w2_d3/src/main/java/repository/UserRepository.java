package repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import entity.Utente;

@Repository
public interface UserRepository extends PagingAndSortingRepository<Utente, UUID> {

}
