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
    private String linkedin;
    private String github;
    private String stackoverflow;
    private String facebook;
    private String twitter;
    private String instagram;
    private String telegram;
    private String viber;
    private String whatsapp;
    private String snapchat;
    private String pinterest;
    private String youtube;


    public static ModelBuilder builder() {
        return new ModelBuilder();
    }

    public static class ModelBuilder {
        //Write code here
        private ModelBuilder() {
        }

        public Model build() {
            // Если не указаны обязательные поля, то бросаем исключение IllegalStateException
            // с сообщением "name and email are required fields"
            return null;
        }
    }

    private Model(String name, String email, String surname, int age, String address, String phone, String skype, String linkedin, String github, String stackoverflow, String facebook, String twitter, String instagram, String telegram, String viber, String whatsapp, String snapchat, String pinterest, String youtube) {
        this.name = name;
        this.email = email;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.skype = skype;
        this.linkedin = linkedin;
        this.github = github;
        this.stackoverflow = stackoverflow;
        this.facebook = facebook;
        this.twitter = twitter;
        this.instagram = instagram;
        this.telegram = telegram;
        this.viber = viber;
        this.whatsapp = whatsapp;
        this.snapchat = snapchat;
        this.pinterest = pinterest;
        this.youtube = youtube;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getStackoverflow() {
        return stackoverflow;
    }

    public void setStackoverflow(String stackoverflow) {
        this.stackoverflow = stackoverflow;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public String getViber() {
        return viber;
    }

    public void setViber(String viber) {
        this.viber = viber;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getSnapchat() {
        return snapchat;
    }

    public void setSnapchat(String snapchat) {
        this.snapchat = snapchat;
    }

    public String getPinterest() {
        return pinterest;
    }

    public void setPinterest(String pinterest) {
        this.pinterest = pinterest;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
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
                ", linkedin='" + linkedin + '\'' +
                ", github='" + github + '\'' +
                ", stackoverflow='" + stackoverflow + '\'' +
                ", facebook='" + facebook + '\'' +
                ", twitter='" + twitter + '\'' +
                ", instagram='" + instagram + '\'' +
                ", telegram='" + telegram + '\'' +
                ", viber='" + viber + '\'' +
                ", whatsapp='" + whatsapp + '\'' +
                ", snapchat='" + snapchat + '\'' +
                ", pinterest='" + pinterest + '\'' +
                ", youtube='" + youtube + '\'' +
                '}';
    }
}
