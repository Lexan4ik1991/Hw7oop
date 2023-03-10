package Model;

import java.util.List;

public interface Mapper {

    public String map(List<Note> list);
    public List<Note> map(String text) throws Exception;

}