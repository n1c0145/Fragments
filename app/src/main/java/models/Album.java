package models;

public class Album {
    private long id;
    private String title;
    private String artist;
    private String genre;
    private String imageurl;


    public Album(long id, String title, String artist, String genre, String imageurl) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.imageurl = imageurl;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public long getId() {
        return id;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}


