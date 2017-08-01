package dev.sgp.util;

public class generationMatricule {
	
	private static String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

	private static int charLength = chars.length();

	public static String generateMatricule() {

		StringBuilder pass = new StringBuilder(charLength);
		
		for (int x = 0; x <= 5; x++) {
			int i = (int) (Math.random() * charLength);
			pass.append(chars.charAt(i));
		}
		return pass.toString();

	}
}
