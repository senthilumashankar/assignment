package com.twitteraccount.app.impl;

/**
 * TwitterAppImplementation this is implementation class of
 * TwitterApp which has basic methods to post, follow,
 * print message in wall , it has the instance of user and 
 * the whole user collection
 */
import com.twitteraccount.app.TwitterApp;
import com.twitteraccount.msg.Message;
import com.twitteraccount.user.TwitterUser;
import com.twitteraccount.usercollection.TwitterConsoleUserCollection;
import com.twitteraccount.utils.TwitterAssignmentHelper;

public class TwitterAppImplementation implements TwitterApp {

	/**
	 * Twitter user
	 */
	private TwitterUser twitteruser;

	/**
	 * The Whole collection of Users
	 */
	private TwitterConsoleUserCollection userCollection;

	/**
	 * Constructor
	 * @param userCollection
	 */
	public TwitterAppImplementation(TwitterConsoleUserCollection userCollection) {
		this.userCollection = userCollection;
	}

	/**
	 * Print the Message of user
	 */
	@Override
	public void printMessage() {
		for (Message msg : this.getTwitteruser().getMsgList()) {
			System.out.println(msg);
		}
	}

	/**
	 * Post given message
	 */
	@Override
	public void postMessage(Message msg) {
		this.getTwitteruser().getMsgList().add(msg);
	}

	/**
	 * Prints the message and message of followers
	 */
	@Override
	public void printWall(TwitterUser user) {
		printFollowerMsg(user);
		for (String following : user.getFollower()) {
			printFollowerMsg(TwitterAssignmentHelper.getTwitterUser(
					this.userCollection, following));
		}
	}

	/**
	 * Helper for printwall
	 * @param user
	 */
	private void printFollowerMsg(TwitterUser user) {
		for (Message msg : user.getMsgList()) {
			System.out.println(user.getUserName() + " - " + msg);
		}
	}

	/**
	 * method to followother
	 */
	@Override
	public void followOther(String userName) {
		TwitterUser user = TwitterAssignmentHelper.getTwitterUser(
				this.userCollection, userName);
		if(null != user){
			this.getTwitteruser().getFollower().add(userName);	
		}
		
	}

	/**
	 * set user
	 */
	@Override
	public void setTwitteruser(TwitterUser twitteruser) {
		this.twitteruser = twitteruser;
	}

	/**
	 * get user
	 */
	@Override
	public TwitterUser getTwitteruser() {
		return twitteruser;
	}

}
