package excepciones;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Alumno[] alumnos = new Alumno[2];
		Scanner sc = new Scanner(System.in);
		String nombre;
		int edad;
		int cont = 0;
		double nota;
		while(cont < 5)
		{
			try
			{
				System.out.print("Nombre:");
				nombre = sc.nextLine();
				System.out.print("Edad:");
				edad = Integer.parseInt(sc.nextLine());
				alumnos[cont] = new Alumno(nombre, edad);
				System.out.print("Nota:");
				nota = Double.parseDouble(sc.nextLine());
				alumnos[cont].setNota(nota);
				cont++;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Dato no numérico.");
			}
			catch(NotaNoValidaException e)
			{
				System.out.println(e.getMessage());
			}
			catch(EdadNoValidaException e)
			{
				System.out.println(e.getMessage());
			}
		}
		sc.close();
		System.out.println("Listado de alumnos:");
		for (int i = 0; i < alumnos.length; i++)
		{
			System.out.println("Nombre: " + alumnos[i].getNombre() + " Edad: " + alumnos[i].getEdad());
		}

	}

}

