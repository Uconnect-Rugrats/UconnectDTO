package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class EstructuraDTO {
    private UUID identificador;
    private OrganizacionDTO organizacion;
    private EstructuraDTO estructuraPadre;
    private String nombre;
    private EstadoDTO estado;

    public EstructuraDTO(final UUID identificador, final OrganizacionDTO organizacion, final EstructuraDTO estructuraPadre, final String nombre, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setOrganizacion(organizacion);
        setEstructuraPadre(estructuraPadre);
        setNombre(nombre);
        setEstado(estado);

    }

    public EstructuraDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setOrganizacion(OrganizacionDTO.create());
        setEstructuraPadre(EstructuraDTO.create());
        setNombre(UtilText.getDefaultValue());
        setEstado(EstadoDTO.create());

    }

    public EstructuraDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public EstructuraDTO setOrganizacion(OrganizacionDTO organizacion) {
        this.organizacion = UtilObject.getDefault(organizacion, OrganizacionDTO.create());
        return this;
    }

    public EstructuraDTO setEstructuraPadre(EstructuraDTO estructuraPadre) {
        this.estructuraPadre = UtilObject.getDefault(estructuraPadre, EstructuraDTO.create());
        return this;
    }

    public EstructuraDTO setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public EstructuraDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public OrganizacionDTO getOrganizacion() {
        return organizacion;
    }

    public EstructuraDTO getEstructuraPadre() {
        return estructuraPadre;
    }

    public String getNombre() {
        return nombre;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static EstructuraDTO create(){
        return new EstructuraDTO();
    }
}
