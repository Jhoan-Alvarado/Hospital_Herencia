package clases;

import java.util.HashMap;
import clases.empleado.EmpleadoPlanilla;
import clases.empleado.EmpleadoEventual;
import clases.empleado.Medico;
public class ModeloDatos {

	
	
 HashMap<String, Paciente> pacientesMap;
 HashMap<String, EmpleadoPlanilla> empleadosPlanillaMap;
 HashMap<String, EmpleadoEventual> empleadoEventualMap;
 HashMap<String, Medico> medicoMap;

 	public ModeloDatos () {
 		
 		pacientesMap = new HashMap<String, Paciente>();
 		empleadoEventualMap = new HashMap<String, EmpleadoEventual>();
 		empleadosPlanillaMap = new HashMap<String, EmpleadoPlanilla>();
 		medicoMap = new HashMap<String, Medico>();
 		
 		
 	}
 	
 	public void registrarPersona (Paciente miPaciente) {
 		
 		pacientesMap.put(miPaciente.getNumeroDeDNI(), miPaciente);
 		System.out.println("Se Ha Registrado el Paciente " + miPaciente.getNombre()+ " Satisfactoriamente");
 	
 	}
 	
 	public void registraPersona( EmpleadoPlanilla miEmPlanilla) {
 			
 		empleadosPlanillaMap .put(miEmPlanilla.getNumeroDeDNI(), miEmPlanilla);
 		System.out.println("Se HA registrado el empleado por planilla" + miEmPlanilla.getNombre()+ " Satisfactoriamente");
 		
 		
 		
 	}
 	
 	public void registraPersona(EmpleadoEventual miEmpEventual) {
 		
 		empleadoEventualMap.put(miEmpEventual.getNumeroDeDNI(), miEmpEventual);
 		System.out.println("Se HA registrado el empleado eventual " + miEmpEventual.getNombre() + " Satisfactoriamente");
 		
 		
 	}
 	public void registraPersona(Medico miMedico) {
 		medicoMap.put(miMedico.getNumeroDeDNI(), miMedico);
 		
 		
		
 			
	}
 
}
