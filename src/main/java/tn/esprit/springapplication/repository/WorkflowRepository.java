package tn.esprit.springapplication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springapplication.entity.Reward;
import tn.esprit.springapplication.entity.Workflow;

@Repository
public interface WorkflowRepository extends MongoRepository<Workflow, Integer> {
}
