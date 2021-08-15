package ru.netology.manager;

public class WallSearch {
    int ownerID = 12476453;  //идентификатор пользователя или сообщества
    String domain = "url"; //короткий адрес пользователя или сообщества
    String query = "запрос"; //поисковой запрос
    boolean ownersOnly = true; //true — возвращать только записи от имени владельца стены
    int count = 20; //количество записей, которые необходимо вернуть
    int offset = 0; //смещение, необходимо для получения определенного подмножества результатов

    public WallSearch(int ownerID, String domain, String query, boolean ownersOnly, int count, int offset) {
        this.ownerID = ownerID;
        this.domain = domain;
        this.query = query;
        this.ownersOnly = ownersOnly;
        this.count = count;
        this.offset = offset;
    }


}
