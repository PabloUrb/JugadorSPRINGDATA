package com.daw.basket.data.Service;


import com.daw.basket.data.entidades.Equipo;
import com.daw.basket.data.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;

    public  void testEquipo(){
        Equipo Barça = new Equipo("Barça","Barcelona",LocalDate.of(1998,8,11));
        equipoRepository.save(Barça);
        Equipo Madrid = new Equipo("Madrid","Madrid",LocalDate.of(1998,8,11));
        equipoRepository.save(Madrid);
        Equipo Getafe = new Equipo("Getafe", "Getafe", LocalDate.of(1998,8,11));
        equipoRepository.save(Getafe);
        Equipo Atletico = new Equipo("Atletico", "Atletico", LocalDate.of(1998,11,11));
        equipoRepository.save(Atletico);
        Equipo Stucom = new Equipo("Stucom","Barcelona", LocalDate.of(1999, 11,11));
        equipoRepository.save(Stucom);

        System.out.println("===============================================================================================================================================================================================================================================================================================================");
        System.out.println("Equipos de Barcelona");
        System.out.println(equipoRepository.findByLocalidadContaining("Barcelona"));
        System.out.println("===============================================================================================================================================================================================================================================================================================================");


        System.out.println("===============================================================================================================================================================================================================================================================================================================");
        System.out.println("Equipos");
        System.out.println(equipoRepository.findByFecha(LocalDate.of(1998,8,11)));
        System.out.println("===============================================================================================================================================================================================================================================================================================================");

        System.out.println("===============================================================================================================================================================================================================================================================================================================");
        System.out.println("Jugadores de Stucom");
        System.out.println(equipoRepository.findByNombre("Stucom"));
        System.out.println("===============================================================================================================================================================================================================================================================================================================");


    }

}
