package com.priologic.hello;

public class Hello {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ");
		if (args.length > 0) {
			sb.append(args[0]);
		} else {
			sb.append("World");
		}
		sb.append("!");
		System.out.println(sb.toString());
		System.exit(0);
	}
}
