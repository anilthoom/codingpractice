package com.anilt.websocket.model;

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

    public void setType(MessageType type) {
        this.type = type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public enum MessageType{
        CHAT,
        JOIN,
        LEAVE
    }
}
