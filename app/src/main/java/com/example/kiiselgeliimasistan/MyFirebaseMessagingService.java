package com.example.kiiselgeliimasistan;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import android.util.Log;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "MyFirebaseMsgService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "Mesaj alındı: " + remoteMessage.getNotification().getBody());

        // Bildirimi göstermek için uygun bir yöntem çağırabilirsiniz.
    }
}
