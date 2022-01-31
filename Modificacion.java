package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion 
{

	public void main() throws FileNotFoundException, IOException
	{
		System.out.println("Hola, mundo!");
		
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("/Users/Jeronimo Vargas/Documents/DyP O.O/Taller0_Olimpicos/data/atletas.csv");
		System.out.println(calc.paisConMasMedallistas());
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Modificacion Mod = new Modificacion();
		Mod.main();
	}
}
