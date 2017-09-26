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
        Equipo Barça =new Equipo("Barça","Barcelona",LocalDate.of(1998,8,11));
        equipoRepository.save(Barça);

        System.out.println("===============================================================================================================================================================================================================================================================================================================");
        System.out.println("Equipos de Barcelona");
        System.out.println(equipoRepository.findByLocalidadContaining("Barcelona"));
        System.out.println("===============================================================================================================================================================================================================================================================================================================");

    }

}
