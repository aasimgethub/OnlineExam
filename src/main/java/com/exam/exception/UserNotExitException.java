package com.exam.exception;
public class UserNotExitException extends RuntimeException{

	public UserNotExitException() {
		super();
	}

	public UserNotExitException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UserNotExitException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserNotExitException(String message) {
		super(message);
	}

	public UserNotExitException(Throwable cause) {
		super(cause);
	}
}
