package com.example.Hearo.user;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import java.io.FileInputStream;
import java.io.IOException;

public class FirebaseInitializer {
    public static void initialize() throws IOException {
        FileInputStream serviceAccount = new FileInputStream("hearo-17195-firebase-adminsdk-b9b6j-05d146faeb.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://Hearo.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);
    }
}
