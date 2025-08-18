package TesteosDeExcepciones;

import Dispositivos.Componente;

    public void agregarAlCarrito(Componente componente) throws OutOfStockException, NotInListException{
        if (componente.getStock()==0){
            throw new OutOfStockException();
        } else if (!listado.contains(componente)) {
            throw new NotInListException();
        }
        else{
            this.carrito.add(componente);
            System.out.println("Componente "+componente.getModelo()+" agregado al carrito.");
        }
    }

