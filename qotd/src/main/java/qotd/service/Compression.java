package qotd.service;

public class Compression {

	public static String uncompress(String text, int[] indices) {

		StringBuilder builder = new StringBuilder(text);
		final String space = " ";

		for (int i = 0; i < indices.length; i++) {
			builder.insert(indices[i], space);
		}

		return builder.toString();
	}

	private static String compress(String text) {
		// already handled by transformer
		return text;
	}

	public static void main(String[] args) {
		String text = "theQuickBrown";
		int indices[] = { 3, 9 };
		System.out.print(Compression.uncompress(text, indices));
	}

}
