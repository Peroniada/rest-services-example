package edu.peronade.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by peronade on 23.12.16.
 */

@Entity
public class Account
{

    @OneToMany(mappedBy = "account")
    private Set<Bookmark> bookmarks = new HashSet<>();
    @Id
    @GeneratedValue
    private Long id;

    public Set<Bookmark> getBookmarks() {
        return bookmarks;
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @JsonIgnore
    private String password;
    private String username;

    public Account(String username, String password) {
        this.password = password;
        this.username = username;
    }

    public Account() {
    }
}
