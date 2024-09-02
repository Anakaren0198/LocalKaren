import java.util.List;

public interface Metodo {

	public void guardar(Celulares celulares);
	
	public List<Celulares>lista();
	
	public Celulares buscar(int indice);
	
	public void editar(int indice,Celulares celular);
	
	public void eliminar(int indice);
	
}
