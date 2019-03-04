package org.wecancodeit.userreviewsite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.userreviewsite.models.Comment;


public interface CommentRepository extends CrudRepository<Comment, Long> {

}
