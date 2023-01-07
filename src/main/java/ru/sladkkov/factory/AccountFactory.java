package ru.sladkkov.factory;

import ru.sladkkov.factory.impl.FreeAccountFactory;
import ru.sladkkov.factory.impl.PaidAccountFactory;
import ru.sladkkov.model.Account;

public interface AccountFactory {

    Account getAccount();

    static AccountFactory getAccountFactory(String accountType) {
        return switch (accountType) {
            case "free" -> new FreeAccountFactory();
            case "paid" -> new PaidAccountFactory();
            default -> throw new RuntimeException(accountType + " is unknown account");
        };
    }
}
