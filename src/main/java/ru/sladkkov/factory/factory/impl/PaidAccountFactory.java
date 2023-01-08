package ru.sladkkov.factory.factory.impl;


import ru.sladkkov.factory.factory.AccountFactory;
import ru.sladkkov.factory.model.Account;
import ru.sladkkov.factory.model.impl.PaidAccount;

public class PaidAccountFactory implements AccountFactory {


    @Override
    public Account getAccount() {
        return new PaidAccount();
    }
}
