package org.yvasylchuk.t1_builder;

/**
 * Fields: name and email are required.
 * Other fields are optional.
 */
public class Model {
    private String name;
    private String email;
    private String surname;
    private Integer age;
    private String address;
    private String phone;
    private String skype;


    public static ModelBuilder builder() {
        return new ModelBuilder();
    }

    public static class ModelBuilder {
        private String name;

        public ModelBuilder name(String name) {
            this.name = name;
            return this;
        }

        //Write code here
        private ModelBuilder() {
        }

        public Model build() {
            // Если не указаны обязательные поля, то бросаем исключение IllegalStateException
            // с сообщением "name and email are required fields"
            return null;
        }
    }

    private Model(String name, String email, String surname, int age, String address, String phone, String skype) {
        this.name = name;
        this.email = email;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.skype = skype;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getSkype() {
        return skype;
    }

    @Override
    public String toString() {
        return "Model{" + "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", skype='" + skype + '\'' +
                '}';
    }
}
