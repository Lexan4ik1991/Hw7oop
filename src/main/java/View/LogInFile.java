package View;

import Logger.ILogger;

import java.time.LocalDateTime;

public class LogInFile implements IViewOperation{

    private IViewOperation viewOperation;
    private ILogger iLogger;

    public LogInFile(IViewOperation viewOperation, ILogger logger) {
        this.viewOperation = viewOperation;
        this.iLogger = logger;
    }

    private String logText(String method){
        return logText(LocalDateTime.now(), method);
    }

    private String logText(LocalDateTime dateTime, String method){
        String text = String.format("\ndate: %s, method: %s", dateTime.toString(), method);
        return text;
    }

    @Override
    public void read() throws Exception {
        String text = logText("read");
        iLogger.log(text);
        viewOperation.read();
    }

    @Override
    public void delete() throws Exception {
        String text = logText("delete");
        iLogger.log(text);
        viewOperation.delete();
    }

    @Override
    public void update() throws Exception {
        String text = logText("update");
        iLogger.log(text);
        viewOperation.update();
    }

    @Override
    public void list() throws Exception {
        String text = logText("list");
        iLogger.log(text);
        viewOperation.list();
    }

    @Override
    public void create() throws Exception {
        String text = logText("create");
        iLogger.log(text);
        viewOperation.create();
    }


    @Override
    public String prompt(String message) {
        return viewOperation.prompt(message);
    }
}

