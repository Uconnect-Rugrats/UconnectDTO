package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class HistorialLecturaDTO {
    private UUID identificador;
    private GrupoDTO grupo;
    private ParticipanteGrupoDTO lector;
    private LocalDateTime fechaLectura;
    private MensajeDTO mensaje;
    private EstadoDTO estado;

    public HistorialLecturaDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setGrupo(GrupoDTO.create());
        setLector(ParticipanteGrupoDTO.create());
        setFechaLectura(UtilDate.getDefaultValue());
        setMensaje(MensajeDTO.create());
        setEstado(EstadoDTO.create());
    }

    public HistorialLecturaDTO(final UUID identificador,final GrupoDTO grupo, final ParticipanteGrupoDTO lector, final LocalDateTime fechaLectura, final MensajeDTO mensaje,final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setGrupo(grupo);
        setLector(lector);
        setFechaLectura(fechaLectura);
        setMensaje(mensaje);
        setEstado(estado);
    }

    public HistorialLecturaDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public HistorialLecturaDTO setGrupo(GrupoDTO grupo) {
        this.grupo = UtilObject.getDefault(grupo, GrupoDTO.create());
        return this;
    }

    public HistorialLecturaDTO setLector(ParticipanteGrupoDTO lector) {
        this.lector = UtilObject.getDefault(lector, ParticipanteGrupoDTO.create());
        return this;
    }

    public HistorialLecturaDTO setFechaLectura(LocalDateTime fechaLectura) {
        this.fechaLectura = UtilDate.getDefault(fechaLectura);
        return this;
    }

    public HistorialLecturaDTO setMensaje(MensajeDTO mensaje) {
        this.mensaje = UtilObject.getDefault(mensaje, MensajeDTO.create());
        return this;
    }

    public HistorialLecturaDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public GrupoDTO getGrupo() {
        return grupo;
    }

    public ParticipanteGrupoDTO getLector() {
        return lector;
    }

    public LocalDateTime getFechaLectura() {
        return fechaLectura;
    }

    public MensajeDTO getMensaje() {
        return mensaje;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static HistorialLecturaDTO create(){
        return new HistorialLecturaDTO();
    }
}
