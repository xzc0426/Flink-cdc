package com.xzc;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

/**
 * Created by Xu on 2024/5/26.
 * Describe:
 */
public class FlinkCDC_SQL {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);
        StreamTableEnvironment tableEnv = StreamTableEnvironment.create(env);
        tableEnv.executeSql("");
        //查询上表结果
        Table table = tableEnv.sqlQuery("select * from ");
        table.execute().print();
    }
}
