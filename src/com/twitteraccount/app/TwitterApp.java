package com.twitteraccount.app;

import com.twitteraccount.msg.Message;
import com.twitteraccount.user.TwitterUser;
/**
 * Utility Methods to Access  Twitter App
 * @author senthil
 *
 */
public interface TwitterApp {

	public void printMessage();
	
	public void postMessage(Message msg);

	public void followOther(String user);
	
	public void printWall(TwitterUser user);
	
	public TwitterUser getTwitteruser();
	
	public void setTwitteruser(TwitterUser user);

}
