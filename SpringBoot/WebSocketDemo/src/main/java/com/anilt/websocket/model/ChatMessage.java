package com.anilt.websocket.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.messaging.simp.SimpMessageType;

@Getter
@Setter
public class ChatMessage {
    private SimpMessageType type;
    private String content;
    private String sender;
}
