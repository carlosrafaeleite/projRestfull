package br.com.curso.carlos.demo.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {}
