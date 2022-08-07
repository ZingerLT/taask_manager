import java.util.ArrayList;
import java.util.List;

public class DB_Inpl implements DB{

    private List<Task> tasks = new ArrayList<>();

    private int count = 1;


    @Override
    public Task add(Task task) {
        task.setId(count++);
        tasks.add(task);
        return task;
    }

    @Override
    public void delete(int id) {
        Task task = findById(id);
        if(task == null){
            return;
        }
        tasks.remove(id);
    }

    @Override
    public Task findById(int id) {
        return tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Task update(Task taskToUpdate) {
        Task task = findById(taskToUpdate.getId());

        if(task == null){
            return null;
        }

        task.setName(taskToUpdate.getName());
        task.setDescription(task.getDescription());
        task.setDone(task.isDone());

        return task;
    }

    @Override
    public List<Task> getAll() {
        return tasks;
    }
}
