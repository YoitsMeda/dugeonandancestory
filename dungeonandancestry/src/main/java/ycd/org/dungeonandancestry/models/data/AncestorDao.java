package ycd.org.dungeonandancestry.models.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ycd.org.dungeonandancestry.models.ancestor;

@Repository
@Transactional

public interface AncestorDao extends CrudRepository<ancestor, Integer>
{

}
