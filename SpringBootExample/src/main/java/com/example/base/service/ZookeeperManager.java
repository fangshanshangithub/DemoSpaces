package com.example.base.service;

/**
 * 统一配置管理中心【这里读取的不是属性文件，是redis中的数据，主要是主节点进行资源修改的入口】
 */
public interface ZookeeperManager {

    /**
     *  初始化zookeeper中的公共数据
     * @return boolean
     */
    boolean init();

    /**
     * 更新公共数据
     * @return boolean
     */
    boolean updateZKDate();

    /**
     * 将公共数据同步到其它ZK
     * @return
     */
    boolean syncDateToZKs();

}
