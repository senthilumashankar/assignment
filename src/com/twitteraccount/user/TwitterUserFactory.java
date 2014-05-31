package com.twitteraccount.user;

import com.twitteraccount.usercollection.TwitterConsoleUserCollection;

public class TwitterUserFactory {

	TwitterConsoleUserCollection userCollection;

	public static TwitterUser getTwitterUser(String userName, 
			TwitterConsoleUserCollection userCollection) {
		TwitterUser user = null;
		user = userCollection.get(userName);

		if (null == user) {
			user = new TwitterUser(userName);
			userCollection.addtoUserMap(userName, user);
		}

		return user;
	}

}
