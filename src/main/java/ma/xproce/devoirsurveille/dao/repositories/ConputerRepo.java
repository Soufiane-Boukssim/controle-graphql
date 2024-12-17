package ma.xproce.devoirsurveille.dao.repositories;

import ma.xproce.devoirsurveille.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConputerRepo extends JpaRepository<Computer,Integer> {

    List<Computer> findByProce(String proce);

}
