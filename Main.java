import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Genre> arr_1 = new ArrayList<Genre>();
    Pop po = new Pop(1, arr_1);
    Genre p_1 = new Genre("Ariana Grande", "Thank U, Next");
    po.addSongs(p_1);
    
    ArrayList<Genre> arr_2 = new ArrayList<Genre>();
    Country co = new Country(2, arr_2);
    Genre c_1 = new Genre("Dolly Parton", "Jolene");
    Genre c_2 = new Genre("Carrie Underwood", "Some Hearts");
    co.addSongs(c_1);
    co.addSongs(c_2);
    
    ArrayList<Genre> arr_3 = new ArrayList<Genre>();
    HipHop hi = new HipHop(3, arr_3);
    Genre h_1 = new Genre("Missy Elliot", "Under Construction");
    Genre h_2 = new Genre("Queen Latifah", "Black Reign");
    Genre h_3 = new Genre("Salt-N-Pepa", "Very Necessary");
    hi.addSongs(h_1);
    hi.addSongs(h_2);
    hi.addSongs(h_3);
    
    System.out.println("Welcome to artist generator! Pick a genre of music:\n"
                      + "1) pop\n"
                      + "2) country\n"
                      + "3) hip hop");
    
    int option;
    
    try {
      switch(option = sc.nextInt()) {
      case 1: System.out.println(po);
              po.printRec();
              po.cheer();
              break;
      case 2: System.out.println(co);
              co.printRec();
              co.cheer();
              break;
      case 3: System.out.println(hi);
              hi.printRec();
              hi.cheer();
              break;
    }
    } catch (InputMismatchException ex) {
        System.out.println("Input mismatch. Please enter a number.");
        ex.printStackTrace();
      }

    sc.close();
  }
}