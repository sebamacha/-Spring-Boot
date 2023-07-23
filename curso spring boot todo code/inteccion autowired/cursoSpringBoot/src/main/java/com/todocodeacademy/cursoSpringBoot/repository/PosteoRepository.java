package com.todocodeacademy.cursoSpringBoot.repository;
import com.todocodeacademy.cursoSpringBoot.model.Posteo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PosteoRepository implements IPosteoRepository{

    @Override
    public List<Posteo> traerTodos() {
       List<Posteo> listaPosteos = new ArrayList<Posteo> ();
       listaPosteos.add(new Posteo (1L, "¿Cómo formatear una PC?", "Sebastian Macharette"));
       listaPosteos.add(new Posteo (2L, "¿Cómo mantener la seguridad?", "Sebastian Macharette"));
        listaPosteos.add(new Posteo (3L, "¿Cómo instalar cosas que no debo?", "Sebastian Macharette"));
        listaPosteos.add(new Posteo (4L, "¿Cómo sobrecargar la pc?", "Sebastian Macharette"));
       
       return listaPosteos;
    }
    
    
    
}
