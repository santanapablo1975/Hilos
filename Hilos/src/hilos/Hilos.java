package hilos;

public class Hilos {

    public static void main(String[] args) {
        Buffer b = new Buffer();
        BufferSincronizado bs = new BufferSincronizado();
        ProductorSincronizado p = new ProductorSincronizado(bs);
        ConsumidorSincronizado c = new ConsumidorSincronizado(bs);
        p.start();
        c.start();
    }

}
