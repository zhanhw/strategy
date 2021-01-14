package com.example.strategy.builder;

/**
 * 建造者模式
 *
 * @author aw
 * @date 2021/1/14 10:10
 */
public class BaseMessageData {

    private String tag;
    private String body;
    private String messageId;
    private String messageKey;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }

    public BaseMessageData() {
    }

    public BaseMessageData(String tag, String body, String messageId, String messageKey) {
        this.tag = tag;
        this.body = body;
        this.messageId = messageId;
        this.messageKey = messageKey;
    }

    public static BaseMessageData.BaseMessageDataBuilder builder() {
        return new BaseMessageData.BaseMessageDataBuilder();
    }

    public static class BaseMessageDataBuilder {
        private String tag;
        private String body;
        private String messageId;
        private String messageKey;

        BaseMessageDataBuilder() {
        }

        public BaseMessageData.BaseMessageDataBuilder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public BaseMessageData.BaseMessageDataBuilder body(String body) {
            this.body = body;
            return this;
        }

        public BaseMessageData.BaseMessageDataBuilder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        public BaseMessageData.BaseMessageDataBuilder messageKey(String messageKey) {
            this.messageKey = messageKey;
            return this;
        }

        public BaseMessageData build() {
            return new BaseMessageData(this.tag, this.body, this.messageId, this.messageKey);
        }

    }

}
