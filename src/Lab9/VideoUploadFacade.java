package Lab9;

class VideoUploadFacade {
    private VideoFormatConverter converter = new VideoFormatConverter();
    private YouTubeAPI youTubeAPI = new YouTubeAPI("your-api-key");

    public void uploadVideo(VideoTestFile file) {
        VideoTestFile formattedFile = converter.convertToMp4(file);
        youTubeAPI.uploadVideo(formattedFile);
    }
}
