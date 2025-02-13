package tn.esprit.springapplication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springapplication.entity.Reward;
import tn.esprit.springapplication.entity.Workspace;

@Repository
public interface WorkspaceRepository extends MongoRepository<Workspace, Integer> {
}
