// One class can inherit a class but implement multiple interfaces - comma separated
//extend first, then implement interfaces
public class video extends file implements utility {
    @Override
    public void OpenAndExecute() {
        System.out.println("Playing a video");
    }

    @Override
    public void transfer() {

    }

    @Override
    public void compress() {
        System.out.println("Compressing the video");
    }

    @Override
    public void delete() {

    }
}


