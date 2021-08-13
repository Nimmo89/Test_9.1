package ru.netology.domain;

public class Comment {
    private int count;  //счетчик комментариев
    private int canPost;  //доступ к комментарию

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }
}
