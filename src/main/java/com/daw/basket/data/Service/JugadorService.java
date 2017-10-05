package com.daw.basket.data.Service;

import com.daw.basket.data.Repository.EquipoRepository;
import com.daw.basket.data.entidades.Equipo;
import com.daw.basket.data.entidades.Jugador;
import com.daw.basket.data.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class JugadorService {

        @Autowired
        private JugadorRepository jugadorRepository;
        @Autowired
        private EquipoRepository equipoRepository;

        public  void testJugador(){
            Jugador Pablo = new Jugador("pablo", LocalDate.of(1998, 9, 16), 8,8,8, "base");
            Equipo madrid = equipoRepository.findByNombre("Madrid");
            Pablo.setEquipo(madrid);
            jugadorRepository.save(Pablo);
            Jugador Pau = new Jugador("Pau", LocalDate.of(1996, 3, 8), 7,   7,7, "base");
            madrid = equipoRepository.findByNombre("Madrid");
            Pau.setEquipo(madrid);
            jugadorRepository.save(Pau);
            Jugador Gonzalo = new Jugador("Gonzalo", LocalDate.of(1995, 4, 2), 6,6,6, "pivot");
            madrid = equipoRepository.findByNombre("Madrid");
            Gonzalo.setEquipo(madrid);
            jugadorRepository.save(Gonzalo);
            Jugador Clara = new Jugador("Clara", LocalDate.of(1997, 1, 1), 5,5,5, "pivot");
            madrid = equipoRepository.findByNombre("Madrid");
            Clara.setEquipo(madrid);
            jugadorRepository.save(Clara);

            Jugador Kelvin = new Jugador("Kelvin", LocalDate.of(1989, 12, 6), 4,4,4, "pivot");
            Equipo barça = equipoRepository.findByNombre("Barça");
            Kelvin.setEquipo(barça);
            jugadorRepository.save(Kelvin);
            Jugador saiden = new Jugador("saiden",LocalDate.of(1996,12,24),2,2,3,"base");
            saiden.setEquipo(equipoRepository.findByNombre("Barça"));
            saiden.setEquipo(barça);
            jugadorRepository.save(saiden);
            Jugador sergi = new Jugador("sergi", LocalDate.of(1996, 11, 21),3,0,2,"pivot");
            barça = equipoRepository.findByNombre("Barça");
            sergi.setEquipo(barça);
            jugadorRepository.save(sergi);
            Jugador aleix = new Jugador("aleix", LocalDate.of(1995,7,4),1,1,1,"aleron");
            barça = equipoRepository.findByNombre("Barça");
            aleix.setEquipo(barça);
            jugadorRepository.save(aleix);
            Jugador zerus = new Jugador("zerus", LocalDate.of(1994,4,14),4,3,4,"base");
            barça = equipoRepository.findByNombre("Barça");
            zerus.setEquipo(barça);
            jugadorRepository.save(zerus);

            Jugador pablo = new Jugador("pablo",LocalDate.of(1996,5,17),2,3,2,"pivot");
            Equipo getafe = equipoRepository.findByNombre("Getafe");
            pablo.setEquipo(getafe);
            jugadorRepository.save(pablo);
            Jugador josep = new Jugador("josep",LocalDate.of(1996,3,8),3,5,4,"aleron");
            getafe = equipoRepository.findByNombre("Getafe");
            josep.setEquipo(getafe);
            jugadorRepository.save(josep);
            Jugador pau = new Jugador("pau",LocalDate.of(1996,7,12),1,2,3,"base");
            getafe = equipoRepository.findByNombre("Getafe");
            pau.setEquipo(getafe);
            jugadorRepository.save(pau);
            Jugador joan = new Jugador("joan",LocalDate.of(1995,1,3),2,3,4,"pivot");
            getafe = equipoRepository.findByNombre("Getafe");
            joan.setEquipo(getafe);
            jugadorRepository.save(joan);
            Jugador alejandro = new Jugador("alejandro",LocalDate.of(1996,3,23),9,8,7,"aleron");
            getafe = equipoRepository.findByNombre("Getafe");
            alejandro.setEquipo(getafe);
            jugadorRepository.save(alejandro);

            Jugador alex= new Jugador("alex",LocalDate.of(1987,10,3),8,9,5,"base");
            Equipo atletico = equipoRepository.findByNombre("Atletico");
            alex.setEquipo(atletico);
            jugadorRepository.save(alex);
            Jugador berjen = new Jugador("berjen",LocalDate.of(1990,3,7),5,1,2,"pivot");
            atletico = equipoRepository.findByNombre("Atletico");
            berjen.setEquipo(atletico);
            jugadorRepository.save(berjen);
            Jugador darien = new Jugador("darien",LocalDate.of(1989,1,10),11,6,4,"aleron");
            atletico = equipoRepository.findByNombre("Atletico");
            darien.setEquipo(atletico);
            jugadorRepository.save(darien);
            Jugador faker= new Jugador("faker",LocalDate.of(1993,7,17),10,10,10,"base");
            atletico = equipoRepository.findByNombre("Atletico");
            faker.setEquipo(atletico);
            jugadorRepository.save(faker);
            Jugador darc = new Jugador("darc",LocalDate.of(1428,12,1),1,6,0,"pivot");
            atletico = equipoRepository.findByNombre("Atletico");
            darc.setEquipo(atletico);
            jugadorRepository.save(darc);

            Jugador Shyaporn = new Jugador("Shya",LocalDate.of(1989, 1, 2), 4, 2, 8, "base");
            Equipo stucom = equipoRepository.findByNombre("Stucom");
            Shyaporn.setEquipo(stucom);
            jugadorRepository.save(Shyaporn);
            Jugador Jordan = new Jugador("Miquel", LocalDate.of(1972, 10, 2), 4, 1999, 88, "base");
            stucom = equipoRepository.findByNombre("Stucom");
            Jordan.setEquipo(stucom);
            jugadorRepository.save(Jordan);
            Jugador Bone = new Jugador("Jose", LocalDate.of(1974, 10, 5), 9,19, 8,"WaterBoy");
            stucom = equipoRepository.findByNombre("Stucom");
            Bone.setEquipo(stucom);
            jugadorRepository.save(Bone);
            Jugador Torquemada = new Jugador("Inquisidor", LocalDate.of(1425, 1, 29), 568,1587, 1547,"WaterBoy");
            stucom = equipoRepository.findByNombre("Stucom");
            Torquemada.setEquipo(stucom);
            jugadorRepository.save(Torquemada);
            Jugador Andreu = new Jugador("Adeu",LocalDate.of(1984, 8, 29), 15, 25, 17, "Ala");
            stucom = equipoRepository.findByNombre("Stucom");
            Andreu.setEquipo(stucom);
            jugadorRepository.save(Andreu);

            Jugador Landa = new Jugador("Hans", LocalDate.of(1986, 10, 8), 7, 17, 45, "Ala");
            Equipo Stucom = equipoRepository.findByNombre("Stucom");
            Landa.setEquipo(stucom);
            jugadorRepository.save(Landa);
            Jugador Ramon = new Jugador("Balon", LocalDate.of(1964, 1, 21), 4, 8, 9, "Pivote");
            stucom = equipoRepository.findByNombre("Stucom");
            Ramon.setEquipo(stucom);
            jugadorRepository.save(Ramon);
            Jugador Delgado = new Jugador("Javi", LocalDate.of(1991, 4, 24), 8, 9, 17, "Pivote");
            stucom = equipoRepository.findByNombre("Stucom");
            Delgado.setEquipo(stucom);
            jugadorRepository.save(Delgado);
            Jugador Estatua = new Jugador("Equestre",LocalDate.of(1984, 7, 17), 5, 2, 7, "Salero");
            stucom = equipoRepository.findByNombre("Stucom");
            Estatua.setEquipo(stucom);
            jugadorRepository.save(Estatua);
            Jugador Chapa = new Jugador("Pote",LocalDate.of(1982, 3, 4), 6, 8, 2, "Salero");
            stucom = equipoRepository.findByNombre("Stucom");
            Chapa.setEquipo(stucom);
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
            System.out.println("Medias: ");
            System.out.println(jugadorRepository.Medias());
            System.out.println("===============================================================================================================================================================================================================================================================================================================");
    //g
            System.out.println("Estadisticas completas: ");
            System.out.println(jugadorRepository.EstadisticasCompletas());

//EstadisticasCompletas
//              for (EstadisticasPosicion ep: jugadorRepository.EstadisticasCompletas()
//                 ) {
//                ep.getMaxAsistencias()
//                System.out.println(ep);
//            }
            System.out.println("===============================================================================================================================================================================================================================================================================================================");

            System.out.println("Jugadores del Barça");
            System.out.println(jugadorRepository.findByEquipoNombre("Barça"));
            System.out.println("===============================================================================================================================================================================================================================================================================================================");

            System.out.println("Jugadores del Barça y que sean aleron");
            System.out.println(jugadorRepository.findByEquipoNombreAndPosicion("Barça", "aleron"));
            System.out.println("===============================================================================================================================================================================================================================================================================================================");

            System.out.println("Jugadores del Barça mas canastas del Barça");
            System.out.println(jugadorRepository.findTopByEquipoNombreOrderByNumCanastasDesc("Barça"));
            System.out.println("===============================================================================================================================================================================================================================================================================================================");

        }
        }
