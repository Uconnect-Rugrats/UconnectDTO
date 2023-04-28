package uco.doo.rugrats.uconnect.dto;


import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;


public final class EstadoDTO {

    private UUID identificador;
    private String nombre;
    private String descripcion;
    private TipoEstadoDTO tipoEstado;

    public EstadoDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setTipoEstado(TipoEstadoDTO.create());
    }


    public EstadoDTO(final UUID identificador, final String nombre, final String descripcion,final TipoEstadoDTO tipoEstado) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
        setTipoEstado(tipoEstado);
    }

    public final EstadoDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public final EstadoDTO setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public EstadoDTO setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public final EstadoDTO setTipoEstado(final TipoEstadoDTO tipoEstado) {
        this.tipoEstado = UtilObject.getDefault(tipoEstado, TipoEstadoDTO.create());
        return this;
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final String getNombre() {
        return nombre;
    }

    public final TipoEstadoDTO getTipoEstado() {
        return tipoEstado;
    }

    public static EstadoDTO create (){
        return new EstadoDTO();
    }
}
