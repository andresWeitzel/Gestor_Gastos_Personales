
package mypackage.repositories.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import mypackage.entities.Gasto;


public interface I_GastoRepository {
  
    void save(Gasto gasto);
    
    void remove(Gasto gasto);

    void update(Gasto gasto);
    
    List <Gasto> getSumaTotalCompras();

    List <Gasto> getAll();
    
    default Stream <Gasto> getStream(){
        return getAll().stream();
    }
    
    default Gasto getById(int id){
        return getStream()
                .filter(objeto->objeto.getId() == id)
                .findAny()
                .orElse(new Gasto());
    }
        
    default List<Gasto> getLikeId(String id) {
        if (id == null) {
            return new ArrayList<Gasto>();
        }
        return getStream()
                .filter(objeto -> String.valueOf(objeto.getId())
                .contains(id))
                .collect(Collectors.toList());
    }
    
    default List<Gasto> getByPrecioCompras(float precio_compras){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_compras() == precio_compras)
                .collect(Collectors.toList());
    }   
    
       default List<Gasto> getLikePrecioCompras(String precio_compras) {
        if (precio_compras == null) {
            return new ArrayList<Gasto>();
        }
        return getStream()
                .filter(objeto -> String.valueOf(objeto.getPrecio_compras())
                .contains(precio_compras))
                .collect(Collectors.toList());
    }
    

    default List<Gasto> getByPrecioComprasMayorQue(float precio_compras){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_compras() > precio_compras)
                .collect(Collectors.toList());
    }    
    
    
    default List<Gasto> getByPrecioComprasMenorQue(float precio_compras){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_compras() < precio_compras)
                .collect(Collectors.toList());
    }    
    
    
    
    
   
    default List<Gasto> getLikeComentarioCompras(String comentario_compras){
           if (comentario_compras== null) {
            return new ArrayList<Gasto>();
        }
        return getStream()
                .filter(objetoGasto -> objetoGasto. getComentario_compras().toLowerCase()
                .startsWith(comentario_compras.toLowerCase()))
                .collect(Collectors.toList());
      
    }


    default List<Gasto> getByPrecioServicios(float precio_servicios){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_servicios() == precio_servicios)
                .collect(Collectors.toList());
    }    
    
         default List<Gasto> getLikePrecioServicios(String precio_servicios) {
        if (precio_servicios == null) {
            return new ArrayList<Gasto>();
        }
        return getStream()
                .filter(objeto -> String.valueOf(objeto.getPrecio_servicios())
                .contains(precio_servicios))
                .collect(Collectors.toList());
    }
    
    
    default List<Gasto> getByPrecioServiciosMayorQue(float precio_servicios){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_servicios() >  precio_servicios)
                .collect(Collectors.toList());
    }    
    
    
    default List<Gasto> getByPrecioServiciosMenorQue(float precio_servicios){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_servicios() <  precio_servicios)
                .collect(Collectors.toList());
    }    
    
    
   
    default List<Gasto> getLikeComentarioServicios(String comentario_servicios){
           if (comentario_servicios == null) {
            return new ArrayList<Gasto>();
        }
        return getStream()
                .filter(objetoGasto -> objetoGasto. getComentario_servicios().toLowerCase()
                .startsWith(comentario_servicios.toLowerCase()))
                .collect(Collectors.toList());
      
    }

    
    default List<Gasto> getByPrecioTransporte(float precio_transporte){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_transporte() == precio_transporte)
                .collect(Collectors.toList());
    }    
    
         default List<Gasto> getLikePrecioTransporte(String precio_transporte) {
        if (precio_transporte == null) {
            return new ArrayList<Gasto>();
        }
        return getStream()
                .filter(objeto -> String.valueOf(objeto.getPrecio_transporte())
                .contains(precio_transporte))
                .collect(Collectors.toList());
    }
    
    default List<Gasto> getByPrecioTransporteMayorQue(float precio_transporte){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_transporte() > precio_transporte)
                .collect(Collectors.toList());
    }    
    
    
    default List<Gasto> getByPrecioTransporteMenorQue(float precio_transporte){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_transporte() < precio_transporte)
                .collect(Collectors.toList());
    }    
    
    
    
    default List<Gasto> getLikeComentarioTransporte(String comentario_transporte){
           if (comentario_transporte == null) {
            return new ArrayList<Gasto>();
        }
        return getStream()
                .filter(objetoGasto -> objetoGasto. getComentario_transporte().toLowerCase()
                .startsWith(comentario_transporte.toLowerCase()))
                .collect(Collectors.toList());
      
    }
    
    default List<Gasto> getLikeFecha(String fecha){
           if (fecha == null) {
            return new ArrayList<Gasto>();
        }
        return getStream()
                .filter(objetoGasto -> objetoGasto. getFecha() 
                .contains(fecha))
                .collect(Collectors.toList());
      
    }    
    
    
}
