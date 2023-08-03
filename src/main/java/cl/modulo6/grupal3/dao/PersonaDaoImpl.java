package cl.modulo6.grupal3.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.modulo6.grupal3.model.*;


@Repository
public class PersonaDaoImpl implements PersonaDao{
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public PersonaDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	
	@Override
	public List<Persona> findAll() {
		String sql = """
					SELECT id_p, nombre, apellido, email
					FROM persona;
				""";
		return jdbcTemplate.query(sql,new PersonaRowMapper());
	}

	@Override
	public long addPersona(Persona persona) {
		String sql = """
				INSERT INTO persona(nombre, apellido, email) values(?, ?, ?);
			""";
		return jdbcTemplate.update(sql,
				persona.getNombre(),
				persona.getApellido(),
				persona.getEmail());
	}

	@Override
	public Optional<Persona> findById(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public long deletePersona(Long id_p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long updatePersona(long id, Persona persona) {
		String sql = """
				UPDATE persona set nombre = ?, apellido = ?, email = ?
				WHERE id_p = ?;
			""";
		return jdbcTemplate.update(sql,
				persona.getNombre(),
				persona.getApellido(),
				persona.getEmail(), id);
		
	}

}
