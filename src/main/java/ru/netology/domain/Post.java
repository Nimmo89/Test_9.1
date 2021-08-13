package ru.netology.domain;

public class Post {
    //v1
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getFriends() {
        return friends;
    }

    public void setFriends(int friends) {
        this.friends = friends;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Like getLike() {
        return like;
    }

    public void setLike(Like like) {
        this.like = like;
    }

    public Repost getRepost() {
        return repost;
    }

    public void setRepost(Repost repost) {
        this.repost = repost;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public int getAnchor() {
        return anchor;
    }

    public void setAnchor(int anchor) {
        this.anchor = anchor;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    public int getEdit() {
        return edit;
    }

    public void setEdit(int edit) {
        this.edit = edit;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    //v2
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

    public int getFromID() {
        return fromID;
    }

    public void setFromID(int fromID) {
        this.fromID = fromID;
    }

    public int getCreatedID() {
        return createdID;
    }

    public void setCreatedID(int createdID) {
        this.createdID = createdID;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public int getReplyOwnerID() {
        return replyOwnerID;
    }

    public void setReplyOwnerID(int replyOwnerID) {
        this.replyOwnerID = replyOwnerID;
    }

    public int getReplyPostID() {
        return replyPostID;
    }

    public void setReplyPostID(int replyPostID) {
        this.replyPostID = replyPostID;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public int getSignerID() {
        return signerID;
    }

    public void setSignerID(int signerID) {
        this.signerID = signerID;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAsd() {
        return markedAsAsd;
    }

    public void setMarkedAsAsd(int markedAsAsd) {
        this.markedAsAsd = markedAsAsd;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public int getPostponedID() {
        return postponedID;
    }

    public void setPostponedID(int postponedID) {
        this.postponedID = postponedID;
    }
}
