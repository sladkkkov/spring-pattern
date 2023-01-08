package ru.sladkkov.factory.factory;

import ru.sladkkov.factory.factory.impl.FreeAccountFactory;
import ru.sladkkov.factory.factory.impl.PaidAccountFactory;
import ru.sladkkov.factory.model.Account;

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
