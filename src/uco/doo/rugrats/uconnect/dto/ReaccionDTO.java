package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class ReaccionDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private ParticipanteGrupoDTO autor;
    private LocalDateTime fechaReaccion;
    private TipoReaccionDTO tipo;
    private EstadoDTO estado;

    public ReaccionDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionDTO.create());
        setAutor(ParticipanteGrupoDTO.create());
        setFechaReaccion(UtilDate.getDefaultValue());
        setTipo(TipoReaccionDTO.create());
        setEstado(EstadoDTO.create());
    }

    public ReaccionDTO(final UUID identificador, final PublicacionDTO publicacion, final ParticipanteGrupoDTO autor, final LocalDateTime fechaReaccion, final TipoReaccionDTO tipo,final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setAutor(autor);
        setFechaReaccion(fechaReaccion);
        setTipo(tipo);
        setEstado(estado);
    }

    public ReaccionDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ReaccionDTO setPublicacion(PublicacionDTO publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion,  PublicacionDTO.create());
        return this;
    }

    public ReaccionDTO setAutor(ParticipanteGrupoDTO autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoDTO.create());
        return this;
    }

    public ReaccionDTO setFechaReaccion(LocalDateTime fechaReaccion) {
        this.fechaReaccion = UtilDate.getDefault(fechaReaccion);
        return this;
    }

    public ReaccionDTO setTipo(TipoReaccionDTO tipo) {
        this.tipo = UtilObject.getDefault(tipo, TipoReaccionDTO.create());
        return this;
    }

    public ReaccionDTO setEstado(EstadoDTO estado) {
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

    public LocalDateTime getFechaReaccion() {
        return fechaReaccion;
    }

    public TipoReaccionDTO getTipo() {
        return tipo;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static final ReaccionDTO create(){
        return new ReaccionDTO();
    }
}
