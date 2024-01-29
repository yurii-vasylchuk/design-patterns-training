package org.yvasylchuk.t1_builder;

public class UsageExample {
    public static void main(String[] args) {
        Model result = Model.builder()
//                .name("John")
//                .surname("Doe")
//                .email("john.doe@gmail.com")
//                .age(25)
//                .skype("john.doe")
                .build();

        System.out.println(result);


        try {
            Model result2 = Model.builder()
//                    .name("John")
//                    .surname("Doe")
//                    .skype("john.doe")
                    .build();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
