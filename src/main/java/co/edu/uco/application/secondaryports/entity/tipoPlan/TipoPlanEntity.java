package co.edu.uco.application.secondaryports.entity.tipoPlan;

import java.util.UUID;

import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tipo_Plan")
public class TipoPlanEntity {
	
	@Id
	@Column(name = "id")
	private UUID id;
	@Column(name="tipo_plan")
	private String tipo;
	
	
	public TipoPlanEntity() {
		setId(UUIDHelper.getDefault());
		setTipo(TextHelper.EMPTY);
	}
	public TipoPlanEntity(UUID id, String tipo) {
		setId(id);
		setTipo(tipo);
	}
	
	public static final TipoPlanEntity create() {
		return new TipoPlanEntity();
	}
	public static final TipoPlanEntity create(UUID id) {
		return new TipoPlanEntity(id, TextHelper.EMPTY);
	}
	public static final TipoPlanEntity create(UUID id, String tipo) {
		return new TipoPlanEntity(id, tipo);
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = TextHelper.applyTrim(tipo);
	}
	


}
