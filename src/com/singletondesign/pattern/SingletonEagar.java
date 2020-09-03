package com.singletondesign.pattern;

class SingletonEagar {
	  private static SingletonEagar instance = new SingletonEagar(); 
	  
	  private SingletonEagar(){}
	  
	  public static SingletonEagar getInstance() {
	    return instance;
	  }
	}