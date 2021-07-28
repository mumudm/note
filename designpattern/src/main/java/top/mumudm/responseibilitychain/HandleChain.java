package top.mumudm.responseibilitychain;

import java.util.LinkedList;
import java.util.List;

public class HandleChain {

    private List<Handle> list = new LinkedList<>();

    public HandleChain(Handle handle){
        list.add(handle);
    }

    public HandleChain addHandle(Handle handle){
        list.add(handle);
        return this;
    }

    public void doExecute(String type){
        for (Handle handle : list) {
            boolean process = handle.process(type);
            if(!process){
                return;
            }
        }
    }

}
