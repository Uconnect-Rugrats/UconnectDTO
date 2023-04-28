package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class ReporteComentarioDTO {
    private UUID identificador;
    private ComentarioDTO comentario;
    private ParticipanteGrupoDTO autor;
    private CausaReporteDTO causa;
    private LocalDateTime fechaAcusacion;
    private EstadoDTO estado;

    public ReporteComentarioDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setComentario(ComentarioDTO.create());
        setAutor(ParticipanteGrupoDTO.create());
        setCausa(CausaReporteDTO.create());
        setFechaAcusacion(UtilDate.getDefaultValue());
        setEstado(EstadoDTO.create());
    }

    public ReporteComentarioDTO(final UUID identificador, final ComentarioDTO comentario, final ParticipanteGrupoDTO autor, final CausaReporteDTO causa, final LocalDateTime fechaAcusacion, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setComentario(comentario);
        setAutor(autor);
        setCausa(causa);
        setFechaAcusacion(fechaAcusacion);
        setEstado(estado);
    }

    public ReporteComentarioDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ReporteComentarioDTO setComentario(ComentarioDTO comentario) {
        this.comentario = UtilObject.getDefault(comentario, ComentarioDTO.create());
        return this;
    }

    public ReporteComentarioDTO setAutor(ParticipanteGrupoDTO autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoDTO.create());
        return this;
    }

    public ReporteComentarioDTO setCausa(CausaReporteDTO causa) {
        this.causa = UtilObject.getDefault(causa, CausaReporteDTO.create());
        return this;
    }

    public ReporteComentarioDTO setFechaAcusacion(LocalDateTime fechaAcusacion) {
        this.fechaAcusacion = UtilDate.getDefault(fechaAcusacion);
        return this;
    }

    public ReporteComentarioDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public ComentarioDTO getComentario() {
        return comentario;
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

    public static final ReporteComentarioDTO create(){
        return new ReporteComentarioDTO();
    }
}
