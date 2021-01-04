package Section07.LinkList.SongAlbum;

import java.util.*;

public class MainSongApp {
    // create for the list to add all songs
    private static ArrayList<Album> albumArrayList = new ArrayList<>();
    public static void main(String[] args) {
        Album album = new Album("Map Of The Soul: Persona", "BTS");
        album.addSong("Intro: Persona", "2:51");
        album.addSong("Boys With Luv", "3:50");
        album.addSong("Mikrokosomos", "3:44");
        album.addSong("Make It Right", "3:42");
        album.addSong("Home", "4:00");
        album.addSong("Jamais Vu", "3:46");
        album.addSong("Dionysus", "4:08");
        // album 1
        albumArrayList.add(album);

        album = new Album("Love Yourself: Answer", "BTS");
        album.addSong("Euphoria", "3:49");
        album.addSong("Just Dance", "3:49");
        album.addSong("Serendipity", "3:49");
        album.addSong("DNA", "3:49");
        album.addSong("Dimple", "3:49");
        album.addSong("Trivia: Love", "3:49");
        album.addSong("Her", "3:49");
        album.addSong("Singularity", "3:49");
        album.addSong("Fake Love", "3:49");
        album.addSong("Best Of Me", "3:49");
        // album 2
        albumArrayList.add(album);

        // making playlist
        LinkedList<Song> playLinkList = new LinkedList<>();
        albumArrayList.get(0).addPlayList("Home", playLinkList);
        albumArrayList.get(0).addPlayList("Boys With Luv", playLinkList);
        albumArrayList.get(0).addPlayList("Make It Right", playLinkList);
        albumArrayList.get(0).addPlayList("Dionysus", playLinkList);
        albumArrayList.get(1).addPlayList(9, playLinkList);
        albumArrayList.get(1).addPlayList(7, playLinkList);
        albumArrayList.get(1).addPlayList(10, playLinkList);
        albumArrayList.get(1).addPlayList(1, playLinkList);
        albumArrayList.get(1).addPlayList(2, playLinkList);
        albumArrayList.get(1).addPlayList(25, playLinkList);  // does not exit

        playSong(playLinkList);


    }

    private static void playSong(LinkedList<Song> songLinkedList){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> songListIterator = songLinkedList.listIterator();
        if(songLinkedList.isEmpty()){
            System.out.println("There is no sing in the play list.");
        }
        else {
            // or --> songLinkedList.listIterator().next()
            System.out.println("Now Playing " + songListIterator.next().toString());
        }

        printMenu();
        // int choose = sc.nextInt();
        while (!quit) {
            System.out.println("");
            System.out.println("Enter action: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(songListIterator.hasNext()){
                            songListIterator.next();
                        }
                        forward = true;
                    }
                    if(songListIterator.hasNext()){
                        System.out.println("Now playing " + songListIterator.next().toString());
                    }else {
                        System.out.println("It is end of the play list.");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(songListIterator.hasPrevious()){
                            songListIterator.previous();
                        }
                        forward = false;
                    }
                    if(songListIterator.hasPrevious()){
                        System.out.println("Now Playing " + songListIterator.previous().toString());
                    }else {
                        System.out.println("We are the start of the play list.");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(songListIterator.hasPrevious()){
                            System.out.println("Now replaying " + songListIterator.previous().toString());
                            // this is important
                            forward = false;
                        }
                        else{
                            System.out.println("We are at the start of the play list.");
                        }
                    }else {
                        if (songListIterator.hasNext()){
                            System.out.println("Now replaying " + songListIterator.next().toString());
                            forward = true;
                        }
                        else {
                            System.out.println("We are the end of the play list.");
                        }
                    }
                    break;

                case 4:
                    printSongList(songLinkedList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    // remove the current song
                    if(songLinkedList.size() > 0){
                       songListIterator.remove();
                        // System.out.println(songLinkedList.iterator().next().getTitle());
                        if(songListIterator.hasNext()){
                            System.out.println("Now playing " + songListIterator.next().toString());
                        }else {
                            System.out.println("Now playing " + songListIterator.previous().toString());
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid Input!!");
            }
        }

    }
    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");

    }

    private static void printSongList(LinkedList<Song> songLinkedList){
        // Iterator is good for looping the list to get all datas in the list
        Iterator<Song> iterator = songLinkedList.iterator();
        System.out.println("Song PlayList");
        System.out.println("--------------");
        for (int i=0; i<songLinkedList.size(); i++){
            System.out.println((i+1) + ". " + iterator.next());
        }
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//
//        }

    }



}
