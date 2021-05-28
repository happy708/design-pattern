package com.joyguru.builder;

public class Form {
    private String username;
    private String password;
    private int height;
    private int weight;
    private String birthdate;
    private String nickname;

    private Form(String username, String password)
    {
        this.username = username;
        this.password = password;
        this.height = 10;
        this.weight = 20;
        this.birthdate = "2020-09-01";
        this.nickname = "";
    }

    public static class FormBuilder
    {
        private Form form;
        public FormBuilder(String username, String password)
        {
            form = new Form(username, password);
        }

        public FormBuilder setUsername(String username) {
            form.username = username;
            return this;
        }

        public FormBuilder setPassword(String password) {
            form.password = password;
            return this;
        }

        public FormBuilder setHeight(int height) {
            form.height = height;
            return this;
        }

        public FormBuilder setWeight(int weight) {
            this.form.weight = weight;
            return this;
        }

        public FormBuilder setBirthdate(String birthdate) {
            form.birthdate = birthdate;
            return this;
        }

        public FormBuilder setNickname(String nickname) {
            form.nickname = nickname;
            return this;
        }

        public Form build()
        {
            return form;
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return "Form{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", birthdate='" + birthdate + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
