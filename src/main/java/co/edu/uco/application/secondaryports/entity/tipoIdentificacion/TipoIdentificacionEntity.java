package co.edu.uco.application.secondaryports.entity.tipoIdentificacion;

import java.util.UUID;

import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tipo_Identificacion")
public class TipoIdentificacionEntity{
	
	@Id
	@Column(name = "id")
	private UUID id;
	@Column(name="tipo")
	private String tipo;
	
	
	public TipoIdentificacionEntity(UUID id, String tipo) {
		setId(id);
		setTipo(tipo);
	}
	public TipoIdentificacionEntity() {
		setId(UUIDHelper.getDefault());
		setTipo(TextHelper.EMPTY);
	}
	
	public static final TipoIdentificacionEntity create() {
		return new TipoIdentificacionEntity();
	}
	public static final TipoIdentificacionEntity create(UUID id) {
		return new TipoIdentificacionEntity(id, TextHelper.EMPTY);
	}
	
	public static final TipoIdentificacionEntity create(UUID id, String tipo) {
		return new TipoIdentificacionEntity(id, tipo);
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
