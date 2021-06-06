package ex03.base;

import java.util.Scanner;

public class QuotePrinter {
  Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    QuotePrinter myQuote = new QuotePrinter();
    String output = myQuote.returnQuote(myQuote.readQuote(), myQuote.readAuthor());
    System.out.println(output);
  }

  public String readQuote() {
    System.out.print("What is the quote? ");
    return input.nextLine();
  }

  public String readAuthor() {
    System.out.print("Who said it? ");
    return input.nextLine();
  }

  public String returnQuote(String quote, String author) {
    return author + " says, \"" + quote + "\".";
  }
}
