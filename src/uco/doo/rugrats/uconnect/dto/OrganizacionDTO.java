package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class OrganizacionDTO {
    private UUID identificador;
    private String nombre;
    private String descripcion;
    private TipoOrganizacionDTO tipo;
    private EstadoDTO estado;

    public OrganizacionDTO(){
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setTipo(TipoOrganizacionDTO.create());
        setEstado(EstadoDTO.create());
    }

    public OrganizacionDTO(final UUID identificador, final String nombre, final String descripcion, final TipoOrganizacionDTO tipo, final EstadoDTO estado) {
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
        setTipo(tipo);
        setEstado(estado);
    }

    public OrganizacionDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public OrganizacionDTO setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public OrganizacionDTO setDescripcion(String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public OrganizacionDTO setTipo(TipoOrganizacionDTO tipo) {
        this.tipo = UtilObject.getDefault(tipo, TipoOrganizacionDTO.create());
        return this;
    }

    public OrganizacionDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public TipoOrganizacionDTO getTipo() {
        return tipo;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static OrganizacionDTO create(){
        return new OrganizacionDTO();
    }
}
