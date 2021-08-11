package ru.netology.domain;

public class Post {
    private int id;  //индетификатор поста
    private int ownerId;  //индетификатор создателя поста (как оказалось это стены владельца)
    private int date;  //дата публикации
    private int friends;  //для друзей (Пометка только для друзей)
    private Comment comment;  //комментарии
    private Like like; // отметка нравится
    private Repost repost; // отметка о репостах
    private View view;  // счетчик просмотров
    private int anchor;  //закрепить запись (canPin in VK)
    private int del;  //удаление (canDelete in VK)
    private int edit; //редактирование (canEdit in VK)
    private boolean favorite;  //закладка, избранное (isFavorite in VK)

    private int fromID;  // индетификатор автора записи
    private int createdID;  //индетификатор администратора
    private String test; // текст поста
    private int replyOwnerID; // индетификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostID;  //индетификатор записи, в ответ на которую была оставлена текущая
    private Copyright copyright; //источник материала, объект с полями
    private String postType; //тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    private PostSource postSource; //информация о способе размещения записи
    private Geo geo;  //информация о местоположении
    private int signerID; //идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private int isPinned; //информация о том, что запись закреплена
    private int markedAsAsd; //информация о том, содержит ли запись отметку "реклама"
    private Donut donut; //информация о записи VK Donut
    private int postponedID; //идентификатор отложенной записи
}
