package com.example.Hearo.user;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.IOException;

@SpringBootApplication
public class YourApplication {
    public static void main(String[] args) throws IOException {
        FileInputStream serviceAccount = new FileInputStream("/Users/user/Documents/GitHub/Back-end/hearo-17195-firebase-adminsdk-b9b6j-05d146faeb.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://Hearo.firebaseio.com") // Replace with your Firebase Database URL
                .build();

        FirebaseApp.initializeApp(options);

        SpringApplication.run(YourApplication.class, args);
    }
}
