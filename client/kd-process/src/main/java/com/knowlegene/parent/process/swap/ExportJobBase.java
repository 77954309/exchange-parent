package com.knowlegene.parent.process.swap;

import com.knowlegene.parent.config.common.constantenum.DBOperationEnum;
import com.knowlegene.parent.process.pojo.SwapOptions;
import com.knowlegene.parent.process.pojo.hive.HiveOptions;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.Row;

/**
 * @Author: limeng
 * @Date: 2019/8/20 15:52
 */
public class ExportJobBase extends JobBase {


    public ExportJobBase() {
    }

    public ExportJobBase(SwapOptions options) {
        super(options);
    }




    public static PCollection<Row> query() {
        return null;
    }


    public static void save(PCollection<Row> rows) {

    }
}
