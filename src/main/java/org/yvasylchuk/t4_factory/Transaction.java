package org.yvasylchuk.t4_factory;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class Transaction {
    public static final String BANK_ACCOUNT_IBAN = "UA123456789074538564037264397";

    private String ibanFrom;
    private String ibanTo;
    private BigInteger amount;
    private LocalDateTime dateTime;
    private TrnsactionType type;

    public Transaction(String ibanFrom, String ibanTo, BigInteger amount, LocalDateTime dateTime, TrnsactionType type) {
        //TODO: бросать исключение из конструктора - плохая практика. Нужно использовать фабрику
        //TODO: Конструктор должен быть максимально простым. Вся логика должна быть в фабрике
        if (amount.compareTo(BigInteger.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount should be positive");
        }

        if (ibanFrom == null || ibanFrom.isBlank()) {
            throw new IllegalArgumentException("ibanFrom should not be empty");
        }

        if (ibanTo == null || ibanTo.isBlank()) {
            throw new IllegalArgumentException("ibanTo should not be empty");
        }

        if (dateTime == null) {
            throw new IllegalArgumentException("dateTime should not be null");
        }

        if (ibanFrom.equals(ibanTo)) {
            throw new IllegalArgumentException("ibanFrom should not be equal to ibanTo");
        }

        if (dateTime.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("dateTime should not be in the past");
        }

        this.ibanFrom = ibanFrom;
        this.ibanTo = ibanTo;
        this.amount = amount;
        this.dateTime = dateTime;
        this.type = type;
    }

    // TODO: Добавить фабричные методы для создания транзакций: credit, debit, transfer
    // credit - пополнение счета (например банк возвращает проценты по депозиту), ibanFrom = BANK_ACCOUNT_IBAN, type = CREDIT
    // debit - оплата чего-то (например комиссия банка или плата за обслуживание), ibanTo = BANK_ACCOUNT_IBAN, type = DEBIT
    // transfer - перевод средств c одного счета на другой. type = TRANSFER

    public enum TrnsactionType {
        CREDIT,
        DEBIT,
        TRANSFER
    }
}
