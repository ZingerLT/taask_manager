import java.util.List;

public interface DB {

    public Task add(Task task);

    public void delete(int id);

    public Task findById(int id);

    public Task update(Task task);

    public List<Task> getAll();

}
