package ma.xproce.devoirsurveille;

import ma.xproce.devoirsurveille.dto.ComputerDto;
import ma.xproce.devoirsurveille.services.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DevoirsurveilleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevoirsurveilleApplication.class, args);
    }


    @Bean
    CommandLineRunner start(ComputerService computerService){
        return  args -> {
            computerService.saveComputer(
                            ComputerDto.builder().proce("i5 10").ram("8GB").hardDrive("250 SSD").price(1000).macAddress("").build()
            );
        };
    }

}
