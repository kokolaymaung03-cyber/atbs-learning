package org.atbs.learning;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
    private static final String ATBS_URL =
        "https://script.google.com/macros/s/AKfycbzbPGMzxco4S462QzGTn9qs5mHJ8irwDOvSN8hKhTqzW50K3Pqjjo-3CVUDI3A7aP5H/exec";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(ATBS_URL));
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            Toast.makeText(this,
                "Please install or enable Chrome or another web browser.",
                Toast.LENGTH_LONG).show();
            finish();
        }
    }
}
