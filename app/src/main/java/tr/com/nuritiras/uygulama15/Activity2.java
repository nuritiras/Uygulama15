package tr.com.nuritiras.uygulama15;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import tr.com.nuritiras.uygulama15.databinding.Activity2Binding;

public class Activity2 extends AppCompatActivity {
    private Activity2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Activity2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        Bilgiler bilgiler = (Bilgiler) intent.getSerializableExtra("bilgiler");
        binding.textViewAdiSoyad.setText(bilgiler.getAdiSoyadi());
        binding.textViewEposta.setText(bilgiler.getePosta());
        binding.textViewTelefonNo.setText(bilgiler.getTelefonNo());
    }
}