package com.singletondesign.pattern;

public class SingletonExample {

	public static void main(String[] args) {
		SingletonSynchronized instance = SingletonSynchronized.getInstance();

		System.out.println(instance);

		SingletonSynchronized instance1 = SingletonSynchronized.getInstance();

		System.out.println(instance1);
	}
}

/*
There are 4 ways to initialize the singleton design patterns:
1.  Eagar initialization(class name : SingletonEagar)
2.  Lazy initialization(class name : Singleton)
3.  Thread safe method initialization(class name : SingletonSynchronizedMethod)
4.  Thread safe block initialization(class name : SingletonSynchronized)
*/