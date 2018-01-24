package qotd.exception;

public class QotdCollectionEmptyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public QotdCollectionEmptyException() {
		this("Compression Exception");
	}

	public QotdCollectionEmptyException(String msg) {
		super(msg);
	}

	public QotdCollectionEmptyException(Throwable cause) {
		super(cause);
	}

	public QotdCollectionEmptyException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
