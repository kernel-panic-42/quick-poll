package io.example.dto.error;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * https://datatracker.ietf.org/doc/html/draft-nottingham-http-problem-06
 * 
 */
@Getter
@Setter
public class ErrorDetail {
    private String title;
    private int status;
    private String detail;
    private long timeStamp;
    private String developerMessage;

}
