class Genre {

  private String artist;
  private String album;
  
  public Genre (String artist, String album) {
    this.artist = artist;
    this.album = album;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  @Override
  public String toString() {
    return "We recommend " + this.artist + " and their album " +  this.album;
  }
}