package qotd.exception;

public class CompressionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CompressionException() {
		this("Compression Exception");
	}

	public CompressionException(String msg) {
		super(msg);
	}

	public CompressionException(Throwable cause) {
		super(cause);
	}

	public CompressionException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
