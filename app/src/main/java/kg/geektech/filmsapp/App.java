package kg.geektech.filmsapp;

import android.app.Application;

import kg.geektech.filmsapp.data.remote.FilmApi;
import kg.geektech.filmsapp.data.remote.RetroFitClient;

public class App extends Application {
    private RetroFitClient retroFitClient;
    public  static FilmApi api;

    @Override
    public void onCreate() {
        super.onCreate();
        retroFitClient = new RetroFitClient();
        api = retroFitClient.createFilmApi();
    }
}
