package com.parse.starter;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import android.app.Application;

public class ParseApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		// Add your initialization code here
        Parse.initialize(this, "mV2Phn6Ua1rosE4UhCt980Tcf8nbzcVexRgfccCe", "yn8zCwfNvjrzAfwf7c71YpWFdVNo9UMlAlvkK0VD");



		ParseACL defaultACL = new ParseACL();
	    
		// If you would like all objects to be private by default, remove this line.
		defaultACL.setPublicReadAccess(true);
		
		ParseACL.setDefaultACL(defaultACL, true);

        ParseUser user = new ParseUser();
        user.setUsername("GURU");
        user.setPassword("pass");
        user.setEmail("guru@emelle.me");

// other fields can be set just like with ParseObject
        user.put("phone", "650-555-0000");

        user.signUpInBackground(new SignUpCallback() {
            public void done(ParseException e) {
                if (e == null) {
                    // Hooray! Let them use the app now.
                } else {
                    // Sign up didn't succeed. Look at the ParseException
                    // to figure out what went wrong
                }
            }
        });
	}

}
