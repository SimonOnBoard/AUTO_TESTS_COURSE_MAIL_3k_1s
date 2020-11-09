package tests1.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Page {
    private String url;
    private int height;
    private int width;
}
