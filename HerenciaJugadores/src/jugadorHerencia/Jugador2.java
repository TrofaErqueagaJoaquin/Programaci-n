package jugadorHerencia;


public class Jugador2 {
    public static Jugador crearJugador(TipoJugador tipo, String nombre, double velocidad, double potencia) {
        switch (tipo) {
            case DELANTERO:
                return new Delantero(nombre, velocidad, potencia);
            case DEFENSOR:
                return new Defensor(nombre, velocidad, potencia);
            case ARQUERO:
                return new Arquero(nombre, velocidad, potencia);
            default:
                throw new IllegalArgumentException("Tipo de jugador no válido");
        }
    }
}
