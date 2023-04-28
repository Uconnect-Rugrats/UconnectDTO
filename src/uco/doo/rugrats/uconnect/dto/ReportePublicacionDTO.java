package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class ReportePublicacionDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private ParticipanteGrupoDTO autor;
    private CausaReporteDTO causa;
    private LocalDateTime fechaAcusacion;
    private EstadoDTO estado;

    public ReportePublicacionDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionDTO.create());
        setAutor(ParticipanteGrupoDTO.create());
        setCausa(CausaReporteDTO.create());
        setFechaAcusacion(UtilDate.getDefaultValue());
        setEstado(EstadoDTO.create());
    }

    public ReportePublicacionDTO(final UUID identificador,final PublicacionDTO publicacion,final ParticipanteGrupoDTO autor, final CausaReporteDTO causa, final LocalDateTime fechaAcusacion, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setAutor(autor);
        setCausa(causa);
        setFechaAcusacion(fechaAcusacion);
        setEstado(estado);
    }

    public ReportePublicacionDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ReportePublicacionDTO setPublicacion(PublicacionDTO publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
        return this;
    }

    public ReportePublicacionDTO setAutor(ParticipanteGrupoDTO autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoDTO.create());
        return this;
    }

    public ReportePublicacionDTO setCausa(CausaReporteDTO causa) {
        this.causa = UtilObject.getDefault(causa, CausaReporteDTO.create());
        return this;
    }

    public ReportePublicacionDTO setFechaAcusacion(LocalDateTime fechaAcusacion) {
        this.fechaAcusacion = UtilDate.getDefault(fechaAcusacion);
        return this;
    }

    public ReportePublicacionDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionDTO getPublicacion() {
        return publicacion;
    }

    public ParticipanteGrupoDTO getAutor() {
        return autor;
    }

    public CausaReporteDTO getCausa() {
        return causa;
    }

    public LocalDateTime getFechaAcusacion() {
        return fechaAcusacion;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static final ReportePublicacionDTO create(){
        return new ReportePublicacionDTO();
    }
}
