package top.mumudm.responsibilitychain;

public interface Handle {


    /**
     * 执行方法
     * @param type 操作类型 1 审批
     * @return 是否处理下一个
     */
    boolean process(String type);
}
