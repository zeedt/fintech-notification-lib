package com.fintech.notification.lib.model.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class EmailNotificationRequest implements Serializable {

    @NotEmpty
    private final List<String> recipients = new ArrayList<>();
    private final List<String> ccList = new ArrayList<>();
    private final List<String> bccList = new ArrayList<>();
    @NotBlank
    private String emailContent;
    @NotBlank
    private String sender;
    @NotBlank
    private String subject;
}
