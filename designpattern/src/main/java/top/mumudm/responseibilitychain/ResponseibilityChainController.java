package top.mumudm.responseibilitychain;

public class ResponseibilityChainController {

    public static void main(String[] args) {
        HandleChain chain = new HandleChain(new AHandle())
                .addHandle(new BHandle())
                .addHandle(new AHandle())
                .addHandle(new CHandle());
        chain.doExecute("审批 1 ");
    }


}
