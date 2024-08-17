package com.project.uber.uberApp.advices;

import org.springframework.http.HttpStatus;

public class ApiError {
    private HttpStatus status;
    private String message;

    // Private constructor to force usage of builder

    public ApiError(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    private ApiError() {}

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public static Builder builder() {
        return new ApiError().new Builder();
    }

    public class Builder {
        private Builder() {}

        public Builder status(HttpStatus status) {
            ApiError.this.status = status;
            return this;
        }

        public Builder message(String message) {
            ApiError.this.message = message;
            return this;
        }

        public ApiError build() {
            return ApiError.this;
        }
    }
}


