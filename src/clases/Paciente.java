package clases;


import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Paciente extends Persona {

	private int numeroHistoriaClinica;
	private String sexo;
	private String grupoSanguineo;
	private ArrayList<String> listaMedicamentosAlergico;
	public int getNumeroHistoriaClinica() {
		return numeroHistoriaClinica;
	}
	public void setNumeroHistoriaClinica(int numeroHistoriaClinica) {
		this.numeroHistoriaClinica = numeroHistoriaClinica;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}
	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}
	public ArrayList<String> getListaMedicamentosAlergico() {
		return listaMedicamentosAlergico;
	}
	public void setListaMedicamentosAlergico(ArrayList<String> listaMedicamentosAlergico) {
		this.listaMedicamentosAlergico = listaMedicamentosAlergico;
	}

	
	
	@Override
	
	public void registrarDatos () {
		
		super.registrarDatos();
		listaMedicamentosAlergico = new ArrayList<>();
		numeroHistoriaClinica = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la Historia Clinica"));
		sexo = JOptionPane.showInputDialog("Ingrese el sexo");
		grupoSanguineo = JOptionPane.showInputDialog("Ingrese el grupo Sanguineo");
		
		
		String preg = JOptionPane.showInputDialog("¿ Es Alergico a algun medicamento ? INGRESE SI o NO");
		
		if (preg.equalsIgnoreCase("si"))
	
		{
			String medicamentos = "";
			String confirmar = "";
			
			do {
				
				medicamentos = JOptionPane.showInputDialog("Ingrese el medicamento a la cual es alergico");
				
				listaMedicamentosAlergico.add(medicamentos);
				
				confirmar =JOptionPane.showInputDialog("Ingrese SI, si desea continuar");
				
			} while (confirmar.equalsIgnoreCase("si"));
			
			
		}
		
		
	}
			
	
	
}
