package application.repositories;

import application.models.Worry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface WorryRepository extends JpaRepository<Worry, Integer> {

    @Query("select w from Worry w group by w.name")
    List<String> findAllNames();

    List<Worry> findWorriesByTypeAndName(String name, String type);
    List<Worry> findWorriesByName(String name);
    List<Worry> findWorriesByType(String type);

}
