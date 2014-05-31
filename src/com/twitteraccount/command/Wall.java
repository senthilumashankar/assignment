package com.twitteraccount.command;

import com.twitteraccount.app.TwitterApp;

public class Wall implements UserCommand {

	private TwitterApp app;

	public Wall(TwitterApp app) {
		this.app = app;
	}

	@Override
	public void execute() {
		app.printWall(app.getTwitteruser());
	}

}
