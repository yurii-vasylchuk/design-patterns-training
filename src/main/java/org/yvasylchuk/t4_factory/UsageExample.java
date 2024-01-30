package org.yvasylchuk.t4_factory;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.Month;

public class UsageExample {
    public static void main(String[] args) {
// Без применения фабрики
        Transaction credit = new Transaction(Transaction.BANK_ACCOUNT_IBAN,
                "UA123456789074538564037264397",
                new BigInteger("500.75"),
                LocalDateTime.now().plusDays(1));

        try {
            // Amount должен быть положительным
            Transaction transfer = new Transaction("UA123456789074538564037264397",
                    "UA123456789074538564037255597",
                    new BigInteger("-345.12"),
                    LocalDateTime.of(2022, Month.APRIL, 1, 12, 15, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

// С применением фабрики:
//        Transaction credit = Transaction.credit("UA123456789074538564037264397",
//                "500.75",
//                LocalDateTime.parse("2021-04-01T12:15:00"));
        System.out.println(credit);
    }
}
