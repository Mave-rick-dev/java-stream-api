package com.maverick.springrevisited.predefinedFunctionalInterfaces;

import com.maverick.springrevisited.streamAPIUseCase.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.function.Predicate;


@Data
@NoArgsConstructor
@AllArgsConstructor
class Song {
    private String songName;
    private String artistName;
}

public class PredicateDemo implements Predicate<Song> {
    @Override
    public boolean test(Song song) {
        if (song.getArtistName().equalsIgnoreCase("Logic")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        List<Song> songList = List.of(
                new Song("Glorious Five", "Logic"),
                new Song("The confession of a dangerous ming", "Eminem"),
                new Song("Nikki", "Logic")
        );

        /**
         * Traditional approach:
         *  Here, we identify if a song is of artist Logic
         */
        /*Predicate<Song> predicate = (song) ->{
            if(song.getSongName().equalsIgnoreCase("Glorious Five")){
                return true;
            }else{
                return false;
            }
        };
        boolean result = predicate.test(new Song("Happy", "Logic"));
        System.out.println(result);
        boolean secondResult = predicate.test(new Song("Glorious Five", "Logic"));
        System.out.println(secondResult);*/


        /**
         * Here, we print the Song instances with artist Logic by filtering the songList
         *  stream with a Predicate lambda
         */
        songList.stream().filter(song -> {
            if (song.getArtistName().equalsIgnoreCase("Logic")) {
                return true;
            }else {
                return false;
            }
        }).forEach(songName -> System.out.println(songName));

    }
}
