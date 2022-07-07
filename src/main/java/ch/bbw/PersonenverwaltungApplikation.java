package ch.bbw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonenverwaltungApplikation {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(PersonenverwaltungApplikation.class, args);
    }
}

/**Die folgenden technischen Rahmenbedingungen sollen im Projekt eingehalten werden:
 * -Spring Boot und Thymeleaf als Basistechnologie-Bootstrap als Layout und Gestaltungsmittel
 * -CDI für die Umsetzung einer mehrschichtigen Architektur
 * -JPA für die Speicherung der Personendaten
 * -MySQL bzw. MariaDB als persistenten Datenspeicher**/