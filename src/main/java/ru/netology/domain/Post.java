package ru.netology.domain;

public class Post {
    private int id;  //индетификатор поста
    private int ownerId;  //индетификатор создателя поста
    private int date;  //дата публикации
    private int friends;  //для друзей
    private Comments comements;  //комментарии
    private Likes likesl; // отметка нравится
    private int anchor;  //закрепить запись
    private int del;  //удаление
    private int edit; //редактирование
    private boolean favorite;  //закладка, избранное

}
