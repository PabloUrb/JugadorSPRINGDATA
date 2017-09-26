package com.daw.basket.data.Service;


import entidades.Equipo;
import com.daw.basket.data.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service
public class EquipoService {
    @Autowired
    private EquipoRepository EquipoRepository;

    public static void testEquipo(){
        Equipo Barça =new Equipo("Barça","Barcelona",LocalDate.of(1998,8,11));
        EquipoRepository.save(Barça);

        System.out.println("===============================================================================================================================================================================================================================================================================================================");
        System.out.println("Equipos de Barcelona");
        System.out.println(EquipoRepository.findByLocalidadContaining("Barcelona"));
        System.out.println("===============================================================================================================================================================================================================================================================================================================");

    }

}
