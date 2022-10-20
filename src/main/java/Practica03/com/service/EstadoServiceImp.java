package Practica03.com.service;


import Practica03.com.dao.EstadoDao;
import Practica03.com.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class EstadoServiceImp implements EstadoService {
    //se definen los metodos del CRUD

    //se utiliza una anotacion autowired para que el objeto ClienteDao
    //si ya esta en memoria se use, si no se crea(singleton)
    @Autowired
    private EstadoDao estadoDao;

    //Metodo que retorna la lista de clientes
    @Override
    @Transactional(readOnly=true)
    
    public List<Estado> getEstados() {
        return (List<Estado>)estadoDao.findAll();
    }

    //Dado un cliente.id se busca en la tabla y se retorna todo el objeto (segundo cliente es el objeto)
    //Si el objeto cliente viene vacio entonces Cliente es vacio
    
    @Override
    @Transactional(readOnly=true)
    public Estado getEstado(Estado estado){
        return estadoDao.findById(estado.getIdEstado()).orElse(null);                       
    }

    //si el cliente .id tiene valor se busca y se actualiza
    // si no tiene valor inserta el objeto en la tabla
    @Override
    @Transactional
    public void save(Estado estado){
        estadoDao.save(estado);
    }

    //Elimina el registro
    @Override
    @Transactional
    public void delete(Estado estado){
        estadoDao.delete(estado);
    }

}
