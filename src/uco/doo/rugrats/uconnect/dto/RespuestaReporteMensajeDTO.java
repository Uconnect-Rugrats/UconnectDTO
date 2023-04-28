package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class RespuestaReporteMensajeDTO {
    private UUID identificador;
    private LocalDateTime fechaRespuesta;
    private RespuestaReporteMensajeDTO reporte;
    private EstadoDTO estado;
    private String explicacionVeredicto;
    private EstructuraAdministradorEstructuraDTO administrador;

    public RespuestaReporteMensajeDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setFechaRespuesta(UtilDate.getDefaultValue());
        setReporte(RespuestaReporteMensajeDTO.create());
        setEstado(EstadoDTO.create());
        setExplicacionVeredicto(UtilText.getDefaultValue());
        setAdministrador(EstructuraAdministradorEstructuraDTO.create());
    }

    public RespuestaReporteMensajeDTO(final UUID identificador, final LocalDateTime fechaRespuesta, final RespuestaReporteMensajeDTO reporte, final EstadoDTO estado, final String explicacionVeredicto, final EstructuraAdministradorEstructuraDTO administrador) {
        super();
        setIdentificador(identificador);
        setFechaRespuesta(fechaRespuesta);
        setReporte(reporte);
        setEstado(estado);
        setExplicacionVeredicto(explicacionVeredicto);
        setAdministrador(administrador);
    }

    public RespuestaReporteMensajeDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public RespuestaReporteMensajeDTO setFechaRespuesta(LocalDateTime fechaRespuesta) {
        this.fechaRespuesta = UtilDate.getDefault(fechaRespuesta);
        return this;
    }

    public RespuestaReporteMensajeDTO setReporte(RespuestaReporteMensajeDTO reporte) {
        this.reporte = UtilObject.getDefault(reporte, RespuestaReporteMensajeDTO.create());
        return this;
    }

    public RespuestaReporteMensajeDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public RespuestaReporteMensajeDTO setExplicacionVeredicto(String explicacionVeredicto) {
        this.explicacionVeredicto = UtilText.applyTrim(explicacionVeredicto);
        return this;
    }

    public RespuestaReporteMensajeDTO setAdministrador(EstructuraAdministradorEstructuraDTO administrador) {
        this.administrador = UtilObject.getDefault(administrador, EstructuraAdministradorEstructuraDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public LocalDateTime getFechaRespuesta() {
        return fechaRespuesta;
    }

    public RespuestaReporteMensajeDTO getReporte() {
        return reporte;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public String getExplicacionVeredicto() {
        return explicacionVeredicto;
    }

    public EstructuraAdministradorEstructuraDTO getAdministrador() {
        return administrador;
    }

    public static final RespuestaReporteMensajeDTO create(){
        return new RespuestaReporteMensajeDTO();
    }
}
