package ma.xproce.devoirsurveille.services;

import lombok.AllArgsConstructor;
import ma.xproce.devoirsurveille.dao.entities.Computer;
import ma.xproce.devoirsurveille.dao.repositories.ConputerRepo;
import ma.xproce.devoirsurveille.dto.ComputerDto;
import ma.xproce.devoirsurveille.mappers.ComputerMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService {
    private ConputerRepo conputerRepo;
    private ComputerMapper computerMapper;


    @Override
    public ComputerDto saveComputer(ComputerDto computerDto) {
        Computer computer = computerMapper.fromComputerDtoToComputer(computerDto);
        computer= conputerRepo.save(computer);
        computerDto= computerMapper.fromComputerToComputerDto(computer);
        return computerDto;
    }

    @Override
    public List<ComputerDto> getComputersByProce(String proce) {
        List<Computer> computers = conputerRepo.findByProce(proce);
        List<ComputerDto> computersDto = new ArrayList<>();
        for (Computer computer : computers) {
            computersDto.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computersDto;
    }
}
