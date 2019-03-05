package ycd.org.dungeonandancestry.models.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ycd.org.dungeonandancestry.models.descend;

@Repository
@Transactional
public interface DescendDao extends CrudRepository<descend, Integer>
{

}
