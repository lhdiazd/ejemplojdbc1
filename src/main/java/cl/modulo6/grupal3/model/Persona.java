package cl.modulo6.grupal3.model;

public class Persona {
	private Long id_p;
	private String nombre;
	private String apellido;
	private String email;
	
	public Persona(Long id_p, String nombre, String apellido, String email) {
		super();
		this.id_p = id_p;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Persona [id_p=" + id_p + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + "]";
	}
	public Long getId_p() {
		return id_p;
	}
	public void setId_p(Long id_p) {
		this.id_p = id_p;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
