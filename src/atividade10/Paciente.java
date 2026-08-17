package atividade10;

public class Paciente {
	private int id;
	
	public Paciente(int id) {
		this.id= id;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "Paciente " + id;
	}
}