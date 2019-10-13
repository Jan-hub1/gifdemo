package com.jm.kwejk.controller;

import com.jm.kwejk.model.Gif;
import com.jm.kwejk.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;

@Controller
public class GifController {
    @Autowired
    GifRepository gifRepository;

    @GetMapping("/")
    public String listGifsHome(ModelMap modelMap){

//        1. wyciąganie gifów

//        List<Gif> gifList = getAllGifs();

        List<Gif> gifList = gifRepository.getAllGifs();

//        2. Przekazanie gifa do view
        modelMap.put("gifs", gifList);
//        3. Zwracanie widoku

        return "home";

    }

    @GetMapping("/favorites")
    public String listFavoritesGifs(ModelMap modelMap){

//        1. wyciąganie gifów

//        List<Gif> gifList = getAllGifs();

        List<Gif> gifList = gifRepository.getFavoritesGifs();

//        2. Przekazanie gifa do view
        modelMap.put("gifs", gifList);
//        3. Zwracanie widoku

        return "favorites";

    }

    @GetMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){
//        1. wyciąganie gifów
//        List<Gif> gifList = getAllGifs();

        Gif gif = gifRepository.getGifByName(name);

//        2. Przekazanie gifa do view
        modelMap.put("gif", gif);
//        3. Zwracanie widoku

        return "gif-details";

    }

//    @ResponseBody
//    @GetMapping("/test")
//    public String listGifs(){
//        return GifRepository.getAllGifs().toString();
//
//    }
//
//    @ResponseBody
//    @GetMapping("/test1")
//    public String listGif(){
//
//
//        for (int i = 0; i < GifRepository.getAllGifs().size(); i++) {
//            if (GifRepository.getAllGifs().get(i).getUsername().equals("mika")) {
//                return GifRepository.getAllGifs().get(i).toString();
//            }
//
//        }
//
//
//        return null;
//
//    }
//
//    @ResponseBody
//    @GetMapping("/test2")
//    public String listGifFav(){
//
//
//        for (int i = 0; i < GifRepository.getAllGifs().size(); i++) {
//            if (GifRepository.getAllGifs().get(i).isFavorite()) {
//                return GifRepository.getAllGifs().get(i).toString();
//            }
//
//        }
//
//
//        return null;
//
//    }
//    @ResponseBody
//    @GetMapping("/test3")
//    public List<Gif> gifFavorietes() {
//        List<Gif> lista = new ArrayList<>();
//        for (int i = 0; i < GifRepository.getAllGifs().size(); i++) {
//            if (GifRepository.getAllGifs().get(i).isFavorite()) {
//                lista.add(GifRepository.getAllGifs().get(i));
//            }
//        }
//        return lista;
//
//    }
}
