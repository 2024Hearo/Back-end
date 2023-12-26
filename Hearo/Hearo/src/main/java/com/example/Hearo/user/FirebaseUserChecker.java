package com.example.Hearo.user;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.ListUsersPage;
import com.google.firebase.auth.UserRecord;

import java.io.FileInputStream;

public class FirebaseUserChecker {

    public static void main(String[] args) {
        // Firebase Admin SDK 초기화
        initializeFirebase();

        try {
            ListUsersPage users = FirebaseAuth.getInstance().listUsers(null);
            for (UserRecord user : users.iterateAll()) {
                System.out.println("User: " + user.getUid());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void initializeFirebase() {
        try {
            FileInputStream serviceAccount =
                    new FileInputStream("/Users/user/Documents/GitHub/Back-end/hearo-17195-firebase-adminsdk-b9b6j-05d146faeb.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

            FirebaseApp.initializeApp(options);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
