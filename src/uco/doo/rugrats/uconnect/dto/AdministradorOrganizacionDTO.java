package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class AdministradorOrganizacionDTO {
    private UUID identificador;
    private PersonaDTO persona;

    public AdministradorOrganizacionDTO(){
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPersona(PersonaDTO.create());
    }

    public AdministradorOrganizacionDTO(final UUID identificador, final PersonaDTO persona){
        super();
        setIdentificador(identificador);
        setPersona(persona);
    }

    public AdministradorOrganizacionDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public AdministradorOrganizacionDTO setPersona(PersonaDTO persona) {
        this.persona = UtilObject.getDefault(persona, PersonaDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaDTO getPersona() {
        return persona;
    }

    public static AdministradorOrganizacionDTO create(){
        return new AdministradorOrganizacionDTO();
    }
}
