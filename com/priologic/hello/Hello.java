package com.priologic.hello;

public class Hello {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		if (args.length > 0) {
			sb.append("Hello ");
			for (int i = 0; i < args.length; i++) {
				sb.append(args[i]);
				sb.append(", ");
			}
			sb.replace(sb.length()-2, sb.length(), "!");
		} else {
			sb.append("Hello World!");
		}
		System.out.println(sb.toString());
		System.exit(0);
	}
}
