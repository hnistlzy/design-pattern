package com.kenton.observe.entity;

/**
 * @author KentonLee
 * @date 2019/2/26
 */
public class Paper {
    private String title;
    private String content;
    private String author;

    @Override
    public String toString() {
        return "Paper{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
