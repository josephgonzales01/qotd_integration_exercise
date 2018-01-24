package qotd.service;

import qotd.exception.CompressionException;

public class Compression {

	public static String uncompress(String text, int[] indices) throws CompressionException {

		if(indices.length==0){
			throw new CompressionException("Empty indices!!!");
		}
			
		StringBuilder builder = new StringBuilder(text);
		final String space = " ";

		for (int i = 0; i < indices.length; i++) {
			if (indices[i] < 0) {
				throw new CompressionException("Invalid index location: " + indices[i]);
			}
			builder.insert(indices[i], space);
		}

		return builder.toString();
	}

	public static void main(String[] args) {
		String text = "theQuickBrown";
		int indices[] = { 3, 9 };
		try {
			System.out.print(Compression.uncompress(text, indices));
		} catch (CompressionException e) {

			e.printStackTrace();
		}
	}

}
