package tests2.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "mail")
@XmlType(propOrder = {"receiver","text"})
public class Mail {
    private String receiver;
    private String text;
}
