package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class PublicacionDTO {
    private UUID identificador;
    private ParticipanteGrupoDTO autor;
    private LocalDateTime fechaPublicacion;
    private String titulo;
    private String contenido;
    private EstadoDTO estado;

    public PublicacionDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setAutor(ParticipanteGrupoDTO.create());
        setFechaPublicacion(UtilDate.getDefaultValue());
        setTitulo(UtilText.getDefaultValue());
        setContenido(UtilText.getDefaultValue());
        setEstado(EstadoDTO.create());
    }

    public PublicacionDTO(final UUID identificador, final ParticipanteGrupoDTO autor, final LocalDateTime fechaPublicacion, final String titulo, final String contenido, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setAutor(autor);
        setFechaPublicacion(fechaPublicacion);
        setTitulo(titulo);
        setContenido(contenido);
        setEstado(estado);
    }

    public PublicacionDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PublicacionDTO setAutor(ParticipanteGrupoDTO autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoDTO.create());
        return this;
    }

    public PublicacionDTO setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = UtilDate.getDefault(fechaPublicacion);
        return this;
    }

    public PublicacionDTO setTitulo(String titulo) {
        this.titulo = UtilText.applyTrim(titulo);
        return this;
    }

    public PublicacionDTO setContenido(String contenido) {
        this.contenido = UtilText.applyTrim(contenido);
        return this;
    }

    public PublicacionDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public ParticipanteGrupoDTO getAutor() {
        return autor;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static final PublicacionDTO create(){
        return new PublicacionDTO();
    }
}
