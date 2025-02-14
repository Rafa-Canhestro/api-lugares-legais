package com.lugares.legais.model;

import com.lugares.legais.enums.CriteriasAvaliation;

public class Post {

    public Post(User user, int likes, String title, String text, String comment, CriteriasAvaliation criteria) {
        this.user = user;
        this.likes = likes;
        this.title = title;
        this.text = text;
        this.comment = comment;
        this.criteria = criteria;
    }
    private User user;
    private int likes;
    private String title;
    private String text;
    private String comment;

        public void setUser(User user) {
            this.user = user;
        }

        public User getUser() {
            return this.user;
        }
        
        public void setLikes(int likes) {
            this.likes = likes;
        }

        public int getLikes() {
            return this.likes;
        }
        
        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }
        
        public void setText(String text) {
            this.text = text;
        }

        public String getText() {
            return this.text;
        }
        
        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getComment() {
            return this.comment;
        }
        
        public void setCriteria(CriteriasAvaliation criteria) {
            this.criteria = criteria;
        }

        public CriteriasAvaliation getCriteria() {
            return this.criteria;
        }
            private CriteriasAvaliation criteria;

}