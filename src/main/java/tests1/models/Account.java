package tests1.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
    private String login;
    private String password;
    private String domain;
}
