package com.ggamstudio.a6wproject3;

public class RecyclerItem {


    String username;
    String like;
    String username_under;
    String usertext;
    String commentallsee;
    int icon;
    int dotmenu;
    int image;
    int heart;
    int comment;
    int send;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getUsername_under() {
        return username_under;
    }

    public void setUsername_under(String username_under) {
        this.username_under = username_under;
    }

    public String getUsertext() {
        return usertext;
    }

    public void setUsertext(String usertext) {
        this.usertext = usertext;
    }

    public String getCommentallsee() {
        return commentallsee;
    }

    public void setCommentallsee(String commentallsee) {
        this.commentallsee = commentallsee;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getDotmenu() {
        return dotmenu;
    }

    public void setDotmenu(int dotmenu) {
        this.dotmenu = dotmenu;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getHeart() {
        return heart;
    }

    public void setHeart(int heart) {
        this.heart = heart;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public int getSend() {
        return send;
    }

    public void setSend(int send) {
        this.send = send;
    }

    public RecyclerItem(String username, String like, String username_under, String usertext, String commentallsee, int icon, int dotmenu, int image, int heart, int comment, int send) {
        this.username = username;
        this.like = like;
        this.username_under = username_under;
        this.usertext = usertext;
        this.commentallsee = commentallsee;
        this.icon = icon;
        this.dotmenu = dotmenu;
        this.image = image;
        this.heart = heart;
        this.comment = comment;
        this.send = send;
    }

}



