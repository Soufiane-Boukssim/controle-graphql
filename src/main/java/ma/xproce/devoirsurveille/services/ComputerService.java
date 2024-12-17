package ma.xproce.devoirsurveille.services;

import ma.xproce.devoirsurveille.dto.ComputerDto;

import java.util.List;

public interface ComputerService {
    public ComputerDto saveComputer(ComputerDto computerDto);
    public List<ComputerDto> getComputersByProce(String proce);
}
