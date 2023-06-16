package clases.empleado;

import javax.swing.JOptionPane;

public class EmpleadoPlanilla extends Empleado{

	
	private double salaroMesual;
	private double porcentajeAdicionalProHoraExtra;
	
	
	public double getSalaroMesual() {
		return salaroMesual;
	}
	public void setSalaroMesual(double salaroMesual) {
		this.salaroMesual = salaroMesual;
	}
	public double getPorcentajeAdicionalProHoraExtra() {
		return porcentajeAdicionalProHoraExtra;
	}
	public void setPorcentajeAdicionalProHoraExtra(double porcentajeAdicionalProHoraExtra) {
		this.porcentajeAdicionalProHoraExtra = porcentajeAdicionalProHoraExtra;
	}


	@Override
	
	public void registrarDatos() {
		
		super.registrarDatos();
		
		salaroMesual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su Salario Mensual"));
		porcentajeAdicionalProHoraExtra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentuaje Adicional por Hora Extra"));
		
	}
	
	
	
}
