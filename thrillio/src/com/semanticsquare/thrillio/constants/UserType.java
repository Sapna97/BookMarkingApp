package com.semanticsquare.thrillio.constants;

public class UserType {
	//because we don't want objects therefore constructor 
    private UserType() {}
    /*because we want to store constants so final and it is static 
     final therefore compile time constant so allcaps*/
    public static final String USER = "user";
    public static final String EDITOR = "editor";
    public static final String CHIEF_EDITOR = "chiefeditor"; 
}
