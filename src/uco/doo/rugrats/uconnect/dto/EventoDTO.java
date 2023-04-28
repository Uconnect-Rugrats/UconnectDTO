package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class EventoDTO {
    private UUID identificador;
    private AgendaDTO agenda;
    private String nombre;
    private String descripcion;
    private String lugar;
    private EstructuraAdministradorEstructuraDTO organizador;
    private TipoEventoDTO tipo;
    private LocalDateTime fechaEjecucion;
    private EstadoDTO estado;

    public EventoDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setAgenda(AgendaDTO.create());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setLugar(UtilText.getDefaultValue());
        setOrganizador(EstructuraAdministradorEstructuraDTO.create());
        setTipo(TipoEventoDTO.create());
        setFechaEjecucion(UtilDate.getDefaultValue());
        setEstado(EstadoDTO.create());
    }

    public EventoDTO(final UUID identificador, final AgendaDTO agenda,final String nombre,final String descripcion, String lugar,final EstructuraAdministradorEstructuraDTO organizador, final TipoEventoDTO tipo, final LocalDateTime fechaEjecucion, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setAgenda(agenda);
        setNombre(nombre);
        setDescripcion(descripcion);
        setLugar(lugar);
        setOrganizador(organizador);
        setTipo(tipo);
        setFechaEjecucion(fechaEjecucion);
        setEstado(estado);
    }

    public EventoDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public EventoDTO setAgenda(AgendaDTO agenda) {
        this.agenda = UtilObject.getDefault(agenda, AgendaDTO.create());
        return this;
    }

    public EventoDTO setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public EventoDTO setDescripcion(String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public EventoDTO setLugar(String lugar) {
        this.lugar = UtilText.applyTrim(lugar);
        return this;
    }

    public EventoDTO setOrganizador(EstructuraAdministradorEstructuraDTO organizador) {
        this.organizador = UtilObject.getDefault(organizador, EstructuraAdministradorEstructuraDTO.create());
        return this;
    }

    public EventoDTO setTipo(TipoEventoDTO tipo) {
        this.tipo = UtilObject.getDefault(tipo, TipoEventoDTO.create());
        return this;
    }

    public EventoDTO setFechaEjecucion(LocalDateTime fechaEjecucion) {
        this.fechaEjecucion = UtilDate.getDefault(fechaEjecucion);
        return this;
    }

    public EventoDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public AgendaDTO getAgenda() {
        return agenda;
    }

    public String getNombreEvento() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public EstructuraAdministradorEstructuraDTO getOrganizador() {
        return organizador;
    }

    public TipoEventoDTO getTipo() {
        return tipo;
    }

    public LocalDateTime getFechaEjecucion() {
       return fechaEjecucion;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static final EventoDTO create(){
        return new EventoDTO();
    }
}
