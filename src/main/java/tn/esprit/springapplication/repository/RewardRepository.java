package tn.esprit.springapplication.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springapplication.entity.Reward;

@Repository
public interface RewardRepository extends MongoRepository<Reward, Integer> {
}