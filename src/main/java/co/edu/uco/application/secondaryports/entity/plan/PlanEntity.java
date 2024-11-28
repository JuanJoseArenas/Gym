package co.edu.uco.application.secondaryports.entity.plan;

import java.util.UUID;

import co.edu.uco.application.secondaryports.entity.tipoIdentificacion.TipoIdentificacionEntity;
import co.edu.uco.application.secondaryports.entity.tipoPlan.TipoPlanEntity;
import co.edu.uco.crosscutting.helpers.ObjectHelper;
import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Plan")
public class PlanEntity {
	
	@Id
	@Column(name= "id")
	private UUID id;
	@Column(name="name")
	private String name;
	@Column(name = "lastName")
	private String lastName;
	
	@ManyToOne
	@JoinColumn(name = "Tipo_Identificacion")
	private TipoIdentificacionEntity tipoIdentificacionEntity;
	@ManyToOne
	@JoinColumn(name ="Tipo_Plan")
	private TipoPlanEntity tipoPlanEntity;
	
    public PlanEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
        setLastName(TextHelper.EMPTY);
        setTipoIdentificacionEntity(TipoIdentificacionEntity.create());
        setTipoPlanEntity(TipoPlanEntity.create());
    }

	public PlanEntity(UUID id, String name, String lastName, TipoIdentificacionEntity tipoIdentificacionEntity,
			TipoPlanEntity tipoPlanEntity) {
        setId(id);
        setName(name);
        setLastName(lastName);
        setTipoIdentificacionEntity(tipoIdentificacionEntity);
        setTipoPlanEntity(tipoPlanEntity);
	}
	public static final PlanEntity create() {
        return new PlanEntity();
    }

    public static final PlanEntity create(UUID id) {
        return new PlanEntity(id, TextHelper.EMPTY, TextHelper.EMPTY, 
                              TipoIdentificacionEntity.create(), 
                              TipoPlanEntity.create());
    }

    public static final PlanEntity create(UUID id, String name, String lastName, 
                                          TipoIdentificacionEntity tipoIdentificacionEntity, 
                                          TipoPlanEntity tipoPlanEntity) {
        return new PlanEntity(id, name, lastName, tipoIdentificacionEntity, tipoPlanEntity);
    }

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
        this.name = TextHelper.applyTrim(name);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
        this.lastName = TextHelper.applyTrim(lastName);	}

	public TipoIdentificacionEntity getTipoIdentificacionEntity() {
		return tipoIdentificacionEntity;
	}

	public void setTipoIdentificacionEntity(TipoIdentificacionEntity tipoIdentificacionEntity) {
		this.tipoIdentificacionEntity = ObjectHelper.getDefault(tipoIdentificacionEntity, TipoIdentificacionEntity.create());
	}

	public TipoPlanEntity getTipoPlanEntity() {
		return tipoPlanEntity;
	}

	public void setTipoPlanEntity(TipoPlanEntity tipoPlanEntity) {
		this.tipoPlanEntity = ObjectHelper.getDefault(tipoPlanEntity, TipoPlanEntity.create());
	}
	
	
	
	
	
	
	
	
}