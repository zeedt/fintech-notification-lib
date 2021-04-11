package com.fintech.notification.lib.model.request;

import lombok.Data;

@Data
public class SmsNotificationRequest {
    private String phoneNumber;
    private String messageContent;
    private String sender;
}
