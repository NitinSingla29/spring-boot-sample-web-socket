package com.example.wshandler;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

@Component
public class SampleWebSocketHandler extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        System.out.println("Input message received" + message.getPayload());
        try {
            session.sendMessage(new TextMessage("Server Response is " + message.getPayload()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}