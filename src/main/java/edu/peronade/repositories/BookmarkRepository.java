package edu.peronade.repositories;

import edu.peronade.entity.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by peronade on 23.12.16.
 */
public interface BookmarkRepository extends JpaRepository<Bookmark, Long>
{
    Collection<Bookmark> findByAccountUsername(String username);
}
