package org.yvasylchuk.t7_tempalateMethod;

/**
 * <p>Этот класс демонстрирует использование ReportGenerator. Задача класса - сгенерировать отчеты в следующем формате:</p>
 * <pre>
 * 1 [Заголовок_1]: [Значение поля с заголовком 1 в 1м объекте отчета]
 * 2 [Заголовок_2]: [Значение поля с заголовком 2 в 1м объекте отчета]
 *
 * 1 [Заголовок_1]: [Значение поля с заголовком 1 во 2м объекте отчета]
 * 2 [Заголовок_2]: [Значение поля с заголовком 2 во 2м объекте отчета]
 * ...
 * </pre>
 * <p>Например, для класса BankAccount отчет будет выглядеть так:</p>
 * <pre>
 *     1 IBAN: UA1234567890
 *     2 Customer: John Doe
 *     3 Balance: 1000.00
 *     4 Expiration date: 2023-12-31
 *
 *     1 IBAN: UA0987654321
 *     2 Customer: Jane Lomard
 *     3 Balance: 2000.00
 *     4 Expiration date: 2024-12-31
 *     ...
 * </pre>
 *
 * <p>С одной стороны, классы BankAccount и Customer не имеют ничего общего, но с другой стороны, они оба могут быть
 * использованы для генерации отчетов в одном и том же формате. Поэтому, мы можем вынести общую логику в абстрактный
 * класс ReportGenerator, а классы BankAccountReportGenerator и CustomerReportGenerator будут его наследниками и
 * генерировать отчеты для объектов BankAccount и Customer соответственно.</p>
 *
 * <p>Для решения этой задачи я предлагаю использовать шаблонный метод (template method). Базовый класс ReportGenerator
 * сделаем абстрактным и определим в нем шаблонный метод generateReport(). Этот метод будет отвечать за общую логику
 * форматирования и генерации отчета. Этот метод называется шаблонным, потому что он определяет общую логику, которая
 * является шаблонной для всех наследников. Он будет использовать абстрактные методы getData() и getHeaders(), которые
 * будут реализованы в наследниках. Эти методы будут возвращать данные и заголовки для отчета соответственно.</p>
 *
 * <p>getHeaders() будет возвращать {@code List<String>}, где каждый элемент списка будет представлять собой заголовок
 * отчета - например, "IBAN", "Customer", "Balance", "Expiration date" в соответствии с полями объекта, под который
 * конкретный генератор отчета реализован. Этот список будет статичным: не будет зависеть от данных, которые будут
 * использованы для генерации отчета. Он будет зависеть только от типа объекта, под который разработан конкретный
 * генератор отчета.</p>
 *
 * <p>getData() будет возвращать {@code List<Map<String, String>>}, где каждый Map будет представлять собой один
 * элемент отчета, а ключи этого Map будут соответствовать заголовкам отчета - например:
 * </p>
 *
 * <pre>
 * List[
 *     MAP{
 *         "IBAN" -> "UA1234567890",
 *         "Customer" -> "John Doe",
 *         ...
 *     },
 *     MAP{
 *         "IBAN" -> "UA0987654321",
 *         "Customer" -> "Jane Smith",
 *         ...
 *     },
 *     ...
 * ]
 * </pre>
 *
 * <p>
 * Для начала, создадим абстрактный класс ReportGenerator и определим в нем шаблонный метод generateReport().
 * Затем реализуем класс BankAccountReportGenerator, который будет наследником класса ReportGenerator и будет
 * генерировать отчеты для объектов BankAccount. Данные для отчета будем хранить в поле класса, которое будет
 * инициализироваться в конструкторе. После этого реализуем методы getData() и getHeaders().
 * </p>
 * <p>
 * Только после этого (НЕ РАНЬШЕ!!!) реализуем класс CustomerReportGenerator, который будет генерировать отчеты для
 * объектов Customer. Его реализация будет аналогична реализации BankAccountReportGenerator. Когда реализуешь этот
 * класс - оцени, насколько легко было это сделать.
 * </p>
 */
public class UsageExample {

    public static void main(String[] args) {
//        ReportGenerator bankAccountReportGenerator = new BankAccountReportGenerator(List.of(
//                new BankAccount("UA1234567890", "John Doe", new BigDecimal("1000.00"), LocalDate.of(2023, 12, 31)),
//                new BankAccount("UA0987654321", "Jane Smith", new BigDecimal("2000.00"), LocalDate.of(2024, 12, 31)),
//                new BankAccount("UA0987654321", "Jane Doe", new BigDecimal("2000.00"), LocalDate.of(2024, 12, 31)),
//                new BankAccount("UA0987654321", "Jane Doe", new BigDecimal("2000.00"), LocalDate.of(2024, 12, 31)),
//                new BankAccount("UA0987654321", "Jane Doe", new BigDecimal("2000.00"), LocalDate.of(2024, 12, 31)),
//                new BankAccount("UA0987654321", "Jane Doe", new BigDecimal("2000.00"), LocalDate.of(2024, 12, 31)),
//                new BankAccount("UA0987654321", "Jane Doe", new BigDecimal("2000.00"), LocalDate.of(2024, 12, 31)),
//                new BankAccount("UA0987654321", "Jane Doe", new BigDecimal("2000.00"), LocalDate.of(2024, 12, 31)),
//                new BankAccount("UA0987654321", "Jane Doe", new BigDecimal("2000.00"), LocalDate.of(2024, 12, 31))
//        ));
//        System.out.println(bankAccountReportGenerator.generateReport());
//
//        ReportGenerator customerReportGenerator = new CustomerReportGenerator(List.of(
//                new Customer("John", "Doe", "+380123456789", LocalDate.of(1990, 1, 1)),
//                new Customer("Jane", "Doe", "+380987654321", LocalDate.of(1991, 1, 1)),
//                new Customer("Jane", "Doe", "+380987654321", LocalDate.of(1991, 1, 1)),
//                new Customer("Jane", "Doe", "+380987654321", LocalDate.of(1991, 1, 1)),
//                new Customer("Jane", "Doe", "+380987654321", LocalDate.of(1991, 1, 1))
//        ));
//        System.out.println(customerReportGenerator.generateReport());
    }
}
