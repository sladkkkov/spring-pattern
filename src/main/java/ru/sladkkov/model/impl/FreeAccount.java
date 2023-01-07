package ru.sladkkov.model.impl;

import ru.sladkkov.model.Account;

public class FreeAccount implements Account {

    @Override
    public String getAccountType() {
        return "FreeAccount";
    }
}
