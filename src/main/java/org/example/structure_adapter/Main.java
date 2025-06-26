package org.example.structure_adapter;

public class Main {
    public static void main(String[] args) {
        EmailAllertSystem emailAllertSystem = new EmailAllertSystem();
        EmailNotificationAdapter emailNotificationAdapter = new EmailNotificationAdapter(emailAllertSystem);
        emailNotificationAdapter.sendNotification("Система перегружена");
    }
}
