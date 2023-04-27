package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilBoolean;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class ParticipanteGrupo {
    private UUID identificador;
    private ParticipanteDTO participante;
    private GrupoDTO grupo;
    private Boolean puedePublicar;
    private EstadoDTO estado;

    public ParticipanteGrupo() {
        setIdentificador(UtilUUID.getDefaultValue());
        setParticipante(ParticipanteDTO.create());
        setPuedePublicar(UtilBoolean.getDefaultValue());
        setGrupo(GrupoDTO.create());
        setEstado(EstadoDTO.create());
    }

    public ParticipanteGrupo(final UUID identificador, final ParticipanteDTO participante,final Boolean puedePublicar, final GrupoDTO grupo, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setParticipante(participante);
        setPuedePublicar(puedePublicar);
        setGrupo(grupo);
        setEstado(estado);
    }

    public ParticipanteGrupo setPuedePublicar(Boolean puedePublicar) {
        this.puedePublicar = UtilBoolean.getDefault(puedePublicar);
        return this;
    }

    public ParticipanteGrupo setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ParticipanteGrupo setParticipante(ParticipanteDTO participante) {
        this.participante = UtilObject.getDefault(participante, ParticipanteDTO.create());
        return this;
    }

    public ParticipanteGrupo setGrupo(GrupoDTO grupo) {
        this.grupo = UtilObject.getDefault(grupo, GrupoDTO.create());
        return this;
    }

    public ParticipanteGrupo setEstado(EstadoDTO estado) {
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

    public static ParticipanteGrupo create(){
        return new ParticipanteGrupo();
    }
}
