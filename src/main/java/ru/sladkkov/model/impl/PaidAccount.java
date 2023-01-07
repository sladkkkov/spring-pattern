package ru.sladkkov.model.impl;

import ru.sladkkov.model.Account;

public class PaidAccount implements Account {

    @Override
    public String getAccountType() {
        return "PaidAccount";
    }
}
