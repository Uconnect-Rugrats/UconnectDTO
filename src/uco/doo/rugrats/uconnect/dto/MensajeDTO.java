package uco.doo.rugrats.uconnect.dto;

import uco.doo.rugrats.uconnect.utils.UtilDate;
import uco.doo.rugrats.uconnect.utils.UtilObject;
import uco.doo.rugrats.uconnect.utils.UtilText;
import uco.doo.rugrats.uconnect.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class MensajeDTO {
    private UUID identificador;
    private ChatDTO chat;
    private ParticipanteGrupoDTO autor;
    private LocalDateTime fechaEnviado;
    private String contenido;
    private EstadoDTO estado;

    public MensajeDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setChat(ChatDTO.create());
        setAutor(ParticipanteGrupoDTO.create());
        setFechaEnviado(UtilDate.getDefaultValue());
        setContenido(UtilText.getDefaultValue());
        setEstado(EstadoDTO.create());
    }

    public MensajeDTO(final UUID identificador,final ChatDTO chat, final ParticipanteGrupoDTO autor, final LocalDateTime fechaEnviado,final String contenido,final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setChat(chat);
        setAutor(autor);
        setFechaEnviado(fechaEnviado);
        setContenido(contenido);
        setEstado(estado);
    }

    public MensajeDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public MensajeDTO setChat(ChatDTO chat) {
        this.chat = UtilObject.getDefault(chat, ChatDTO.create());
        return this;
    }

    public MensajeDTO setAutor(ParticipanteGrupoDTO autor) {
        this.autor = UtilObject.getDefault(autor, ParticipanteGrupoDTO.create());
        return this;
    }

    public MensajeDTO setFechaEnviado(LocalDateTime fechaEnviado) {
        this.fechaEnviado = UtilDate.getDefault(fechaEnviado);
        return this;
    }

    public MensajeDTO setContenido(String contenido) {
        this.contenido = UtilText.applyTrim(contenido);
        return this;
    }

    public MensajeDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public ChatDTO getChat() {
        return chat;
    }

    public ParticipanteGrupoDTO getAutor() {
        return autor;
    }

    public LocalDateTime getFechaEnviado() {
        return fechaEnviado;
    }

    public String getContenido() {
        return contenido;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static MensajeDTO create(){
        return new MensajeDTO();
    }
}
