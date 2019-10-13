package com.jm.kwejk.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;



@AllArgsConstructor
@ToString
public class Gif {
    @Getter
    private String name;
    @Getter
    private String username;
    @Getter
    private boolean favorite;
    @Getter
    private int categoryId;


}

