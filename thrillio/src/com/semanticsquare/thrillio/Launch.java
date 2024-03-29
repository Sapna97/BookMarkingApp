package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.managers.BookmarkManager;
import com.semanticsquare.thrillio.managers.UserManager;

public class Launch {
    private static User[] users;
    private static Bookmark[][] bookmarks;
	public static void loadData() {
	    System.out.println("1. Loading Data . . .");
		DataStore.loadData();
		
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		
//		System.out.println("Printing data ...");
//		printUserData();
//		printBookmarkData(); 
	}
	
	
	
	private static void printBookmarkData() {
		 for(Bookmark[] bookmarklist : bookmarks) {
			 for(Bookmark bookmark : bookmarklist) {
			 System.out.println(bookmark);
			 }
		 }
		
	}



	private static void printUserData() {
		 for(User user : users) {
			 System.out.println(user);
		 }
		
	}

	private static void start() {
		//System.out.println("\n2. Bookmarking. . .");
		for(User user : users) {
			View.browse(user, bookmarks);
			 
		}
		 
	}


	public static void main(String[] args) {
		 loadData();
		 start();
	}


}
