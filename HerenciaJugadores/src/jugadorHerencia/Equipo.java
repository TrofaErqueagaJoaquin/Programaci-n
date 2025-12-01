package jugadorHerencia;

import java.util.*;

public class Equipo {
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.jugadores = new ArrayList<>();
    }

    private boolean esValido(double velocidad, double potencia) {
        return velocidad >= 0 && velocidad <= 1 && potencia >= 0 && potencia <= 1;
    }

    public String agregarJugador(TipoJugador tipo, String nombre, double velocidad, double potencia) {
        if (!esValido(velocidad, potencia)) {
            return "Imposible crear un " + tipo.name().toLowerCase() +
                   " con velocidad = " + velocidad + " y potencia = " + potencia;
        }
        jugadores.add(Jugador2.crearJugador(tipo, nombre, velocidad, potencia));
        return "Jugador agregado";
    }

    public void eliminaJugador(Jugador jugador) {
        jugadores.remove(jugador);
    }

    public Iterator<Jugador> getJugadores() {
        return jugadores.iterator();
    }

    public double indiceDefensa() {
        double total = 0;
        for (Jugador j : jugadores)
            total += j.indiceDefensa();
        return total;
    }

    public double indiceAtaque() {
        double total = 0;
        for (Jugador j : jugadores)
            total += j.indiceAtaque();
        return total;
    }
}
