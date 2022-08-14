package yandex.practicum.object.equals;

import java.util.Objects;
public class Song {
    public final String title;
    public final String artist;
    public final String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }
@Override
    public boolean equals(Object song){
if (this == song) return true;
if (song == null || getClass() != song.getClass()) return false;
Song thisSong = (Song) song;
return Objects.equals(title, thisSong.title) && Objects.equals(artist, thisSong.artist) &&
        Objects.equals(songwriter, thisSong.songwriter);
}
    // переопределите метод equals(Object)


}