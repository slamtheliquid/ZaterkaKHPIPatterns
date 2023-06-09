package Lab9;

class YouTubeAPI {
    private String apiKey;

    public YouTubeAPI(String apiKey){
        this.apiKey = apiKey;
    }

    public void uploadVideo(VideoTestFile file) {
        System.out.println("Uploading video " + file + " to YouTube...");
    }
}
