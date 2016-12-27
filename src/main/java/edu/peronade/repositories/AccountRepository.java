package edu.peronade.repositories;

import edu.peronade.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by peronade on 23.12.16.
 */
public interface AccountRepository extends JpaRepository<Account, Long>
{
    Optional<Account> findByUsername(String username);
}
