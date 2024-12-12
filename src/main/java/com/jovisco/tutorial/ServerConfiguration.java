package com.jovisco.tutorial;

import lombok.Getter;

import java.net.InetSocketAddress;

@Getter
public class ServerConfigurationApp {

    @Getter
    public static ServerConfigurationApp instance;

    private final InetSocketAddress serverAddress;
    private final String greetingMessage;

    private ServerConfigurationApp(int port, String greetingMessage) {
        this.serverAddress = new InetSocketAddress("localhost", port);
        this.greetingMessage = greetingMessage;

        if (instance == null) {
            instance = this;
        }
    }

}
