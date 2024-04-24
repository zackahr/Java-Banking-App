package zackjava.bankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zackjava.bankingapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
