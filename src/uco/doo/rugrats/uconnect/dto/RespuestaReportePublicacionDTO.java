package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class RespuestaReportePublicacionDTO {
    private UUID identificador;
    private LocalDateTime fechaRespuesta;
    private ReportePublicacionDTO reporte;
    private EstadoDTO estado;
    private String explicacionVeredicto;
    private EstructuraAdministradorEstructuraDTO administrador;

    public RespuestaReportePublicacionDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setFechaRespuesta(UtilDate.getDefaultValue());
        setReporte(ReportePublicacionDTO.create());
        setEstado(EstadoDTO.create());
        setExplicacionVeredicto(UtilText.getDefaultValue());
        setAdministrador(EstructuraAdministradorEstructuraDTO.create());
    }

    public RespuestaReportePublicacionDTO(final UUID identificador, final LocalDateTime fechaRespuesta,final ReportePublicacionDTO reporte,final EstadoDTO estado,final String explicacionVeredicto, final EstructuraAdministradorEstructuraDTO administrador) {
        super();
        setIdentificador(identificador);
        setFechaRespuesta(fechaRespuesta);
        setReporte(reporte);
        setEstado(estado);
        setExplicacionVeredicto(explicacionVeredicto);
        setAdministrador(administrador);
    }

    public RespuestaReportePublicacionDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public RespuestaReportePublicacionDTO setFechaRespuesta(LocalDateTime fechaRespuesta) {
        this.fechaRespuesta = UtilDate.getDefault(fechaRespuesta);
        return this;
    }

    public RespuestaReportePublicacionDTO setReporte(ReportePublicacionDTO reporte) {
        this.reporte = UtilObject.getDefault(reporte, ReportePublicacionDTO.create());
        return this;
    }

    public RespuestaReportePublicacionDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public RespuestaReportePublicacionDTO setExplicacionVeredicto(String explicacionVeredicto) {
        this.explicacionVeredicto = UtilText.applyTrim(explicacionVeredicto);
        return this;
    }

    public RespuestaReportePublicacionDTO setAdministrador(EstructuraAdministradorEstructuraDTO administrador) {
        this.administrador = UtilObject.getDefault(administrador, EstructuraAdministradorEstructuraDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public LocalDateTime getFechaRespuesta() {
        return fechaRespuesta;
    }

    public ReportePublicacionDTO getReporte() {
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

    public static final RespuestaReportePublicacionDTO create(){
        return new RespuestaReportePublicacionDTO();
    }
}
