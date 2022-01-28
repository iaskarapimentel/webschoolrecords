package com.example.xavecoding.webschoolrecods.repository;

import com.example.xavecoding.webschoolrecods.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//primeiro passa a entidade e depois o tipo da chave primaria
//todos os metodos crud estao pronto jpa herda paginacao e paginca'cao herda de crud e ai sim repositorio
// a jpa tem acesso a tudo
// a anotacao ele cria um objeto associado a referencia sempre que precisar
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
