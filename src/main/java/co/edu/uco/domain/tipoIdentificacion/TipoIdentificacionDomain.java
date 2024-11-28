package co.edu.uco.domain.tipoIdentificacion;

import java.util.UUID;

import co.edu.uco.domain.Domain;

public class TipoIdentificacionDomain extends Domain{
	
	private String tipo;
	
	protected TipoIdentificacionDomain(UUID id, String tipo) {
		super(id);
		setTipo(tipo);
	}

	public String getTipo() {
		return tipo;
	}

	private void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
