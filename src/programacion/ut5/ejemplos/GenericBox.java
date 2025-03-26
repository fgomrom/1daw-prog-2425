package programacion.ut5.ejemplos;

public class GenericBox<T> {
    private T content;
    
    public GenericBox(T content) {
		this.content = content;
	}

	public void setContent(T content) {
        this.content = content;
    }
    
    public T getContent() {
        return content;
    }
}

