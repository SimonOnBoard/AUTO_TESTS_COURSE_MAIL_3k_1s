package tests.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class SuperMail extends Mail {
    SuperMail(String receiver, String text) {
        super(receiver, text);
    }

    public SuperMail(String receiver, String text, String copyReceiver, String subject) {
        super(receiver, text);
        this.copyReceiver = copyReceiver;
        this.subject = subject;
    }
    @Getter @Setter
    private String copyReceiver;
    @Getter @Setter
    private String subject;
}
