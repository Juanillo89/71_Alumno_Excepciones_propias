package excepciones;

public class Alumno
{
	private String nombre;
	private int edad;
	private double nota;

	public Alumno(String nombre, int edad) throws EdadNoValidaException
	{
		if(edad < 0)
		{
			throw new EdadNoValidaException("Edad no válida.");
		}
		this.nombre = nombre;
		this.edad = edad;
	}

	public double getNota()
	{
		return nota;
	}
	public void setNota(double nota) throws NotaNoValidaException
	{
		if(nota < 0 || nota > 10)
		{

			throw new NotaNoValidaException("Nota no válida.");
		}
		this.nota = nota;
	}
	public String getNombre()
	{
		return nombre;
	}
	public int getEdad()
	{
		return edad;
	}
}

