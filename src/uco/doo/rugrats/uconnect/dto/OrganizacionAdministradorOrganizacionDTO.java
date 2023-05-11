package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class OrganizacionAdministradorOrganizacionDTO {
    private UUID identificador;
    private AdministradorOrganizacionDTO administrador;
    private OrganizacionDTO organizacion;
    private EstadoDTO estado;

    public OrganizacionAdministradorOrganizacionDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setAdministrador(AdministradorOrganizacionDTO.create());
        setOrganizacion(OrganizacionDTO.create());
        setEstado(EstadoDTO.create());
    }

    public OrganizacionAdministradorOrganizacionDTO(final UUID identificador, final AdministradorOrganizacionDTO administrador, final OrganizacionDTO estructura, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setAdministrador(administrador);
        setOrganizacion(estructura);
        setEstado(estado);
    }

    public OrganizacionAdministradorOrganizacionDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public OrganizacionAdministradorOrganizacionDTO setAdministrador(AdministradorOrganizacionDTO administrador) {
        this.administrador = UtilObject.getDefault(administrador, AdministradorOrganizacionDTO.create());
        return this;
    }

    public OrganizacionAdministradorOrganizacionDTO setOrganizacion(OrganizacionDTO estructura) {
        this.organizacion = UtilObject.getDefault(estructura, OrganizacionDTO.create());
        return this;
    }

    public OrganizacionAdministradorOrganizacionDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public AdministradorOrganizacionDTO getAdministrador() {
        return administrador;
    }

    public OrganizacionDTO getOrganizacion() {
        return organizacion;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static OrganizacionAdministradorOrganizacionDTO create(){
        return new OrganizacionAdministradorOrganizacionDTO();
    }
}
