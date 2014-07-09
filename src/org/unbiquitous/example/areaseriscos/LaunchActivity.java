package org.unbiquitous.example.areaseriscos;

import org.unbiquitous.network.http.connection.ClientMode;
import org.unbiquitous.uos.core.ClassLoaderUtils;
import org.unbiquitous.uos.core.UOS;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;



public class LaunchActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ClassLoaderUtils.builder = new ClassLoaderUtils.DefaultClassLoaderBuilder() {
            public ClassLoader getParentClassLoader() {
                return LaunchActivity.this.getClassLoader();
            };
		};
		
		
		new AsyncTask<Void, Void, Void>() {
			protected Void doInBackground(Void... params) {
				
				UOS midware = new UOS();
				
				ClientMode.Properties props = new ClientMode.Properties();
			    props.setServer("www.my.server.net");
			    props.put("Activity", this);
				midware.start(props);
				return null;
			}
		}.execute();
		
	}

}
