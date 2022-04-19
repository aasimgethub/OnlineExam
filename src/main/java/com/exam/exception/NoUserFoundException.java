package com.exam.exception;

public class NoUserFoundException extends RuntimeException {

	public NoUserFoundException() {
		super();

	}

	public NoUserFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public NoUserFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public NoUserFoundException(String message) {
		super(message);

	}

	public NoUserFoundException(Throwable cause) {
		super(cause);

	}

}