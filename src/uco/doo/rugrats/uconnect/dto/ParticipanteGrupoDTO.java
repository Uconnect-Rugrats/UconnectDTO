package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilBoolean;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class ParticipanteGrupoDTO {
    private UUID identificador;
    private ParticipanteDTO participante;
    private GrupoDTO grupo;
    private Boolean puedePublicar;
    private EstadoDTO estado;

    public ParticipanteGrupoDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setParticipante(ParticipanteDTO.create());
        setPuedePublicar(UtilBoolean.getDefaultValue());
        setGrupo(GrupoDTO.create());
        setEstado(EstadoDTO.create());
    }

    public ParticipanteGrupoDTO(final UUID identificador, final ParticipanteDTO participante, final Boolean puedePublicar, final GrupoDTO grupo, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setParticipante(participante);
        setPuedePublicar(puedePublicar);
        setGrupo(grupo);
        setEstado(estado);
    }

    public ParticipanteGrupoDTO setPuedePublicar(Boolean puedePublicar) {
        this.puedePublicar = UtilBoolean.getDefault(puedePublicar);
        return this;
    }

    public ParticipanteGrupoDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ParticipanteGrupoDTO setParticipante(ParticipanteDTO participante) {
        this.participante = UtilObject.getDefault(participante, ParticipanteDTO.create());
        return this;
    }

    public ParticipanteGrupoDTO setGrupo(GrupoDTO grupo) {
        this.grupo = UtilObject.getDefault(grupo, GrupoDTO.create());
        return this;
    }

    public ParticipanteGrupoDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public Boolean getPuedePublicar() {
        return puedePublicar;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public ParticipanteDTO getParticipante() {
        return participante;
    }

    public GrupoDTO getGrupo() {
        return grupo;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static ParticipanteGrupoDTO create(){
        return new ParticipanteGrupoDTO();
    }
}
