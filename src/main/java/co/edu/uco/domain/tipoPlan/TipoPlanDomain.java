package co.edu.uco.domain.tipoPlan;

import java.util.UUID;

import co.edu.uco.domain.Domain;

public class TipoPlanDomain extends Domain {
	
	private String tipo;
	
	protected TipoPlanDomain(UUID id, String tipo) {
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
