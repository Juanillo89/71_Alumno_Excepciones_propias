package excepciones;

public class NotaNoValidaException extends Exception
{
	private static final long serialVersionUID = 1L;
	public NotaNoValidaException(String mensaje)
	{
		super(mensaje);
	}
}