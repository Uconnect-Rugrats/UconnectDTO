package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class GrupoDTO {
    private UUID identificador;
    private EstructuraDTO estructura;
    private String nombre;
    private EstadoDTO estado;

    public GrupoDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setEstructura(EstructuraDTO.create());
        setNombre(UtilText.getDefaultValue());
        setEstado(EstadoDTO.create());
    }

    public GrupoDTO(final UUID identificador, final EstructuraDTO estructura, final String nombre, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setEstructura(estructura);
        setNombre(nombre);
        setEstado(estado);
    }

    public GrupoDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public GrupoDTO setEstructura(EstructuraDTO estructura) {
        this.estructura = UtilObject.getDefault(estructura, EstructuraDTO.create());
        return this;
    }

    public GrupoDTO setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public GrupoDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public EstructuraDTO getEstructura() {
        return estructura;
    }

    public String getNombre() {
        return nombre;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static GrupoDTO create(){
        return new GrupoDTO();
    }
}
