package co.edu.uco.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.helpers.UUIDHelper;

public class Domain {
	
	private UUID id;

	protected Domain(UUID id) {
		setId(id);
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
	}
	
	public void generateId() {
		this.id = UUIDHelper.generate();
	}
	

}
