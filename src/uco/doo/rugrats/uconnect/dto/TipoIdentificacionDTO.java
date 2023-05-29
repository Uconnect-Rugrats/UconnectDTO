package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class TipoIdentificacionDTO {
    private UUID identificador;
    private String nombre;
    private String indicador;

    public TipoIdentificacionDTO(){
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setIndicador(UtilText.getDefaultNumeric());
    }

    public TipoIdentificacionDTO(UUID identificador, String nombre, String indicador){
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setIndicador(indicador);
    }

    public TipoIdentificacionDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public TipoIdentificacionDTO setNombre(String nombre) {
        this.nombre = UtilText.getDefault(nombre);
        return this;
    }

    public TipoIdentificacionDTO setIndicador(String indicador) {
        this.indicador = UtilText.getUtilText().numericIsValid(UtilText.applyTrim(indicador)) ? UtilText.applyTrim(indicador) : UtilText.getDefaultNumeric();
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getIndicador() {
        return indicador;
    }

    public static TipoIdentificacionDTO create(){
        return new TipoIdentificacionDTO();
    }

}
