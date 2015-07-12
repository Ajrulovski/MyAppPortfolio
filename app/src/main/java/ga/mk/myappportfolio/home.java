package ga.mk.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void startApp(View view) {
        // Do something in response to button click
        Toast toast;
        switch(view.getId())
        {
            case R.id.spotifystreamer:
                toast = Toast.makeText(getApplicationContext(), "Start the Spotify streamer app", Toast.LENGTH_LONG);
                break;
            case R.id.scoresapp:
                toast = Toast.makeText(getApplicationContext(), "Start the Score app", Toast.LENGTH_LONG);
                break;
            case R.id.libraryapp:
                toast = Toast.makeText(getApplicationContext(), "Start the Library app", Toast.LENGTH_LONG);
                break;
            case R.id.builditbigger:
                toast = Toast.makeText(getApplicationContext(), "Start the Build it bigger app", Toast.LENGTH_LONG);
                break;
            case R.id.xyzreader:
                toast = Toast.makeText(getApplicationContext(), "Start the XYZ reader app", Toast.LENGTH_LONG);
                break;
            case R.id.myownapp:
                toast = Toast.makeText(getApplicationContext(), "Start the CAPSTONE: my own app", Toast.LENGTH_LONG);
                break;
            default:
                throw new RuntimeException("Unknow button ID");
        }

        //show the toast
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
