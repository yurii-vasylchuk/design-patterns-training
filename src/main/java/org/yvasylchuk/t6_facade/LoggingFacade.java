package org.yvasylchuk.t6_facade;

import java.net.http.HttpClient;

/**
 * Facade for logging. Необходим для логирования сообщений в консоль с указанием времени и типа сообщения.
 * Базовый вывод в консоль можно сделать через System.out.println, но, чтобы каждый раз не писать
 * дату и время, а также тип сообщения, можно создать класс-фасад, который будет делать это за нас.
 * Необходимо реализовать методы info и error, которые будут выводить сообщения вида:
 * .info("message 1") -> [2023-02-07 21:25:14] INFO message 1
 * .error("message 2") -> [2023-02-07 21:25:14] ERROR message 2
 */
public class LoggingFacade {
}
