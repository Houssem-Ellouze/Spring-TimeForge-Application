package tn.esprit.springapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "workflows")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Workflow {
    @Id
    private int id;
    private String WorkflowName;

    @DBRef
    private Workspace workspace;

    //@DBRef
    //List<User> users;
}
