 package kg.geektech.filmsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import kg.geektech.filmsapp.databinding.ActivityMainBinding;

 public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
binding = ActivityMainBinding.inflate((getLayoutInflater()));
    setContentView(binding.getRoot());}
}