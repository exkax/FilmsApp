package kg.geektech.filmsapp.data.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitClient {

    private Retrofit retrofit =  new Retrofit.Builder()
            .baseUrl("https://ghibliapi.herokuapp.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public FilmApi createFilmApi()
    { return retrofit.create(FilmApi.class);
    }

//    private  RetroFit retroFit = new RetroFit.Builder()
//            .baseUrl("https://ghibliapi.herokuapp.com");
}
