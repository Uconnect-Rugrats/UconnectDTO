package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class EstructuraAdministradorEstructuraDTO {
    private UUID identificador;
    private AdministradorEstructuraDTO administrador;
    private EstructuraDTO estructura;
    private EstadoDTO estado;

    public EstructuraAdministradorEstructuraDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setAdministrador(AdministradorEstructuraDTO.create());
        setEstructura(EstructuraDTO.create());
        setEstado(EstadoDTO.create());
    }

    public EstructuraAdministradorEstructuraDTO(final UUID identificador, final AdministradorEstructuraDTO administrador, final EstructuraDTO estructura, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setAdministrador(administrador);
        setEstructura(estructura);
        setEstado(estado);
    }

    public EstructuraAdministradorEstructuraDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public EstructuraAdministradorEstructuraDTO setAdministrador(AdministradorEstructuraDTO administrador) {
        this.administrador = UtilObject.getDefault(administrador, AdministradorEstructuraDTO.create());
        return this;
    }

    public EstructuraAdministradorEstructuraDTO setEstructura(EstructuraDTO estructura) {
        this.estructura = UtilObject.getDefault(estructura, EstructuraDTO.create());
        return this;
    }

    public EstructuraAdministradorEstructuraDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public AdministradorEstructuraDTO getAdministrador() {
        return administrador;
    }

    public EstructuraDTO getEstructura() {
        return estructura;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static EstructuraAdministradorEstructuraDTO create(){
        return new EstructuraAdministradorEstructuraDTO();
    }
}
