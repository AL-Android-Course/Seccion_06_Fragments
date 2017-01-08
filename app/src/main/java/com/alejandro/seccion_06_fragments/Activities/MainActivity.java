package com.alejandro.seccion_06_fragments.Activities;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.alejandro.seccion_06_fragments.Fragments.DataFragment;
import com.alejandro.seccion_06_fragments.Fragments.DetailsFragment;
import com.alejandro.seccion_06_fragments.R;

public class MainActivity extends FragmentActivity implements DataFragment.DataListener {

    private boolean isMultiPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setMultiPanel();
    }

    @Override
    public void sendData(String text) {

        if (isMultiPanel) {
            DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
            detailsFragment.renderText(text);
        } else {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra("text", text);
            startActivity(intent);
        }

    }

    private void setMultiPanel() {
        isMultiPanel = (getSupportFragmentManager().findFragmentById(R.id.detailsFragment) != null);
    }
}
