package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.util.UUID;

public class PaisDTO {
    private UUID identificador;
    private String nombre;
    private String indicador;

    public PaisDTO(){
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setIndicador(UtilText.getDefaultNumeric());
    }

    public PaisDTO(UUID identificador, String nombre, String indicador){
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setIndicador(indicador);
    }

    public PaisDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PaisDTO setNombre(String nombre) {
        this.nombre = UtilText.getDefault(nombre);
        return this;
    }

    public PaisDTO setIndicador(String indicador) {
        this.indicador = UtilText.numericIsValid(UtilText.applyTrim(indicador)) ? UtilText.applyTrim(indicador) : UtilText.getDefaultNumeric();
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

    public static PaisDTO create(){
        return new PaisDTO();
    }

}
