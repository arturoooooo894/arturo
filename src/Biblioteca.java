import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Biblioteca {
    private List<Libro> Lista;

    public Biblioteca() {
        Lista = new ArrayList<>();
        this.Lista = Lista;
    }

    public void AgregarLibro (Libro l){
        Lista.add(l);
    }

    public String mostrarLibros(){
        StringBuilder datosLibro = new StringBuilder();
        for(Libro libro:Lista){
            datosLibro.append(libro.toString() + "\n");
        }
        return datosLibro.toString();
    }

    public void serializarLista(){
        try (FileOutputStream fileOutput = new FileOutputStream("listaLibros.ser");
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
            for (Libro libro:Lista){
                objectOutput.writeObject(libro);
            }

        } catch (Exception e) {
            System.err.println("Error al almacenar la lista de libros: " + e.getMessage());
        }
        System.out.println("La lista de libros ha sido serializada en listaLibros.ser.");
    }

    public void deserializarLibro() {
        try (FileInputStream fileInput = new FileInputStream("listaLibros.ser");
             ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {

            Biblioteca biblioteca = new Biblioteca();

            while (true) {
                try {
                    // Leer y deserializar la siguiente mascota
                    Libro libro = (Libro) objectInput.readObject();
                    biblioteca.AgregarLibro(libro);

                } catch (EOFException e) {
                    System.err.println("Alcanzado el final del archivo");
                    break; // Se alcanzó el final del archivo
                }
            }
            System.out.println("\n           ------  Información de los libros en la biblioteca:  ------");
            System.out.println(biblioteca.mostrarLibros());

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer el archivo listaLibros.ser: " + e.getMessage());
        }
    }
}
