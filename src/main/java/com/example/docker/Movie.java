package com.example.docker;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
public class Movie {
    @Id
    private String id;
    private String movieName;
   
    public Movie() {
    }
    public Movie(String name) {
        this.movieName = name;
        
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return movieName;
    }
    public void setName(String name) {
        this.movieName = name;
    }
    
}
