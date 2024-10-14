package mvc;

public class Controller {
    private Model data = new Model();
    private View view = new View();

    public Controller(Model model, View view) {
        this.data = model;
        this.view = view;
    }

    public String getDataId() {
        return data.getId();
    }
    public String [] getData() {
        return data.getData();
    }

    public void setData(String[] data) {
        this.data.setData(data);
    }
    public void setDataId(String id) {
        this.data.setId(id);
    }

    public void updateView() {
        view.printData(data.getData());
        view.printId(data.getId());
    }
}
