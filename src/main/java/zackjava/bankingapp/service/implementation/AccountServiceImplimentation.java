package zackjava.bankingapp.service.implementation;

import org.springframework.stereotype.Service;
import zackjava.bankingapp.dto.AccountDto;
import zackjava.bankingapp.entity.Account;
import zackjava.bankingapp.entity.mapper.AccountMapper;
import zackjava.bankingapp.repository.AccountRepository;
import zackjava.bankingapp.service.AccountService;

@Service
public class AccountServiceImplimentation implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImplimentation(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
        Account account = accountRepository.
                findById(id)
                .orElseThrow(() -> new RuntimeException("Account does not exists"));
        return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public AccountDto deposit(Long id, double amount) {
        Account account = accountRepository.
                findById(id)
                .orElseThrow(() -> new RuntimeException("Account does not exists"));

        double total = account.getBalance() + amount;
        account.setBalance(total);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

}
