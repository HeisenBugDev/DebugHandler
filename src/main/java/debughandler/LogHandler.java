package debughandler;

public class LogHandler {
    public FileUploader uploader;
    public Prompter prompter;
    public FileWriter writer;

    public LogHandler(){
        uploader = new FileUploader();
        prompter = new Prompter();
        writer = new FileWriter();
    }
}
