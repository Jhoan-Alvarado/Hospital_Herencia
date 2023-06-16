import javax.swing.JOptionPane;

public class Procesos {
	
	public Procesos() {
		presentarMenuOpciones();	
	}
	
	
		


	private void presentarMenuOpciones () {
		String menu = "MENU HOSPITAL \n\n";
			menu += "1 - Registrar Paciente";
			menu += "2 - Registrar Empleadp";
			menu += "3 - Registar Cita Empleado";
			menu += "4 - Imprimir Informacion";
			menu += "5 - Salir.";
			menu += " Ingrese una Opcion\n";
			
			
			int opcion = 0;
			
			do {
				opcion  =Integer.parseInt(JOptionPane.showInputDialog(menu));
				
				switch (opcion) {
				case 1 : registrarPaciente();	break;
				case 2 : registraEmpleado();	break;
				//case 3 : registrarCitaMedica();	break;
				//case 4 : imprimirInformacion();	break;
				case 5: System.out.println("Gracias Por Utiliza el Programa"); break;
				default: System.out.println("NO EXISTE EL CODIGO INGRESADO!!"); break;
				}
			} while (opcion != 5);
			
			
	}
	
	private void registraEmpleado() {
		// TODO Auto-generated method stub
		
	}





	private void registrarPaciente() {
		
	}

}