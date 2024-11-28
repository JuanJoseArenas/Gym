package co.edu.uco.domain.plan;

import java.util.UUID;

import co.edu.uco.domain.Domain;
import co.edu.uco.domain.tipoIdentificacion.TipoIdentificacionDomain;
import co.edu.uco.domain.tipoPlan.TipoPlanDomain;

public class PlanDomain extends Domain {
	private String name;
	private String lastName;
	private TipoIdentificacionDomain tipoIdentificacionDomain;
	private TipoPlanDomain tipoPlanDomain;
	
	protected PlanDomain(UUID id, String name, String lastName, TipoIdentificacionDomain tipoIdentificacionDomain, TipoPlanDomain tipoPlanDomain) {
		super(id);
		setName(name);
		setLastName(lastName);
		setTipoIdentificacionDomain(tipoIdentificacionDomain);
		setTipoPlanDomain(tipoPlanDomain);
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public TipoIdentificacionDomain getTipoIdentificacionDomain() {
		return tipoIdentificacionDomain;
	}

	public void setTipoIdentificacionDomain(TipoIdentificacionDomain tipoIdentificacionDomain) {
		this.tipoIdentificacionDomain = tipoIdentificacionDomain;
	}

	public TipoPlanDomain getTipoPlanDomain() {
		return tipoPlanDomain;
	}

	public void setTipoPlanDomain(TipoPlanDomain tipoPlanDomain) {
		this.tipoPlanDomain = tipoPlanDomain;
	}
	

}
