package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class RespuestaReporteComentarioDTO {
    private UUID identificador;
    private LocalDateTime fechaRespuesta;
    private ReporteComentarioDTO reporte;
    private EstadoDTO estado;
    private String explicacionVeredicto;
    private EstructuraAdministradorEstructuraDTO administrador;

    public RespuestaReporteComentarioDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setFechaRespuesta(UtilDate.getDefaultValue());
        setReporte(ReporteComentarioDTO.create());
        setEstado(EstadoDTO.create());
        setExplicacionVeredicto(UtilText.getDefaultValue());
        setAdministrador(EstructuraAdministradorEstructuraDTO.create());
    }

    public RespuestaReporteComentarioDTO(final UUID identificador, final LocalDateTime fechaRespuesta, final ReporteComentarioDTO reporte, final EstadoDTO estado, final String explicacionVeredicto, final EstructuraAdministradorEstructuraDTO administrador) {
        super();
        setIdentificador(identificador);
        setFechaRespuesta(fechaRespuesta);
        setReporte(reporte);
        setEstado(estado);
        setExplicacionVeredicto(explicacionVeredicto);
        setAdministrador(administrador);
    }

    public RespuestaReporteComentarioDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public RespuestaReporteComentarioDTO setFechaRespuesta(LocalDateTime fechaRespuesta) {
        this.fechaRespuesta = UtilDate.getDefault(fechaRespuesta);
        return this;
    }

    public RespuestaReporteComentarioDTO setReporte(ReporteComentarioDTO reporte) {
        this.reporte = UtilObject.getDefault(reporte, ReporteComentarioDTO.create());
        return this;
    }

    public RespuestaReporteComentarioDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public RespuestaReporteComentarioDTO setExplicacionVeredicto(String explicacionVeredicto) {
        this.explicacionVeredicto = UtilText.applyTrim(explicacionVeredicto);
        return this;
    }

    public RespuestaReporteComentarioDTO setAdministrador(EstructuraAdministradorEstructuraDTO administrador) {
        this.administrador = UtilObject.getDefault(administrador, EstructuraAdministradorEstructuraDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public LocalDateTime getFechaRespuesta() {
        return fechaRespuesta;
    }

    public ReporteComentarioDTO getReporte() {
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

    public static final RespuestaReporteComentarioDTO create(){
        return new RespuestaReporteComentarioDTO();
    }
}
