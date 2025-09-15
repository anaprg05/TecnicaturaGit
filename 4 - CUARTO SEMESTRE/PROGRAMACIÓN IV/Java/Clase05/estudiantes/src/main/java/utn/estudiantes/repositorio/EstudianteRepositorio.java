package utn.estudiantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.estudiantes.modelo.Estudiantes2024;

/*
Antes se utilizaba la siguiente anotación:

    @Repository
    import org.springframework.stereotype.Repository;

Pero, gracias al uso de 'extends JpaRepository', ya no es necesario
*/

public interface EstudianteRepositorio extends JpaRepository<Estudiantes2024, Integer> {

}
