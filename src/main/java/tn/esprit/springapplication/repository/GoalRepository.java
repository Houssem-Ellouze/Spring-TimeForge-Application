package tn.esprit.springapplication.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springapplication.entity.Goal;

@Repository
public interface GoalRepository extends MongoRepository<Goal, Integer> {
}