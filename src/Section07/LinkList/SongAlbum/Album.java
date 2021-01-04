package Section07.LinkList.SongAlbum;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Song> songArrayList;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songArrayList = new ArrayList<>();
    }

    public boolean addSong(String title, String duration){
        Song checkSong = findSong(title);
        if(checkSong == null){
            this.songArrayList.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
//        for(int i=0; i<this.songArrayList.size(); i++){
//            Song checkSong = this.songArrayList.get(i);
        for (Song checkSong : this.songArrayList) {
            if (checkSong.getTitle().equals(title)) {
                return checkSong;
            }
        }
        return null;
    }

    public boolean addPlayList(int trackNumber, LinkedList<Song> playLinkedList){
        int index  = trackNumber - 1;
        if ((index>=0)&& (index<=this.songArrayList.size())){
            // return Song class object
            playLinkedList.add(this.songArrayList.get(index));
            return true;
        }
        System.out.println("There is no such song in this album." + trackNumber);
        return false;
    }
    // method overloading
    public boolean addPlayList(String title, LinkedList<Song> playLinkedList){
        Song checkSong = findSong(title);
        if(checkSong != null){
            // return song class object
            playLinkedList.add(checkSong);
            return true;
        }
        System.out.println("There is no such song " + title + " in this album.");
        return false;
    }

//    public static void main(String[] args) {
//        ArrayList<String> likeSong = new ArrayList<>();
//        likeSong.add(0, "Dynamite");
//        likeSong.add(1, "New Rules");
//        likeSong.add(2, "Home");
//        likeSong.add(3, "Fake Love");
//        likeSong.add(4, "I Need You");
//        likeSong.add(5, "Yummy");
//
//        System.out.println(likeSong);
//
//        for (String songlist: likeSong){
//            System.out.println(songlist);
//        }
//        likeSong.add(4, "Rain On Me");
//        System.out.println(likeSong);
//
//        for(int index=0; index<likeSong.size(); index++){
//            System.out.println(likeSong.get(index));
//        }
//
//    }


}
