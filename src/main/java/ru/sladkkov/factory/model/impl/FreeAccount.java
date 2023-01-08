package ru.sladkkov.factory.model.impl;

import ru.sladkkov.factory.model.Account;

public class FreeAccount implements Account {

    @Override
    public String getAccountType() {
        return "FreeAccount";
    }
}
