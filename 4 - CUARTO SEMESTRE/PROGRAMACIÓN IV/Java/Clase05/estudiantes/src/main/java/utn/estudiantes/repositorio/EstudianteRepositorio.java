package utn.estudiantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.estudiantes.modelo.Estudiante;

/*
Antes se utilizaba la siguiente anotación:

    @Repository
    import org.springframework.stereotype.Repository;

Pero, gracias al uso de 'extends JpaRepository', ya no es necesario
*/

public interface EstudianteRepositorio extends JpaRepository<Estudiante, Integer> {

}
