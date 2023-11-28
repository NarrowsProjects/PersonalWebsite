package application.repositories;

import application.models.Worry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface WorryRepository extends JpaRepository<Worry, Integer> {

    List<Worry> findWorriesByTypeAndName(String name, String type);
    List<Worry> findWorriesByName(String name);
    List<Worry> findWorriesByType(String type);

}
