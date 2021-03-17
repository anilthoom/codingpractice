package com.anilt.websocket.model;

import lombok.Getter;
import lombok.Setter;

public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;

    public MessageType getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public enum MessageType{
        CHAT,
        JOIN,
        LEAVE
    }
}
