package day35_custom_classes.HomeWork1;

public class Song {

    String name ;
    double length;
    String Artist;
    String genre;

public void music(){

    this.name.equals("Desert rose");
}

    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", Artist='" + Artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    public Song (String inputName, double inputlength, String inputArtist, String inputgenre){
        name = inputName;
        length= inputlength;
        Artist = inputArtist;
        genre = inputgenre;


    }

}
