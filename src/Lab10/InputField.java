package Lab10;

public class InputField extends HTMLFormComponent{
    private String name;

    public InputField(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return "Renderin InputField: " + name;
    }
}
