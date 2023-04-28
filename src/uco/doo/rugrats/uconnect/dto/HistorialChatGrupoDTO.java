package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class HistorialChatGrupoDTO {
    private UUID identificador;
    private ChatDTO chat;
    private ParticipanteGrupoDTO participante;
    private LocalDateTime fechaIngreso;

    public HistorialChatGrupoDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setChat(ChatDTO.create());
        setParticipante(ParticipanteGrupoDTO.create());
        setFechaIngreso(UtilDate.getDefaultValue());
    }

    public HistorialChatGrupoDTO(final UUID identificador,final ChatDTO chat, final ParticipanteGrupoDTO participante, final LocalDateTime fechaIngreso) {
        super();
        setIdentificador(identificador);
        setChat(chat);
        setParticipante(participante);
        setFechaIngreso(fechaIngreso);
    }

    public HistorialChatGrupoDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public HistorialChatGrupoDTO setChat(ChatDTO chat) {
        this.chat = UtilObject.getDefault(chat, ChatDTO.create());
        return this;
    }

    public HistorialChatGrupoDTO setParticipante(ParticipanteGrupoDTO participante) {
        this.participante = UtilObject.getDefault(participante, ParticipanteGrupoDTO.create());
        return this;
    }

    public HistorialChatGrupoDTO setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = UtilDate.getDefault(fechaIngreso);
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public ChatDTO getChat() {
        return chat;
    }

    public ParticipanteGrupoDTO getParticipante() {
        return participante;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public static final HistorialChatGrupoDTO create(){
        return new HistorialChatGrupoDTO();
    }
}
