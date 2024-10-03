import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> Lista;

    public Biblioteca() {
        Lista = new ArrayList<>();
    }

    public void AgregarLibro (Libro l){
        Lista.add(l);
    }

    public void mostrarLibros() {
        if (Lista.isEmpty()) {
            System.out.println("La biblioteca no tiene libros.");
        } else {
            for (Libro libro : Lista) {
                System.out.println(libro);  // Llama automáticamente al toString() de la clase Libro
                System.out.println("-----------------------------");
            }
        }
    }
}
