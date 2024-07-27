package com.woongjin.pjt.core.web.response;

import lombok.Builder;

public class ApiResponse<T> {

    private T result;

    private String resultCode;

    private String resultMessage;

    @Builder
    public ApiResponse(T result, String resultCode, String resultMessage) {
        this.result = result;
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }

}
