package com.kaity.dev.finalapplication.data;

public class DataHandlerProvider {
    public static DataHandler provide() {
        return AppDataHandler.getInstance();
    }
}
