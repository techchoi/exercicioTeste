package repository;

import model.AgenciaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgenciaRepository extends JpaRepository<AgenciaModel, Long> {

}
