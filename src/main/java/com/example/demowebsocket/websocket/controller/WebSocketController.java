package com.example.demowebsocket.websocket.controller;

import com.example.demowebsocket.websocket.webserver.WebSocketServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "/socket")
public class WebSocketController {



    @RequestMapping("/pushMessage")
    public String pushMessage(String message, String sid) throws IOException {
        WebSocketServer.sendInfo(message, sid);
        return message;
    }


}
