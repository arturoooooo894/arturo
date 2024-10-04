public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();


            // Crear tres Libros
            Libro Libro1 = new Libro("Whiskers", "ObiJuan", "Gato", 4.0, 3.6);
            Libro Libro2 = new Libro("Rex", "Maria", "Perro",3.0, 5.0);
            Libro Libro3 = new Libro("Tweety", "Lorca", "Pájaro",36.0, 4.0);
            Libro Libro4 = new Libro("harry Potter", "Manolo", "Oso Pardo",46.0, 0.0 );

            biblioteca.AgregarLibro(Libro1);
            biblioteca.AgregarLibro(Libro2);
            biblioteca.AgregarLibro(Libro3);
            biblioteca.AgregarLibro(Libro4);

            System.out.println("Los libros en la biblioteca antes de serializar");
            System.out.println(biblioteca.mostrarLibros());

            biblioteca.serializarLista();

            biblioteca.deserializarLibro();

    }
}