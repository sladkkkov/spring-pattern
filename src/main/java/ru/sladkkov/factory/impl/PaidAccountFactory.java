package ru.sladkkov.factory.impl;


import ru.sladkkov.factory.AccountFactory;
import ru.sladkkov.model.Account;
import ru.sladkkov.model.impl.PaidAccount;

public class PaidAccountFactory implements AccountFactory {


    @Override
    public Account getAccount() {
        return new PaidAccount();
    }
}
