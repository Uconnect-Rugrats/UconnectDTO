package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilBoolean;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class ParticipanteDTO {
    private UUID identificador;
    private PersonaDTO persona;
    private EstadoDTO estado;
    private boolean estaEstadoRealActivo;

    public ParticipanteDTO(){
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPersona(PersonaDTO.create());
        setEstado(EstadoDTO.create());
        setEstaEstadoRealActivo(UtilBoolean.getDefaultValue());
    }

    public ParticipanteDTO(final UUID identificador, final PersonaDTO persona, final EstadoDTO estado,final boolean estaEstadoRealActivo){
        super();
        setIdentificador(identificador);
        setPersona(persona);
        setEstado(estado);
        setEstaEstadoRealActivo(estaEstadoRealActivo);
    }

    public ParticipanteDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ParticipanteDTO setPersona(PersonaDTO persona) {
        this.persona = UtilObject.getDefault(persona, PersonaDTO.create());
        return this;
    }

    public ParticipanteDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaDTO getPersona() {
        return persona;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static ParticipanteDTO create(){
        return new ParticipanteDTO();
    }

	public boolean isEstaEstadoRealActivo() {
		return estaEstadoRealActivo;
	}

	public ParticipanteDTO setEstaEstadoRealActivo(boolean estaEstadoRealActivo) {
		this.estaEstadoRealActivo = estaEstadoRealActivo;
		return this;
	}
}
