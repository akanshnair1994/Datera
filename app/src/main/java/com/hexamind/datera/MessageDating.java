package com.hexamind.datera;

import java.sql.Timestamp;

public class MessageDating {
    private int messageId;
    private int senderUserId;
    private int receiverUserId;
    private int delivered;
    private String chat;
    private Timestamp timeMessage;

    public MessageDating(int messageId, int senderUserId, int receiverUserId, int delivered, String chat, Timestamp timeMessage) {
        this.messageId = messageId;
        this.senderUserId = senderUserId;
        this.receiverUserId = receiverUserId;
        this.delivered = delivered;
        this.chat = chat;
        this.timeMessage = timeMessage;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public int getSenderUserId() {
        return senderUserId;
    }

    public void setSenderUserId(int senderUserId) {
        this.senderUserId = senderUserId;
    }

    public int getReceiverUserId() {
        return receiverUserId;
    }

    public void setReceiverUserId(int receiverUserId) {
        this.receiverUserId = receiverUserId;
    }

    public int getDelivered() {
        return delivered;
    }

    public void setDelivered(int delivered) {
        this.delivered = delivered;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public Timestamp getTimeMessage() {
        return timeMessage;
    }

    public void setTimeMessage(Timestamp timeMessage) {
        this.timeMessage = timeMessage;
    }
}
