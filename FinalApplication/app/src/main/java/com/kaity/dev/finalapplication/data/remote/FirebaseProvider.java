package com.kaity.dev.finalapplication.data.remote;

public class FirebaseProvider {
    public static FirebaseHandler provide(){
        return new FirebaseHandlerImpl();
    }
}
