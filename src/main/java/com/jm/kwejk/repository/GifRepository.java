package com.jm.kwejk.repository;

import com.jm.kwejk.model.Gif;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class GifRepository {

    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "mols", true, 2),
            new Gif("ben-and-mike", "mika", true, 1),
            new Gif("Book-dominos", "mem", false, 0),
            new Gif("compiler-bot", "bot", true, 2),
            new Gif("cowboy-coder", "code", false, 1),
            new Gif("infinite-andrew", "andrew", true,2)
    );

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public List<Gif> getFavoritesGifs() {
        List<Gif> favorites = new ArrayList<>();

        for (int i = 0; i < ALL_GIFS.size(); i++) {
            if (ALL_GIFS.get(i).isFavorite()) {
                favorites.add(ALL_GIFS.get(i));
            }
        } return favorites;
    }

    public Gif getGifByName(String name) {

        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getGifsByCategoryId(int id) {

        List<Gif> listGifId = new ArrayList<>();

        for (Gif gif : ALL_GIFS) {
            if (gif.getCategoryId() == id){
                listGifId.add(gif);

            }

        }
        return listGifId;
    }


}
