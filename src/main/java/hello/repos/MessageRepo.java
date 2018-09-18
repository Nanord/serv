package hello.repos;

import hello.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {

    Iterable<Message> findByTag(String tag);

}
