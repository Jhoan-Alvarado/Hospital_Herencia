package clases.empleado;

import javax.swing.JOptionPane;

public class Medico extends EmpleadoPlanilla{
		
		private String especialiidad;
		private int numeroDeConsultorio;
		public String getEspecialiidad() {
			return especialiidad;
		}
		public void setEspecialiidad(String especialiidad) {
			this.especialiidad = especialiidad;
		}
		public int getNumeroDeConsultorio() {
			return numeroDeConsultorio;
		}
		public void setNumeroDeConsultorio(int numeroDeConsultorio) {
			this.numeroDeConsultorio = numeroDeConsultorio;
		}
		
		
		@Override
		
		public void registrarDatos() {
			super.registrarDatos();
			
			especialiidad = JOptionPane.showInputDialog("Ingrese su Especialidad");
			numeroDeConsultorio = Integer.parseInt(JOptionPane.showInputDialog(""));
			
		}
		
}
