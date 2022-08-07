import java.time.LocalDate;

public class Task {

    private int id;

    private String name;

    private String description;

    private LocalDate today = LocalDate.now();

    private boolean done;

    public Task(int id, boolean done){
        this.id=id;
        this.done=done;
    }

    public Task(String name, String description, boolean done) {
        this.name = name;
        this.description = description;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String toString(){
        return "Task: id=" + id + ", name:" + name +
                ", description:" + description +
                ", day:" + today.getDayOfMonth() + ", month:" + today.getMonthValue() +
                ", year:" + today.getYear()+ ", Completed:" + done +".\n";
    }
}
