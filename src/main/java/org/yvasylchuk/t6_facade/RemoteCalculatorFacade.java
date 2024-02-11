package org.yvasylchuk.t6_facade;

/**
 * Фасад для удаленного калькулятора. Предоставляет простой интерфейс для работы с удаленным
 * калькулятором http://newton.now.sh. Необходимо реализовать методы для выполнения следующих операций:
 *
 * 1) Сложение
 * 2) Вычитание
 * 3) Умножение
 * 4) Деление
 *
 * Все методы должны принимать два int-а и возвращать результат операции - тоже int.
 * Для начала нужно создать поле с клиентом, который будет делать запросы к серверу.
 * Пример создания клиента:
 *      private final HttpClient client = HttpClient.newBuilder().followRedirects(HttpClient.Redirect.ALWAYS).build();
 * Пример того как делать запросы к серверу:
 *
 *      HttpResponse<String> rsp = client.send(
 *          HttpRequest.newBuilder()
 *                     .GET()
 *                     .uri(new URI("https://newton.now.sh/api/v2/simplify/" + URLEncoder.encode("2*5+8^3", StandardCharsets.UTF_8)))
 *                     .build(),
 *          HttpResponse.BodyHandlers.ofString()
 *      );
 *
 *     В данном примере выполняется GET запрос к серверу newton.now.sh с параметром "2*5+8^3".
 *     Для решения нашей задачи достаточно заменить "2*5+8^3" на строку с нашим выражением: например "2+2".
 *     Тут используется URLEncoder.encode так как выражение может содержать символы, которые нельзя использовать в URL.
 *
 *     Возвращаемое значение содержит различные поля, но нас интересует только тело ответа, которое можно получить
 *     вызвав метод body() у объекта HttpResponse.
 *
 *     Пример ответа: {"operation":"simplify","expression":"2*5+8^3","result":"522"}
 *
 *     Как видно, результат возвращается в формате JSON, поэтому для получения результата ответ нужно распарсить.
 *     Для этого можно использовать библиотеку Jackson.
 *
 *     1) Сначала создаем поле private final ObjectMapper mapper = new ObjectMapper();
 *     2) Далее в методе, который делает запрос, парсим ответ:
 *         ...
 *         String strResult = mapper.readTree(rsp.body()).get("result").asText();
 *         Integer result = Integer.parseInt(strResult);
 *         ...
 *         return result;
 */
public class RemoteCalculatorFacade {
}
