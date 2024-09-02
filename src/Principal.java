import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		

		// Declarar variables

		long imei;
		String marca;
		String modelo;
		float precio;
		LocalDate fechaLanz;

		Celulares celular = null;

		Scanner lectura = null;

		int menuPrinc, submenu, indice;

		// instancia de clase
		LogicaMetodos imp = new LogicaMetodos();

		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1---------ALTA");
			System.out.println("2---------MOSTRAR");
			System.out.println("3---------BUSCAR");
			System.out.println("4---------EDITAR");
			System.out.println("5---------ELIMINAR");
			System.out.println("6---------CONTAR");
			System.out.println("7---------BUSCAR POR MODELO");
			System.out.println("8---------BUSCAR POR MARCA");
			System.out.println("9---------CUANTO DINERO HAY INVERTIDO");
			System.out.println("10---------ELIMINAR POR MODELO");
			System.out.println("11---------SALIR");
			
			
			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();

			switch (menuPrinc) {
			case 1:
				try {
					System.out.println("INGRESE EL IMEI");
					lectura = new Scanner(System.in);
					imei = lectura.nextInt();

					System.out.println("INGRESE LA MARCA");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();

					System.out.println("INGRESE EL MODELO");
					lectura = new Scanner(System.in);
					modelo = lectura.nextLine();

					System.out.println("INGRESE EL PRECIO");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					System.out.println("INGRESE LA FECHA (2024-08-22");
					lectura = new Scanner(System.in);
					String fecha = lectura.nextLine();

					// casteo

					fechaLanz = LocalDate.parse(fecha);

					// crear el objeto

					celular = new Celulares(imei, marca, modelo, precio, fechaLanz);

					// Guardar

					imp.guardar(celular);
					System.out.println("SE GUARDO CON EXITO");

				} catch (Exception e) {

					System.out.println("ERROR AL GUARDAR" + e.getMessage());

				}

				break;

			case 2:

				System.out.println(imp.lista());
				
				
				
				
				break;
			case 3:

				imp.mostrarIndiceMarc();
				System.out.println("INGRESE EL INDICE A BUSCAR");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				// Buscar

				celular = imp.buscar(indice);
				System.out.println("SE ENCONTRO" + celular);

				break;
			case 4:

				imp.mostrarIndiceMarc();
				System.out.println("INGRESE EL INDICE A EDITAR");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				// Buscar

				celular = imp.buscar(indice);
				System.out.println("SE ENCONTRO" + celular);
				
				
				
				//Submenu
				
				
				do {
				
					System.out.println("SUBMENU PARA EDITAR");
					System.out.println("1------ MARCA");
					System.out.println("2------ PRECIO");
					System.out.println("3------ REGRESAR");
					
					lectura=new Scanner (System.in);
					submenu=lectura.nextInt();
					
					switch (submenu) {
					case 1:
						System.out.println("INGRESE LA NUEVA MARCA");
						lectura = new Scanner (System.in);
						marca = lectura.nextLine();
						   
						
						
						// Actualizacion 
						
						
						celular.setMarca(marca);
						imp.editar(indice, celular);
						System.out.println("SE EDITO");
						break;
						
						
						
						
					case 2:
						System.out.println("INGRESE EL NUEVO PRECIO");
						lectura = new Scanner (System.in);
						precio = lectura.nextFloat();
						   
						
						
						// Actualizacion 
						
						
						celular.setPrecio(precio);
						imp.editar(indice, celular);
						System.out.println("SE EDITO");
						break;
					
					
					case 3:
						
						
						
						break;
						
					}
					
					
					
				}while (submenu <3);

				break;
			case 5:
				
				imp.mostrarIndiceMarc();
				
				
				System.out.println("INGRESE EL INDICE A ELIMINAR");
				lectura=new Scanner (System.in);
				indice=lectura.nextInt();
				
				
				//Eliminar
				
				
				imp.eliminar(indice);
				System.out.println("SE ELIMINO");
				
				break;
			case 6:
				break;
			case 7:
				
				//BUSCAR X MODELO
				System.out.println("BUSCAR MODELO");
				
				lectura = new Scanner(System.in);
				modelo=lectura.nextLine();
				imp.BuscarxModelo(modelo);
				
				
				break;
				
				
				
	case 8:
				//BUSCAR X MARCA 
				
				System.out.println("BUSCAR MARCA");
				
				lectura = new Scanner(System.in);
				marca=lectura.nextLine();
				imp.BuscarxMarca(marca);
				
				break;
				
				
				
	case 9:
		//INVENTARIO
		
			
		
		imp.Inventario();
		
		
		
		
		
		
		break;
	case 10:
		
		try {
			
		//Eliminar x modelo
		
			imp.mostrarIndiceMarc();
			
			
			System.out.println("INGRESE LA MARCA A ELIMINAR");
			lectura=new Scanner (System.in);
			indice=lectura.nextInt();
			
			
			//Eliminar
			
			
			imp.eliminar(indice);
			System.out.println("SE ELIMINO");
		
		
		
	
		
		
			}catch(Exception e) {
				
			}
		
		break;
		
			}
		} while (menuPrinc < 11);
	
		
	}


}

