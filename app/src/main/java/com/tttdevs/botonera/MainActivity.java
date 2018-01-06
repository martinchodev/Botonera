package com.tttdevs.botonera;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

// Clase de la Activity principal
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Asocia esta activity con un archivo de layout
        setContentView(R.layout.activity_main);

    } // Fin onCreate


    // Métodos que van a ser llamados desde el atributo "onClick"
    // definido en cada botón individual del layout.
    // Nótese que se definen fuera de onCreate(), dentro de MainActivity
    public void clicBoton1(View view) {
        Toast.makeText(this, "Clic en 1", Toast.LENGTH_SHORT).show();
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.sonido1);
        mPlayer.start();
    }

    public void clicBoton2(View view) {
        Toast.makeText(this, "Clic en 2", Toast.LENGTH_SHORT).show();
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.sonido2);
        mPlayer.start();
    }

    public void clicBoton3(View view) {
        Toast.makeText(this, "Clic en 3", Toast.LENGTH_SHORT).show();
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.sonido3);
        mPlayer.start();
    }

    public void clicBoton4(View view) {
        Toast.makeText(this, "Clic en 4", Toast.LENGTH_SHORT).show();
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.sonido4);
        mPlayer.start();
    }

    public void clicBoton5(View view) {
        Toast.makeText(this, "Clic en 5", Toast.LENGTH_SHORT).show();
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.sonido5);
        mPlayer.start();
    }

    public void clicBoton6(View view) {
        Toast.makeText(this, "Clic en 6", Toast.LENGTH_SHORT).show();
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.sonido6);
        mPlayer.start();
    }

    public void clicBoton7(View view) {
        Toast.makeText(this, "Clic en 7", Toast.LENGTH_SHORT).show();
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.sonido7);
        mPlayer.start();
    }

    public void clicBoton8(View view) {
        Toast.makeText(this, "Clic en 8", Toast.LENGTH_SHORT).show();
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.sonido8);
        mPlayer.start();
    }

    public void clicBoton9(View view) {
        Toast.makeText(this, "Clic en 9", Toast.LENGTH_SHORT).show();
        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.sonido9);
        mPlayer.start();
    }


} // Fin MainActivity
