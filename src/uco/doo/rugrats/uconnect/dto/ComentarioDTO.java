package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilBoolean;
import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class ComentarioDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private ComentarioDTO comentarioPadre;
    private LocalDateTime fechaPublicacion;
    private ParticipanteGrupoDTO autor;
    private String contenido;
    private EstadoDTO estado;
    private boolean tienePadre;
    private static final String UUID_PADRE = "";

    private static final ComentarioDTO PADRE = new ComentarioDTO(UtilUUID.generateUUIDFromString(UUID_PADRE),PublicacionDTO.create(),null,UtilDate.getDefaultValue(),ParticipanteGrupoDTO.create(),UtilText.getDefaultValue(),EstadoDTO.create(),UtilBoolean.getDefaultValue());

    public ComentarioDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionDTO.create());
        setComentarioPadre(PADRE); 
        setFechaPublicacion(UtilDate.getDefaultValue());
        setAutor(ParticipanteGrupoDTO.create());
        setContenido(UtilText.getDefaultValue());
        setEstado(EstadoDTO.create());
        setTienePadre(UtilBoolean.getDefaultValue());
        
    }

    public ComentarioDTO(final UUID identificador, final PublicacionDTO publicacion, final ComentarioDTO comentarioPadre, final LocalDateTime fechaPublicacion, final ParticipanteGrupoDTO autor, final String contenido, final EstadoDTO estado,boolean tienePadre) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setComentarioPadre(comentarioPadre);
        setFechaPublicacion(fechaPublicacion);
        setAutor(autor);
        setContenido(contenido);
        setEstado(estado);
        setTienePadre(tienePadre);
    }
    
    
    public final boolean isTienePadre() {
		return tienePadre;
	}

	public final ComentarioDTO setTienePadre(boolean tienePadre) {
		this.tienePadre = UtilBoolean.getDefault(tienePadre);
		return this;
	}

	public ComentarioDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ComentarioDTO setPublicacion(PublicacionDTO publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
        return this;
    }

    public ComentarioDTO setComentarioPadre(ComentarioDTO comentarioPadre) {
    	if(isTienePadre()) {
            this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioDTO.create());
    	}else {
            this.comentarioPadre = PADRE;
    	}
    	return this;
    }

    public ComentarioDTO setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = UtilDate.getDefault(fechaPublicacion);
        return this;
    }

    public ComentarioDTO setAutor(ParticipanteGrupoDTO autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoDTO.create());
        return this;
    }

    public ComentarioDTO setContenido(String contenido) {
        this.contenido = UtilText.applyTrim(contenido);
        return this;
    }

    public ComentarioDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionDTO getPublicacion() {
        return publicacion;
    }

    public ComentarioDTO getComentarioPadre() {
        return comentarioPadre;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public ParticipanteGrupoDTO getAutor() {
        return autor;
    }

    public String getContenido() {
        return contenido;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static final ComentarioDTO create(){
        return new ComentarioDTO();
    }
}
