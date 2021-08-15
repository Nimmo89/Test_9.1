package ru.netology.manager;

public class Post {
    private WallSearch wallSearch;
    private WallDelete wallDelete;

    public WallSearch getWallSearch() {
        return wallSearch;
    }

    public void setWallSearch(WallSearch wallSearch) {
        this.wallSearch = wallSearch;
    }

    public WallDelete getWallDelete() {
        return wallDelete;
    }

    public void setWallDelete(WallDelete wallDelete) {
        this.wallDelete = wallDelete;
    }
}
