import java.util.ArrayList;
import java.util.List;

public class LogicaMetodos implements Metodo{

	List<Celulares> listaCels =new ArrayList<Celulares>();
	
	
	
	

	
	@Override
	public void guardar(Celulares celulares) {
		// TODO Auto-generated method stub
		listaCels.add(celulares);
		
	}

	@Override
	public List<Celulares> lista() {
		// TODO Auto-generated method stub
		return listaCels;
		
	}

	@Override
	public Celulares buscar(int indice) {
		// TODO Auto-generated method stub
		return listaCels.get(indice);
	}

	@Override
	public void editar(int indice, Celulares celular) {
		// TODO Auto-generated method stub
		listaCels.set(indice, celular);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		listaCels.remove(indice);
	}
		
		
	
		
//Declarar metodos y poner la logica 
	public void contarReg() {
		System.out.println("REGISTROS EN LA LISTA"+lista().size());
		
	}
	
	public void mostrarIndiceMarc() {
		System.out.println("REGISTROS EN LA LISTA POR INDICE");
		for(int i=0;  i<listaCels.size(); i++) {
			System.out.printf("\n[%d]" + listaCels.get(i).getMarca(),i);
		}
	}
	
	public void BuscarxModelo(String modelo) {
	
	for(Celulares p:listaCels) {
		if (p.getModelo().equals(modelo)) {
			
			System.out.println(p);
			break;
		}
	}
	}
		public void BuscarxMarca(String marca) {
			
			for(Celulares p:listaCels) {
				if (p.getMarca().equals(marca)) {
					
					System.out.println(p);
					break;
		
	}
}
}
		
		
		
		
		public void Inventario() {
			// TODO Auto-generated method stub
			
			Float summary=0f;
			for (Celulares celulares : listaCels) {
				summary+=celulares.getPrecio();
			}
			
			
			
			
			System.out.println("EL TOTAL INVERTIDO ES: "+summary);
	}

		
		
		
}
			

