package Metodos.collection;
/**
 * 
 * Clase que contiene los atributos de un alumno
 * e implementa la interface {@link Comparable} y como parametro tiene la clase {@link Alumno}.
 *
 */
public class Alumno implements Comparable<Alumno> {
	
	private String nombre;
	private String apellido;
	private int edad;
	private double notas;
	/**
	 * Constructor de la clase {@link Alumno}
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param notas
	 */
	public Alumno(String nombre, String apellido, int edad, double notas){
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.notas = notas;
		
	}
	
	/**
	 * metodo para obtener el atributo nombre de la clase {@link Alumno}
	 * @return nombre.
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * metodo que cambia el estado del atributo nombre de la clase {@link Alumno}.
	 * @param nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * metodo para obtener el atributo apellido de la clase {@link Alumno}.
	 * @return apellido.
	 */
	public String getApellido(){
		return apellido;
	}
	/**
	 * metodo que cambia el estado del atributo apellido de la clase {@link Alumno}.
	 * @param apellido.
	 */
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	/**
	 * metodo para obtener el atributo edad de la clase {@link Alumno}.
	 * @return edad.
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * metodo que cambia el estado del atributo edad de la clase {@link Alumno}.
	 * @param edad.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * metodo para obtener el atributo notas de la clase {@link Alumno}.
	 * @return notas.
	 */
	public double getNotas() {
		return notas;
	}
	/**
	 * metodo que cambia el estado del atributo notas de la clase {@link Alumno}.
	 * @param notas
	 */
	public void setNotas(double notas) {
		this.notas = notas;
	}
	
	/**
	 * metodo encargado de dar formato a la impresion de los datos de la clase {@link Alumno}.
	 */
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", notas=" + notas + "]";
	}
	
	
	/**
	 * metodo de la interface {@link Comparable} que ordena por orden natural los datos.
	 * en este caso ordena de menor a mayor por apellido
	 */
	@Override
	public int compareTo(Alumno al) {
		return this.getApellido().compareTo(al.getApellido());
	}
	
}
