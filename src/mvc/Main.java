package mvc;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(model, view);

        String[] data = {"1", "2", "3"};
        String id = "202117547";
        controller.setData(data);
        controller.setDataId(id);

        controller.updateView();
    }
}
