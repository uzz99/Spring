package com.beyond.department.dto;

import org.springframework.http.HttpStatus;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
public class BaseResponseDto<T> {
	@Schema(description = "응답 코드", example = "200")
	private int code;
	
	@Schema(description = "응답 메시지", example = "OK")
	private String message;
	
	@Schema(description = "응답 데이터")
	private T result;
	
	public BaseResponseDto(HttpStatus status, T result) {
		this.code = status.value();
		this.message = status.getReasonPhrase();
		this.result = result;
	}
}
