package cl.modulo6.grupal3.dao;

import java.util.List;
import java.util.Optional;

import cl.modulo6.grupal3.model.Persona;

public interface PersonaDao {
	
	
	
	List<Persona> findAll();
	long addPersona(Persona persona);
	Optional<Persona> findById(long id);
	
	long deletePersona(Long id_p);
	long updatePersona(long id, Persona persona);
	
}
