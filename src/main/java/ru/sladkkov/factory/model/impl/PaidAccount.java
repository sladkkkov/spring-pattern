package ru.sladkkov.factory.model.impl;

import ru.sladkkov.factory.model.Account;

public class PaidAccount implements Account {

    @Override
    public String getAccountType() {
        return "PaidAccount";
    }
}
