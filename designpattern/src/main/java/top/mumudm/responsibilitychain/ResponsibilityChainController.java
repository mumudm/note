package top.mumudm.responsibilitychain;

public class ResponsibilityChainController {

    public static void main(String[] args) {
        HandleChain chain = new HandleChain(new AHandle())
                .addHandle(new BHandle())
                .addHandle(new AHandle())
                .addHandle(new CHandle());
        chain.doExecute("审批 1 ");
    }


}
