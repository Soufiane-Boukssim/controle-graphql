package ma.xproce.devoirsurveille.mappers;

import ma.xproce.devoirsurveille.dao.entities.Computer;
import ma.xproce.devoirsurveille.dto.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {

    private final ModelMapper mapper = new ModelMapper();

    public Computer fromComputerDtoToComputer(ComputerDto computerDTO) {
        return mapper.map(computerDTO, Computer.class);
    }

    public ComputerDto fromComputerToComputerDto(Computer computer) {
        return mapper.map(computer, ComputerDto.class);
    }


}
