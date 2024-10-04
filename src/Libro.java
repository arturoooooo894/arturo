import java.io.Serializable;

public class Libro implements Serializable{
    private String título;
    private String autor;
    private String isbn;
    private double precio;
    private transient double Descuento;

    public Libro(String título, String autor, String isbn, Double precio, Double Descuento) {
        this.título = título;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.Descuento = Descuento;
    }

    @Override
    public String toString() {
        return "título: " + título + "\nautor: " + autor + "\nisbn: " + isbn + "\nprecio: " + precio + "/nDescuento" + Descuento;
    }
}