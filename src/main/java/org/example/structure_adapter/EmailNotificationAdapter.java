package org.example.structure_adapter;

public class EmailNotificationAdapter implements NotificationService{

    private static final String GMAIL = "bebe@gmail.com";

    private EmailAllertSystem emailAllertSystem;

    public EmailNotificationAdapter(EmailAllertSystem emailAllertSystem){
        this.emailAllertSystem = emailAllertSystem;
    }



    @Override
    public void sendNotification(String message) {
        emailAllertSystem.sendEmail(GMAIL, message);
    }
}
