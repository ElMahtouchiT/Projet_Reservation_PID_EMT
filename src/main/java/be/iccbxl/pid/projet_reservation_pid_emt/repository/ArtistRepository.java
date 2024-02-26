package be.iccbxl.pid.projet_reservation_pid_emt.repository;

import be.iccbxl.pid.projet_reservation_pid_emt.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
    Artist findById(long id);
}
