package com.example.geirw.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button spotifyStreamerButton, scoresAppButton, libraryAppButton, buildItBiggerButton,
            xyzReaderButton, capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyStreamerButton = (Button) findViewById(R.id.buttonSpotifyStreamer);
        scoresAppButton = (Button) findViewById(R.id.buttonScoresApp);
        libraryAppButton = (Button) findViewById(R.id.buttonLibraryApp);
        buildItBiggerButton = (Button) findViewById(R.id.buttonBuildItBigger);
        xyzReaderButton = (Button) findViewById(R.id.buttonXyzReader);
        capstoneButton = (Button) findViewById(R.id.buttonCapstone);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onSpotifyStreamerButtonClicked(View view) {
        Toast.makeText(this,"Launching Spotify Streamer App",Toast.LENGTH_SHORT).show();
    }

    public void onScoresAppButtonClicked(View view) {
        Toast.makeText(this,"Launching Scores App",Toast.LENGTH_SHORT).show();
    }

    public void onLibraryAppButtonClicked(View view) {
        Toast.makeText(this,"Launching Library App",Toast.LENGTH_SHORT).show();
    }

    public void onBuildItBiggerButtonClicked(View view) {
        Toast.makeText(this,"Launching Build It Bigger App",Toast.LENGTH_SHORT).show();
    }

    public void onXyzReaderButtonClicked(View view) {
        Toast.makeText(this,"Launching XYZ Reader App",Toast.LENGTH_SHORT).show();
    }

    public void onCapstoneButtonClicked(View view) {
        Toast.makeText(this,"Launching Capstone: My Own App",Toast.LENGTH_SHORT).show();
    }
}
