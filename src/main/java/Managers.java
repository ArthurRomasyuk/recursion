/**
 * Created by Alexandr on 26.08.2016.
 */
public class Managers {
    private String name;
    private Managers manager;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Managers getManager() {
        return manager;
    }

    public void setManager(Managers manager) {
        this.manager = manager;
    }


    @Override
    public String toString() {
        return "Managers{" +
                "name='" + name + '\'' +
                ", manager=" + (manager == null ? manager : manager.getName()) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Managers managers = (Managers) o;

        if (name != null ? !name.equals(managers.name) : managers.name != null) return false;
        return manager != null ? manager.equals(managers.manager) : managers.manager == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (manager != null ? manager.hashCode() : 0);
        return result;
    }
}
