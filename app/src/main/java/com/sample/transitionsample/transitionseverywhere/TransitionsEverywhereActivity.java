package com.sample.transitionsample.transitionseverywhere;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.sample.transitionsample.R;
import com.transitionseverywhere.Scene;
import com.transitionseverywhere.TransitionInflater;
import com.transitionseverywhere.TransitionManager;

public class TransitionsEverywhereActivity extends AppCompatActivity {

    private static final String TAG = "TransitionsEverywhere";

    Scene mFinalScene;
    Scene mInitialScene;
    ViewGroup mSceneRoot;

    private TransitionManager mTransitionToScene2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transitions_activity_layout);

        // Create the scene root for the scenes in this app
        mSceneRoot = (ViewGroup) findViewById(R.id.scene_root);

        assert mSceneRoot != null;

        mInitialScene = Scene.getSceneForLayout(mSceneRoot, R.layout.scene_1, this);
        mFinalScene = Scene.getSceneForLayout(mSceneRoot, R.layout.scene_2, this);

        mTransitionToScene2 = TransitionInflater.from(this)
                .inflateTransitionManager(R.transition.transitions_everywhere_transition_manager, mSceneRoot);
    }

    public void goBack(View view) {
        Log.d(TAG, "GoBack");
        TransitionManager.go(mInitialScene);
    }

    public void goForward(View view) {
        Log.d(TAG, "Go");
        mTransitionToScene2.transitionTo(mFinalScene);
    }
}
