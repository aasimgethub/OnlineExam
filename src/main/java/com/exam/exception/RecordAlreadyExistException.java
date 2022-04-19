package com.exam.exception;

public class RecordAlreadyExistException extends RuntimeException {

	public RecordAlreadyExistException() {
		super();

	}

	public RecordAlreadyExistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public RecordAlreadyExistException(String message, Throwable cause) {
		super(message, cause);

	}

	public RecordAlreadyExistException(String message) {
		super(message);

	}

	public RecordAlreadyExistException(Throwable cause) {
		super(cause);

	}

}
