package com.aplicacion.exception;

public class UsernameOrIdNotFound extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 425851962163371942L;

	public UsernameOrIdNotFound() {
		super("Usuario o Id no encontrado");
	}
	
	public UsernameOrIdNotFound(String message) {
		super(message);
	}
}
