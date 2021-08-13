package ru.netology.domain;

public class PostSource {
    private String type; //тип источника
    private String platform; //название платформы, если оно доступно
    private String data; //тип действия
    private String url; //URL ресурса, с которого была опубликована запись.

    public String getType() {
        return type;
    }

    public String getPlatform() {
        return platform;
    }

    public String getData() {
        return data;
    }

    public String getUrl() {
        return url;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
