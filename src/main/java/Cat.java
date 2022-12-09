public class Cat {
    private String name;

    public String getMessage() {
        return name;
    }

    public void setMessage(String message) {
        this.name = message;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
