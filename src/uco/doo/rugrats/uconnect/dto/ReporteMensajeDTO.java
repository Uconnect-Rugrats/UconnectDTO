package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class ReporteMensajeDTO {
    private UUID identificador;
    private MensajeDTO mensaje;
    private ParticipanteGrupoDTO autor;
    private CausaReporteDTO causa;
    private LocalDateTime fechaAcusacion;
    private EstadoDTO estado;

    public ReporteMensajeDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setMensaje(MensajeDTO.create());
        setAutor(ParticipanteGrupoDTO.create());
        setCausa(CausaReporteDTO.create());
        setFechaAcusacion(UtilDate.getDefaultValue());
        setEstado(EstadoDTO.create());
    }

    public ReporteMensajeDTO(final UUID identificador, final MensajeDTO mensaje, final ParticipanteGrupoDTO autor, final CausaReporteDTO causa, final LocalDateTime fechaAcusacion, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setMensaje(mensaje);
        setAutor(autor);
        setCausa(causa);
        setFechaAcusacion(fechaAcusacion);
        setEstado(estado);
    }

    public ReporteMensajeDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ReporteMensajeDTO setMensaje(MensajeDTO mensaje) {
        this.mensaje = UtilObject.getDefault(mensaje, MensajeDTO.create());
        return this;
    }

    public ReporteMensajeDTO setAutor(ParticipanteGrupoDTO autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoDTO.create());
        return this;
    }

    public ReporteMensajeDTO setCausa(CausaReporteDTO causa) {
        this.causa = UtilObject.getDefault(causa, CausaReporteDTO.create());
        return this;
    }

    public ReporteMensajeDTO setFechaAcusacion(LocalDateTime fechaAcusacion) {
        this.fechaAcusacion = UtilDate.getDefault(fechaAcusacion);
        return this;
    }

    public ReporteMensajeDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public MensajeDTO getMensaje() {
        return mensaje;
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

    public static final ReporteMensajeDTO create(){
        return new ReporteMensajeDTO();
    }
}
