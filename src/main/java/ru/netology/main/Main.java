package ru.netology.main;

import ru.netology.api.FormDate;
import ru.netology.api.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Юрий";
        post.patronymic = "Алексеевич";
        post.surname = "Гагарин";
        post.birthday.day = 9;
        post.birthday.month = 3;
        post.birthday.year = 1934;
        post.passport = "1961 № 090334";
        post.phone = "+7 (921)-124-19-61";
        post.subscription = true;
    }
}
