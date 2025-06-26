package br.edu.ifmg.escola;

import br.edu.ifmg.escola.entities.Enrollment;
import br.edu.ifmg.escola.entities.Offer;
import br.edu.ifmg.escola.entities.Role;
import br.edu.ifmg.escola.entities.User;
import br.edu.ifmg.escola.entities.pk.EnrollmentPk;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;

@SpringBootApplication
public class EscolaApplication {

	public static void main(String[] args) {

		SpringApplication.run(EscolaApplication.class, args);
        /*
		User user = new User();
		Offer offer = new Offer();
		EnrollmentPk pk = new EnrollmentPk(user, offer);

		Enrollment enrollment = new Enrollment();
		enrollment.setId(pk);
		enrollment.setAvailable(true);
		enrollment.setEnrollMoment(Instant.now());
		*/

	}

}
