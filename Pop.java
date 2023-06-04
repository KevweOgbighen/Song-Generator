import java.util.ArrayList;

class Pop extends Cheer {

  private int num;
  private ArrayList<Genre> songs;

  public Pop (int num, ArrayList<Genre> songs) {
    this.num = num;
    this.songs = songs;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }
  
  public ArrayList<Genre> getSongs() {
    return songs;
  }

  public void setSongs(ArrayList<Genre> songs) {
    this.songs = songs;
  }

  public void addSongs(Genre g) {
    songs.add(g);
  }
  
  @Override
  public String toString() {
    return "We recommend " + this.num + " songs(s).";
  }

  @Override
  void cheer(){
    System.out.println("Pop Matters");
  }

  public void printRec() {
    for (Genre ge: songs) {
      System.out.println(ge);
    }
  }
}