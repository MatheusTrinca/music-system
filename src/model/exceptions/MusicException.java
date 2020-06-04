package model.exceptions;

public class MusicException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public MusicException(String msg) {
		super(msg);
	}
}
