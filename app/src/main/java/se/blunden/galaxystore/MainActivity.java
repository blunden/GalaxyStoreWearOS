package se.blunden.galaxystore;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {
    private static final String TAG = "GalaxyStore";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent activityIntent;
        activityIntent = new Intent(Intent.ACTION_MAIN);
        activityIntent.setComponent(ComponentName.unflattenFromString("com.sec.android.app.samsungapps/com.sec.android.app.samsungapps.view.GSHomeActivity"));

        try {
            startActivity(activityIntent);

        } catch (Exception e) {
            Toast.makeText(this, R.string.error_launch, Toast.LENGTH_SHORT).show();
            Log.e(TAG, "Failed to start the unbranded Wear OS Settings activity");
            e.printStackTrace();
        }
        finish();
    }
}