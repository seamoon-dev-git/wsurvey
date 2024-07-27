package com.woongjin.pjt.core.web.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ErrorResponse {

    private int status;             //http status 코드

    private String errorCode;       //에러 코드 값

    private String errorMessage;    //에러 메세지

    private String errorReason;     //에러 사유

}
