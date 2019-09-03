package com.example.myapplication.gson;

import android.content.Context;

import com.example.myapplication.clases.JsonVacunadoResponse;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

public class ParseoGson {

    public static void checkValidation(Context context, int rawInput) {
        String jsonContent = loadJsonContent(context, rawInput);

        JsonVacunadoResponse response = new Gson().fromJson(jsonContent, JsonVacunadoResponse.class);
    }



    private static String loadJsonContent(Context context, int rawInput) {
        InputStream in = context.getResources().openRawResource(rawInput);
        String jsonContent = streamToString(in);
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonContent;
    }

    private static String streamToString(InputStream in) {
        String l;
        BufferedReader r = new BufferedReader(new InputStreamReader(in));
        StringBuilder s = new StringBuilder();
        try {
            while ((l = r.readLine()) != null) {
                s.append(l + "\n");
            }
        } catch (IOException e) {}
        return s.toString();
    }
}
