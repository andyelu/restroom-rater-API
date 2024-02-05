package com.example.restroomraterapi.restrooms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RestroomConfig {

    @Bean
    CommandLineRunner commandLineRunner(RestroomRepository repository) {
        return args -> {
            Restroom Fred = new Restroom("Fred Fox School of Music", "1017 N Olive Rd, Tucson, AZ 85721");
            Restroom John = new Restroom("John W. Harshbarger Building", "1133 E James E. Rogers Way, Tucson, AZ 85719");
            Restroom Student = new Restroom("Student Union Memorial Center", "1303 E University Blvd, Tucson, AZ 85721");
            Restroom Engineering = new Restroom("Engineering", "1127 James E. Rogers Way, Tucson, AZ 85719");
            Restroom Cesar = new Restroom("Cesar E. Chavez Building", "1110 James E. Rogers Way, Tucson, AZ 85719");
            Restroom Communication = new Restroom("Communication", "1103 E University Blvd, Tucson, AZ 85721");
            Restroom Social = new Restroom("Social Sciences", "1145 E South Campus Dr, Tucson, AZ 85719");
            Restroom Douglass = new Restroom("Douglass", "1100 E University Blvd, Tucson, AZ 85719");
            Restroom Arizona = new Restroom("Arizona State Museum South", "1010 E University Blvd, Tucson, AZ 85719");
            Restroom Shantz = new Restroom("Shantz", "1177 E 4th St, Tucson, AZ 85719");
            Restroom Chemistry = new Restroom("Chemistry", "1306 E University Blvd, Tucson, AZ 85721");
            Restroom Albert = new Restroom("Albert B. Weaver Science-Engineering Library", "744 N Highland Ave, Tucson, AZ 85719");
            Restroom Main = new Restroom("Main Library", "1510 E University Blvd, Tucson, AZ 85721");
            Restroom Bear = new Restroom("Bear Down Building", "1428 E University Blvd, Tucson, AZ 85721");
            Restroom Bartlett = new Restroom("Bartlett Academic Success Center", "1435 E 4th St, Tucson, AZ 85719");
            Restroom Steward = new Restroom("Steward Observatory", "933 N Cherry Ave, Tucson, AZ 85719");
            Restroom Modern = new Restroom("Modern Languages", "1423 E University Blvd, Tucson, AZ 85719");
            Restroom Psychology = new Restroom("Psychology", "1503 E University Blvd, Tucson, AZ 85721");
            Restroom Education = new Restroom("Education", "1430 E 2 St, Tucson, AZ 85721");
            Restroom Manuel = new Restroom("Manuel Pacheco Integrated Learning Center", "1500 E University Blvd, Tucson, AZ 85721");
            Restroom Speech = new Restroom("Speech And Hearing Sciences", "1131 E 2 St, Tucson, AZ 85721");
            Restroom Civil = new Restroom("Civil Engineering", "1209 E 2 St, Tucson, AZ 85719");
            Restroom Richard = new Restroom("Richard A. Harvill Building", "1103 E 2 St, Tucson, AZ 85721");
            Restroom GouldSimpson = new Restroom("Gould-Simpson", "1040 E 4th St, Tucson, AZ 85719");
            Restroom McClellandPark = new Restroom("McClelland Park", "650 N Park Ave, Tucson, AZ 85719");
            Restroom Biological = new Restroom("Biological Sciences West", "1041 E Lowell St, Tucson, AZ 85719");
            Restroom Mathematics = new Restroom("Mathematics", "617 N Santa Rita Ave, Tucson, AZ 85721");
            Restroom MathLab = new Restroom("Mathematics Teaching Laboratory", "east, 1129 E Lowell St, Tucson, AZ 85719");
            Restroom Animal = new Restroom("Animal and Comparative Biomedical Sciences", "1117 E Lowell St #222, Tucson, AZ 85721");
            Restroom Flandrau = new Restroom("Flandrau Science Center And Planetarium", "1601 E University Blvd, Tucson, AZ 85721");
            Restroom Ina = new Restroom("Ina E. Gittings Building", "1737 E University Blvd, Tucson, AZ 85719");
            Restroom CCP = new Restroom("John P. Schaefer Center For Creative Photography", "1230 E Speedway Blvd, Tucson, AZ 85719");
            Restroom Electrical = new Restroom("Electrical And Computer Engineering", "1230 E Speedway Blvd, Tucson, AZ 85719");
            Restroom Learning = new Restroom("Learning Services Building", "1512 E 1 St, Tucson, AZ 85719");
            Restroom Computer = new Restroom("Computer Center", "1077 N Highland Ave");
            Restroom SBS = new Restroom("SBS 1st Street Annex", "1515 E 1 St");
            Restroom Arch = new Restroom("College Of Architecture, Planning, And Landscape Architecture - West", "1040 N Olive Rd");
            Restroom McClellandHall = new Restroom("McClelland Hall", "1130 E Helen St, Tucson, AZ 85721");
            Restroom Aerospace = new Restroom("Aerospace And Mechanical Engineering", "1130 N Mountain Ave, Tucson, AZ 85721");
            Restroom Helen = new Restroom("Helen S. Schaefer Building", "1508 E Helen St, Tucson, AZ 85719");
            Restroom WA = new Restroom("W.A. Franke Honors College", "1101 E Mabel St, Tucson, AZ 85719");
            Restroom Applied = new Restroom("Applied Research Building", "1420 E Helen St, Tucson, AZ 85719");
            Restroom College = new Restroom("College Of Law Building", "1201 E Speedway Blvd, Tucson, AZ 85721");

            repository.saveAll(List.of(Fred, John, Student, Engineering, Cesar,
                    Communication, Social, Douglass, Arizona, Shantz, Chemistry,
                    Albert, Main, Bear, Bartlett, Steward, Modern, Psychology,
                    Education, Manuel, Speech, Civil, Richard, GouldSimpson,
                    McClellandPark, Biological, Mathematics, MathLab, Animal,
                    Flandrau, Ina, CCP, Electrical, Learning, Computer, SBS,
                    Arch, McClellandHall, Aerospace, Helen, WA, Applied, College));

        };


    };
}
