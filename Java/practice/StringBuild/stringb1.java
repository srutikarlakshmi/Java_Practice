package Java.practice.StringBuild;

public class stringb1 {
  public static void main(String args[]){
    StringBuilder sb = new StringBuilder("Srutika");

    System.out.println(sb);

    //check char
    System.out.println(sb.charAt(0));

    //set char by index
    sb.setCharAt(0, 'R');
    System.out.println(sb);

    sb.insert(1, 's');
    System.out.println(sb);

    sb.delete(0, 1);
    System.out.println(sb);

    StringBuilder sbs = new StringBuilder("hello");
    System.out.println(sbs);
    sbs.reverse();

    for(int i=0; i<sbs.length()/2; i++){
      int front = i;    //hel lo
      int back = sbs.length()-1-i;

      char frontChar = sbs.charAt(front);
      char backChar = sbs.charAt(back);

      sbs.setCharAt(front, backChar);
      sbs.setCharAt(back, frontChar);

      System.out.println(sbs);



    }
  }
}
