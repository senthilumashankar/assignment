package com.twitteraccount.app;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.twitteraccount.app.impl.TwitterAppImplementation;
import com.twitteraccount.command.FollowUser;
import com.twitteraccount.command.InvalidCommand;
import com.twitteraccount.command.PostMessage;
import com.twitteraccount.command.ReadMessage;
import com.twitteraccount.command.UserCommand;
import com.twitteraccount.command.Wall;
import com.twitteraccount.user.TwitterUserFactory;
import com.twitteraccount.usercollection.TwitterConsoleUserCollection;
import com.twitteraccount.utils.TwitterAssignmentHelper;

public class RunTwitterInConsole {

	private TwitterConsoleUserCollection userCollection;
	private TwitterApp app;

	/**
	 * Constructor
	 * @param userCollection
	 * @param app
	 */
	public RunTwitterInConsole(TwitterConsoleUserCollection userCollection,
			TwitterApp app) {
		this.userCollection = userCollection;
		this.app = app;
	}

	/**
	 * Run the User Commands - Users Command Pattern
	 * @param tokens
	 */
	public void runCommand(List<String> tokens) {
		UserCommand usrCommand;
		app.setTwitteruser(TwitterUserFactory.getTwitterUser(tokens.get(0).toString(), userCollection));
		if (tokens.contains("->")) {
			usrCommand = new PostMessage(TwitterAssignmentHelper.getCombinedString(tokens, 2), app);
		} else if (tokens.contains("follows")) {
			usrCommand = new FollowUser(tokens.get(2).toString() ,app);
		} else if (tokens.contains("wall")) {
			usrCommand = new Wall(app);
		} else if (tokens.size() == 1) {
			usrCommand = new ReadMessage(app);
		} else {
			usrCommand = new InvalidCommand(tokens.get(0).toString(),
					userCollection);
		}
		usrCommand.execute();
		System.out.print(">");
	}

	/**
	 * Main Method to run Twitter App
	 * @param args
	 */
	public static void main(String args[]) {

		System.out.println("Usage");
		System.out.println("posting: <user name> -> <message>");
		System.out.println("reading: <user name>");
		System.out.println("following: <user name> follows <another-user>");
		System.out.println("wall: <user name> wall");

		System.out.println("Have Fun!!!!");
		System.out.print(">");

		TwitterConsoleUserCollection userCollection = new TwitterConsoleUserCollection();
		TwitterApp app = new TwitterAppImplementation(userCollection);

		RunTwitterInConsole runconsoletwitter = new RunTwitterInConsole(
				userCollection, app);

		while (true) {
			Scanner scaninput = new Scanner(System.in);
			String enteredText = scaninput.nextLine();
			List<String> tokens = Arrays.asList(enteredText.split(" "));
			runconsoletwitter.runCommand(tokens);
		}

	}

}
