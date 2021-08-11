package ru.netology.manager;

public class PostManager {

    public Object wallSearch(int[] wall) {  //Позволяет искать записи на стене в соответствии с заданными критериями
        int ownerID = 12476453;  //идентификатор пользователя или сообщества
        String domain = "url"; //короткий адрес пользователя или сообщества
        String query = "запрос"; //поисковой запрос
        boolean ownersOnly = true; //true — возвращать только записи от имени владельца стены
        int count = 20; //количество записей, которые необходимо вернуть
        int offset = 0; //смещение, необходимо для получения определенного подмножества результатов

        return null;
    }

    public Object wallDelete(int[] wall) {
        int ownerID = 254354;  //идентификатор пользователя или сообщества
        int postId = 4225324; //идентификатор записи на стене

        return null;
    }
}
