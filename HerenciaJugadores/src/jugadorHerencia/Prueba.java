package jugadorHerencia;

public class Prueba {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Fútbol Club Banegas");

        System.out.println(equipo.agregarJugador(TipoJugador.DELANTERO, "Agustín", 0.9, 0.8));
        System.out.println(equipo.agregarJugador(TipoJugador.DEFENSOR, "Sofía", 0.7, 0.6));
        System.out.println(equipo.agregarJugador(TipoJugador.ARQUERO, "Lucía", 0.5, 0.5));
        System.out.println(equipo.agregarJugador(TipoJugador.DELANTERO, "Carlos", 1.2, 0.8)); 

        System.out.println("Jugadores:");
        equipo.getJugadores().forEachRemaining(j -> System.out.println(j));

        System.out.println("Índice de Ataque: " + equipo.indiceAtaque());
        System.out.println("Índice de Defensa: " + equipo.indiceDefensa());
    }
}
