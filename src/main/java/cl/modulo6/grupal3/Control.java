package cl.modulo6.grupal3;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.modulo6.grupal3.dao.PersonaDao;
import cl.modulo6.grupal3.model.Persona;

@RestController
@RequestMapping("api/pers")
public class Control {
	
	private final PersonaDao personaDao;
	
	public Control(PersonaDao personaDao) {
		this.personaDao = personaDao;
	}
	
	@GetMapping("/all")
	public List<Persona> findAll(){
		return personaDao.findAll();
	}
	
	@PostMapping("/add")
	public void addPersona(@Validated @RequestBody Persona persona) {
		personaDao.addPersona(persona);
	}
	
}
