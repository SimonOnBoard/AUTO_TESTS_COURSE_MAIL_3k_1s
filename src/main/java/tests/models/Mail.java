package tests.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Mail {
    private String receiver;
    private String text;
}
