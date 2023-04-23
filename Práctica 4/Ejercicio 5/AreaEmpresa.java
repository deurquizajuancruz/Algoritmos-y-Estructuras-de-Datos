package tp04.ejercicio5;

public class AreaEmpresa {
	private String identificacion;
	private int tardanza;

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public int getTardanza() {
		return tardanza;
	}

	public void setTardanza(int tardanza) {
		this.tardanza = tardanza;
	}

	public AreaEmpresa(int tardanza) {
		this.tardanza = tardanza;
	}
	
}
