package com.example.wwsis.wmz.firstapptest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by Tomasz Zajc on 2017-03-17.
 */

class SMapsActivity extends FragmentActivity {
    @SuppressWarnings("StatementWithEmptyBody")
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Context context = getApplicationContext();

        int duration = Toast.LENGTH_LONG;

        if (id == R.id.nav_camera) {


            CharSequence text = "Hello toast!";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

            return true;
        } else if (id == R.id.nav_gallery) {
            CharSequence text = "Hello toast!";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

            return true;
        } else if (id == R.id.nav_slideshow) {
            return true;
        } else if (id == R.id.nav_manage) {
            return true;
        } else if (id == R.id.nav_share) {
            return true;
        } else if (id == R.id.nav_send) {
            return true;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
