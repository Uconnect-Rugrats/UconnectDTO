package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class ChatDTO {
    private UUID identificador;
    private GrupoDTO grupo;
    private EstadoDTO estado;

    public ChatDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setGrupo(GrupoDTO.create());
        setEstado(EstadoDTO.create());
    }

    public ChatDTO(final UUID identificador, final GrupoDTO grupo, final LocalDateTime fechaFin, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setGrupo(grupo);
        setEstado(estado);
    }

    public ChatDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ChatDTO setGrupo(GrupoDTO grupo) {
        this.grupo = UtilObject.getDefault(grupo, GrupoDTO.create());
        return this;
    }

    public ChatDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public GrupoDTO getGrupo() {
        return grupo;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static ChatDTO create(){
        return new ChatDTO();
    }
}
