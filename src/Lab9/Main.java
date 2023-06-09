package Lab9;

public class Main {
    public static void main(String[] args) {
        VideoUploadFacade facade = new VideoUploadFacade();
        facade.uploadVideo(new VideoTestFile("test_video"));
    }
}
