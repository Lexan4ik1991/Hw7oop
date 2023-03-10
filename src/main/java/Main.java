import Controller.Controller;
import Controller.INoteController;
import Logger.ILogger;
import Logger.Logger;
import Model.*;
import View.*;

public class Main {
    private static IRepository repository;

    public static void main(String[] args) {
        ILogger logger = new Logger("log.txt");
        IFileOperation fileOperation = new FileOperation("note.txt");

        Repository repository = new Repository(new NotesMapper(), fileOperation);
        INoteController controller = new Controller(repository);
        IViewOperation viewOperation = new ViewOperation(controller);
        IViewOperation Logger = new LogInFile(viewOperation, logger);
        IViewNote view = new ViewNote(Logger);
        view.run();
    }
}