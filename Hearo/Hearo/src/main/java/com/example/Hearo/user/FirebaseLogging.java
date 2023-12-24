package com.example.Hearo.user;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FirebaseLogging {

    public static void main(String[] args) {
        // Firebase Admin SDK 로거를 가져옴
        Logger logger = Logger.getLogger("com.google.firebase");
        logger.setLevel(Level.ALL);

        // 로그 출력을 콘솔로 설정
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL); // 출력할 로그 수준 설정
        logger.addHandler(consoleHandler);

        // 전체 Firebase Admin SDK 로그 수준 설정
        logger.setLevel(Level.ALL); // 전체 로그 수준 설정
    }
}

