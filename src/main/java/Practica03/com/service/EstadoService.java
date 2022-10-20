
package Practica03.com.service;


import Practica03.com.domain.Estado;
import java.util.List;

public interface EstadoService {
    //se definen los metodos del CRUD
    
    //Metodo que retorna la lista de clientes
    public List<Estado> getEstados();
    
    //Dado un cliente.id se busca en la tabla y se retorna todo el objeto (segundo cliente es el objeto)
    //Si el objeto cliente viene vacio entonces Cliente es vacio
    public Estado getEstado(Estado estado);
    
    //si el cliente .id tiene valor se busca y se actualiza
    // si no tiene valor inserta el objeto en la tabla
    public void save(Estado estado);
    
    
    //Elimina el registro
    public void delete(Estado estado);
    
    
}
