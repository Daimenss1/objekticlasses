package ru.skypro;

public class Main {
   public static void main (String [] args) {
       Author Tolstoy = new Author(" Lev ", " Tolstoy ");
       Author Block = new Author(" Alexandr ", " Block ");

       Book warAndPiece = new Book(Tolstoy , " Война и мир ", 1869);
       Book grayMorning = new Book(Block, " Седое утро ", 1920);

       System.out.println(warAndPiece);
       System.out.println(grayMorning);

       System.out.println(" Измение года выпуска книги ");
       grayMorning.setPublisherYear(2020);
       System.out.println(grayMorning);
   }
}



