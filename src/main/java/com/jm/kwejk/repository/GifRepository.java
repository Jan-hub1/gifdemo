package com.jm.kwejk.repository;

import com.jm.kwejk.model.Gif;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
@Repository
public class GifRepository {

    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "mols", true),
            new Gif("ben-and-mike", "mika", true),
            new Gif("Book-dominos", "mem", false),
            new Gif("compiler-bot", "bot", true),
            new Gif("cowboy-coder", "code", false),
            new Gif("infinite-andrew", "andrew", true)
    );

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }


}
