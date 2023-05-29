package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class PersonaDTO {
    private UUID identificador;
    private TipoIdentificacionDTO tipoIdentificacion;
    private String numeroIdentificacion;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String correo;
    private PaisDTO paisTelefono;
    private String numeroTelefono;
    private EstadoDTO estado;

    public PersonaDTO(){
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setTipoIdentificacion(TipoIdentificacionDTO.create());
        setNumeroIdentificacion(UtilText.getDefaultNumeric());
        setPrimerNombre(UtilText.getDefaultValue());
        setSegundoNombre(UtilText.getDefaultValue());
        setPrimerApellido(UtilText.getDefaultValue());
        setSegundoApellido(UtilText.getDefaultValue());
        setCorreo(UtilText.getDefaultEmailAdress());
        setPaisTelefono(PaisDTO.create());
        setNumeroTelefono(UtilText.getDefaultNumeric());
        setEstado(EstadoDTO.create());
    }

    public PersonaDTO(final UUID identificador,final TipoIdentificacionDTO tipoIdentificacion, final String numeroIdentificacion, final String primerNombre, final String segundoNombre, final String primerApellido, final String segundoApellido, final String correo, final PaisDTO paisTelefono, final String numeroTelefono, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setTipoIdentificacion(tipoIdentificacion);
        setNumeroIdentificacion(numeroIdentificacion);
        setPrimerNombre(primerNombre);
        setSegundoNombre(segundoNombre);
        setPrimerApellido(primerApellido);
        setSegundoApellido(segundoApellido);
        setCorreo(correo);
        setPaisTelefono(paisTelefono);
        setNumeroTelefono(numeroTelefono);
        setEstado(estado);
    }

    public PersonaDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PersonaDTO setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion) {
        this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionDTO.create());
        return this;
    }

    public PersonaDTO setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = UtilText.getUtilText().numericIsValid(UtilText.applyTrim(numeroIdentificacion)) ? UtilText.applyTrim(numeroIdentificacion) : UtilText.getDefaultNumeric();
        return this;
    }

    public PersonaDTO setPrimerNombre(String primerNombre) {
        this.primerNombre = UtilText.applyTrim(primerNombre);
        return this;
    }

    public PersonaDTO setSegundoNombre(String segundoNombre) {
        this.segundoNombre = UtilText.applyTrim(segundoNombre);
        return this;
    }

    public PersonaDTO setPrimerApellido(String primerApellido) {
        this.primerApellido = UtilText.applyTrim(primerApellido);
        return this;
    }

    public PersonaDTO setSegundoApellido(String segundoApellido) {
        this.segundoApellido = UtilText.applyTrim(segundoApellido);
        return this;
    }

    public PersonaDTO setCorreo(String correo) {
        this.correo = UtilText.getUtilText().emailIsvalid(UtilText.applyTrim(correo)) ? UtilText.applyTrim(correo) : UtilText.getDefaultEmailAdress();
        return this;
    }

    public PersonaDTO setPaisTelefono(PaisDTO paisTelefono) {
        this.paisTelefono = UtilObject.getDefault(paisTelefono, PaisDTO.create());
        return this;
    }

    public PersonaDTO setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = UtilText.getUtilText().numericIsValid(UtilText.applyTrim(numeroTelefono)) ? UtilText.applyTrim(numeroTelefono) : UtilText.getDefaultNumeric();
        return this;
    }

    public PersonaDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public TipoIdentificacionDTO getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getCorreo() {
        return correo;
    }

    public PaisDTO getPaisTelefono() {
        return paisTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static PersonaDTO create(){
        return new PersonaDTO();
    }
}
