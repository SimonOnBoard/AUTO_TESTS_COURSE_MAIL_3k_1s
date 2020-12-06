import tests1.models.Mail;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;
import java.util.Random;

public class Generator {
    public static void main(String[] args) throws JAXBException {
        Random random = new Random();
        int stringLength = random.nextInt(20);
        Mail mail = new Mail(getRandomStringLength(stringLength) + "@mail.ru", getRandomStringLength(stringLength));
        writeToFile("mail.xml", mail);
    }

    private static void writeToFile(String fileName, Mail mail) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Mail.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(mail, new File(fileName));
    }

    private static String getRandomStringLength(int stringLength) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        return random.ints(leftLimit, rightLimit + 1)
                .limit(stringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
