package org.unbiquitous.example.areaseriscos;

import java.util.Arrays;

import org.unbiquitous.uImpala.dalvik.GameActivity;
import org.unbiquitous.uImpala.engine.core.GameSettings;
import org.unbiquitous.uImpala.engine.io.MouseManager;
import org.unbiquitous.uImpala.engine.io.ScreenManager;

import android.os.Bundle;

public class LaunchActivity extends GameActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		run(new GameSettings() {
			{
				put("main_activity",LaunchActivity.this);
				put("first_scene", Menu.class);
				put("input_managers", Arrays.asList(MouseManager.class));
				put("output_managers", Arrays.asList(ScreenManager.class));

			}
		});
	}

}
