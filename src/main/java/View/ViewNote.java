package View;

public class ViewNote implements IViewNote{

    private IViewOperation viewOperation;

    public ViewNote(IViewOperation viewOperation) {
        this.viewOperation = viewOperation;
    }

    public void run(){
        boolean isContinue = true;
        while (isContinue){
            try{

                String command = viewOperation.prompt("Введите команду: \n" +
                        "CREATE/" +
                        "READ/" +
                        "LIST/" +
                        "DELETE/" +
                        "UPDATE/" +
                        "EXIT\n");
                Commands com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT){
                    isContinue = false;
                    continue;
                }

                switch (com){
                    case CREATE:
                        viewOperation.create();
                        break;
                    case READ:
                        viewOperation.read();
                        break;
                    case UPDATE:
                        viewOperation.update();
                        break;
                    case LIST:
                        viewOperation.list();
                        break;
                    case DELETE:
                        viewOperation.delete();
                        break;
                }
            }catch (Exception e){
                System.out.println("Произошла ошибка");
            }
        }
    }



}