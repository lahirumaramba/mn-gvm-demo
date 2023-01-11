package com.example

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions

object FirebaseManager {

    val firebaseApp: FirebaseApp by lazy {
        FirebaseApp.initializeApp(
            FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.getApplicationDefault())
				.setProjectId("admin-sdk-8b7ba")
                .build()
        )
    }
}
