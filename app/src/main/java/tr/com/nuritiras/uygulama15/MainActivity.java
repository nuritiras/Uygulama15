package tr.com.nuritiras.uygulama15;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import tr.com.nuritiras.uygulama15.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void digerActivity(View view) {
            String adiSoyadi = binding.editTextAdiSoyadi.getText().toString();
            String eMail= binding.editTextEPosta.getText().toString();
            String telefonNo= binding.editTextTelefon.getText().toString();
            Bilgiler bilgilerSerializable = new Bilgiler(adiSoyadi,eMail,telefonNo);
            Intent intent = new Intent(this.getApplicationContext(),Activity2.class);
            intent.putExtra("bilgiler",bilgilerSerializable);
            startActivity(intent);
    }
}