package ru.netology.domain;

public class Like {
    //v1
    private int count;
    private int userLike;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserLike() {
        return userLike;
    }

    public void setUserLike(int userLike) {
        this.userLike = userLike;
    }


    //v2
    private int canLike; //информация о том, может ли текущий пользователь поставить отметку «Мне нравится»
    private int canPublish; //информация о том, может ли текущий пользователь сделать репост записи

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}
