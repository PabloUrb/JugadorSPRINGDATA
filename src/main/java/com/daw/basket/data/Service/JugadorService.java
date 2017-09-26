package com.daw.basket.data.Service;

import com.daw.basket.data.entidades.Jugador;
import com.daw.basket.data.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class JugadorService {

        @Autowired
        private JugadorRepository jugadorRepository;


        public  void testJugador(){
            Jugador Pablo = new Jugador("pablo", LocalDate.of(1998, 9, 16), 8,8,8, "base");
            jugadorRepository.save(Pablo);
            Jugador Pau = new Jugador("Pau", LocalDate.of(1996, 3, 8), 7,   7,7, "base");
            jugadorRepository.save(Pau);
            Jugador Gonzalo = new Jugador("Gonzalo", LocalDate.of(1995, 4, 2), 6,6,6, "pivot");
            jugadorRepository.save(Gonzalo);
            Jugador Clara = new Jugador("Clara", LocalDate.of(1997, 1, 1), 5,5,5, "pivot");
            jugadorRepository.save(Clara);
            Jugador Kelvin = new Jugador("Kelvin", LocalDate.of(1989, 12, 6), 4,4,4, "pivot");
            jugadorRepository.save(Kelvin);

            Jugador saiden = new Jugador("saiden",LocalDate.of(1996,12,24),2,2,3,"base");

            jugadorRepository.save(saiden);
            Jugador sergi = new Jugador("sergi", LocalDate.of(1996, 11, 21),3,0,2,"pivot");
            jugadorRepository.save(sergi);
            Jugador aleix = new Jugador("aleix", LocalDate.of(1995,7,4),1,1,1,"aleron");
            jugadorRepository.save(aleix);
            Jugador zerus = new Jugador("zerus", LocalDate.of(1994,4,14),4,3,4,"base");
            jugadorRepository.save(zerus);

            Jugador pablo = new Jugador("pablo",LocalDate.of(1996,5,17),2,3,2,"pivot");
            jugadorRepository.save(pablo);
            Jugador josep = new Jugador("josep",LocalDate.of(1996,3,8),3,5,4,"aleron");
            jugadorRepository.save(josep);
            Jugador pau = new Jugador("pau",LocalDate.of(1996,7,12),1,2,3,"base");
            jugadorRepository.save(pau);
            Jugador joan = new Jugador("joan",LocalDate.of(1995,1,3),2,3,4,"pivot");
            jugadorRepository.save(joan);
            Jugador alejandro = new Jugador("alejandro",LocalDate.of(1996,3,23),9,8,7,"aleron");
            jugadorRepository.save(alejandro);

            Jugador alex= new Jugador("alex",LocalDate.of(1987,10,3),8,9,5,"base");
            jugadorRepository.save(alex);
            Jugador berjen = new Jugador("berjen",LocalDate.of(1990,3,7),5,1,2,"pivot");
            jugadorRepository.save(berjen);
            Jugador darien = new Jugador("darien",LocalDate.of(1989,1,10),11,6,4,"aleron");
            jugadorRepository.save(darien);
            Jugador faker= new Jugador("faker",LocalDate.of(1993,7,17),10,10,10,"base");
            jugadorRepository.save(faker);
            Jugador darc = new Jugador("darc",LocalDate.of(1428,12,1),1,6,0,"pivot");
            jugadorRepository.save(darc);

            Jugador Shyaporn = new Jugador("Shya",LocalDate.of(1989, 1, 2), 4, 2, 8, "base");
            jugadorRepository.save(Shyaporn);
            Jugador Jordan = new Jugador("Miquel", LocalDate.of(1972, 10, 2), 4, 1999, 88, "base");
            jugadorRepository.save(Jordan);
            Jugador Bone = new Jugador("Jose", LocalDate.of(1974, 10, 5), 9,19, 8,"WaterBoy");
            jugadorRepository.save(Bone);
            Jugador Torquemada = new Jugador("Inquisidor", LocalDate.of(1425, 1, 29), 568,1587, 1547,"WaterBoy");
            jugadorRepository.save(Torquemada);
            Jugador Andreu = new Jugador("Adeu",LocalDate.of(1984, 8, 29), 15, 25, 17, "Ala");
            jugadorRepository.save(Andreu);

            Jugador Landa = new Jugador("Hans", LocalDate.of(1986, 10, 8), 7, 17, 45, "Ala");
            jugadorRepository.save(Landa);
            Jugador Ramon = new Jugador("Balon", LocalDate.of(1964, 1, 21), 4, 8, 9, "Pivote");
            jugadorRepository.save(Ramon);
            Jugador Delgado = new Jugador("Javi", LocalDate.of(1991, 4, 24), 8, 9, 17, "Pivote");
            jugadorRepository.save(Delgado);
            Jugador Estatua = new Jugador("Equestre",LocalDate.of(1984, 7, 17), 5, 2, 7, "Salero");
            jugadorRepository.save(Estatua);
            Jugador Chapa = new Jugador("Pote",LocalDate.of(1982, 3, 4), 6, 8, 2, "Salero");
            jugadorRepository.save(Chapa);

    //a
            System.out.println("===============================================================================================================================================================================================================================================================================================================");
            System.out.println("jugadores que empieza por pab");
            System.out.println(jugadorRepository.findByNombreContaining("pab"));
            System.out.println("===============================================================================================================================================================================================================================================================================================================");
    //b
            System.out.println("canastas mayores que 8");
            System.out.println(jugadorRepository.findByNumCanastasGreaterThanEqual(7));
            System.out.println("===============================================================================================================================================================================================================================================================================================================");
    //c
            System.out.println("jugadores que su asistencias son entre 1 y 3");
            System.out.println(jugadorRepository.findByNumAsistenciasBetween(1,3));
            System.out.println("===============================================================================================================================================================================================================================================================================================================");
    //d
            System.out.println("jugadores que su posicion empieza por ba");
            System.out.println(jugadorRepository.findByPosicionContaining("ba"));
            System.out.println("===============================================================================================================================================================================================================================================================================================================");
    //e
            System.out.println("jugadores anteriores al 1995/11/1");
            System.out.println(jugadorRepository.findByFechaNacimientoBefore(LocalDate.of(1995,11,1)));
            System.out.println("===============================================================================================================================================================================================================================================================================================================");
    //f
            System.out.println("");
            System.out.println(jugadorRepository.Medias());
            System.out.println("===============================================================================================================================================================================================================================================================================================================");
    //g
            System.out.println("");
            System.out.println(jugadorRepository.EstadisticasCompletas());

//EstadisticasCompletas
//              for (EstadisticasPosicion ep: jugadorRepository.EstadisticasCompletas()
//                 ) {
//                ep.getMaxAsistencias()
//                System.out.println(ep);
//            }
            System.out.println("===============================================================================================================================================================================================================================================================================================================");

        }
        }
