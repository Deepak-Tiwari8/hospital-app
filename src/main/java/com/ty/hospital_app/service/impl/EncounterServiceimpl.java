package com.ty.hospital_app.service.impl;

import com.ty.hospital_app.dao.EncounterInterfaceDao;
import com.ty.hospital_app.dao.impl.EncounterDaoimpl;
import com.ty.hospital_app.dto.Encounter;

public class EncounterServiceimpl implements EncounterInterfaceDao
{
	EncounterDaoimpl encounterDaoimpl = new EncounterDaoimpl();
	@Override
	public Encounter saveEncounter(Encounter encounter) {
		return encounterDaoimpl.saveEncounter(encounter);
	}

}
