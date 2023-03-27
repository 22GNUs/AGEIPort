package com.alibaba.ageiport.processor.core.task.exporter.api;

import java.io.Serializable;
import java.util.Map;

/**
 * @author lingyi
 */
public interface BizExportTaskRuntimeConfig extends Serializable {
    Integer getPageSize();

    String getExecuteType();

    String getTaskSliceStrategy();

    String getFileType();

    Map<String, Object> getAttributes();
}
