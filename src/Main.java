import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.io.IOException;

public class AlmacenarMascotas {
    public static void main(String[] args) {


            // Crear tres Libros
            Libro Libro1 = new Libro("Whiskers", "ObiJuan", "Gato", "40€");
            Libro Libro2 = new Libro("Rex", "Maria", "Perro","30€" );
            Libro Libro3 = new Libro("Tweety", "Lorca", "Pájaro","36€" );
            Libro Libro4 = new Libro("harry Potter", "Manolo", "Oso Pardo","46€" );



            System.out.println("Los libros en la biblioteca antes de serializar");


    }
}