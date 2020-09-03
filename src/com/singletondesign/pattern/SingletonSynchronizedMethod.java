package com.singletondesign.pattern;

class SingletonSynchronizedMethod {
	private static SingletonSynchronizedMethod instance;

	private SingletonSynchronizedMethod() {
	}

	public static synchronized SingletonSynchronizedMethod getInstance() {
		if (instance == null) {
			instance = new SingletonSynchronizedMethod();
		}
		return instance;
	}
}
