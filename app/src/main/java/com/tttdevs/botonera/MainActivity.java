package com.tttdevs.botonera;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;

// Clase de la Activity principal
public class MainActivity extends AppCompatActivity {

    MediaPlayer mPlayer;

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
        reproducirSonido("android.resource://com.tttdevs.botonera/raw/sonido1");
    }

    public void clicBoton2(View view) {
        reproducirSonido("android.resource://com.tttdevs.botonera/raw/sonido2");
    }

    public void clicBoton3(View view) {
        reproducirSonido("android.resource://com.tttdevs.botonera/raw/sonido3");
    }

    public void clicBoton4(View view) {
        reproducirSonido("android.resource://com.tttdevs.botonera/raw/sonido4");
    }

    public void clicBoton5(View view) {
        reproducirSonido("android.resource://com.tttdevs.botonera/raw/sonido5");
    }

    public void clicBoton6(View view) {
        reproducirSonido("android.resource://com.tttdevs.botonera/raw/sonido6");
    }

    public void clicBoton7(View view) {
        reproducirSonido("android.resource://com.tttdevs.botonera/raw/sonido7");
    }

    public void clicBoton8(View view) {
        reproducirSonido("android.resource://com.tttdevs.botonera/raw/sonido8");
    }

    public void clicBoton9(View view) {
        reproducirSonido("android.resource://com.tttdevs.botonera/raw/sonido9");
    }


    // Método que recibe una ruta a un archivo de audio
    // e inicializa mPlayer para que lo reproduzca
    private void reproducirSonido(String ruta) {

        // Creo un objeto de tipo Uri con la ruta al archivo mp3 recibida como argumento.
        // Más adelante voy a usar esta Uri como argumento de un método de mPlayer.
        Uri uriMp3 = Uri.parse(ruta);

        // Creo una instancia de MediaPlayer
        mPlayer = new MediaPlayer();

        // Asigno onCompletionListener
        mPlayer.setOnCompletionListener(onCompletionListener);

        // Los siguientes 2 métodos de mPlayer requieren que se utilice try/catch
        try {
            // Le digo a mPlayer cuál es el archivo que va a reproducir
            mPlayer.setDataSource(getApplicationContext(), uriMp3);

            // Preparo mPlayer para la reproducción (buffer, etc)
            mPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reproduzco el sonido
        mPlayer.start();

        // Cuando finaliza la reproducción, se llama al onCompletionListener
    }

    // Este listener va a ser llamado cada vez que finalice la reproducción de un osnido
    // para liberar los recursos del MediaPlayer
    private MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            mp.release();
            mPlayer = null;
        }
    };

} // Fin MainActivity
