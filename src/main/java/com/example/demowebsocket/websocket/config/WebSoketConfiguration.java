package com.example.demowebsocket.websocket.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Configuration
public class WebSoketConfiguration {

    @Bean
    public ServerEndpointExporter setServerEndpointExporter() {
        return  new ServerEndpointExporter();
    }


}
