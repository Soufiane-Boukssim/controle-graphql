package ma.xproce.devoirsurveille.web;

import lombok.AllArgsConstructor;
import ma.xproce.devoirsurveille.dto.ComputerDto;
import ma.xproce.devoirsurveille.services.ComputerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ComputerGraphQLController {
    private ComputerService computerService;

    @MutationMapping
    public ComputerDto saveComputer(@Argument ComputerDto computer){
        return computerService.saveComputer(computer);
    }

    @QueryMapping
    public List<ComputerDto> getComputersByProce(@Argument String proce){
        return computerService.getComputersByProce(proce);
    }
}
