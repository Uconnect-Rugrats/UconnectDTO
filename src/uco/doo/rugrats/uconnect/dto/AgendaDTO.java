package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class AgendaDTO {
    private UUID identificador;
    private GrupoDTO grupo;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private EstadoDTO estado;

    public AgendaDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setGrupo(GrupoDTO.create());
        setFechaInicio(UtilDate.getDefaultValue());
        setFechaFin(UtilDate.getDefaultValue());
        setEstado(EstadoDTO.create());
    }


    public AgendaDTO(final UUID identificador,final GrupoDTO grupo, final LocalDateTime fechaInicio, final LocalDateTime fechaFin, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setGrupo(grupo);
        setFechaInicio(fechaInicio);
        setFechaFin(fechaFin);
        setEstado(estado);
    }

    public AgendaDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public AgendaDTO setGrupo(GrupoDTO grupo) {
        this.grupo = UtilObject.getDefault(grupo, GrupoDTO.create());
        return this;
    }

    public AgendaDTO setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = UtilDate.getDefault(fechaInicio);
        return this;
    }

    public AgendaDTO setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = UtilDate.getDefault(fechaFin);
        return this;
    }

    public AgendaDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public GrupoDTO getGrupo() {
        return grupo;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static AgendaDTO create(){
        return new AgendaDTO();
    }
}
