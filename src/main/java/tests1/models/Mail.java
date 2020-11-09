package tests1.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Mail {
    private String receiver;
    private String text;
}
