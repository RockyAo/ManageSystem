package com.rocky.ao.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author yun.ao
 * @date 2023/1/13 14:39
 * @description
 */
public class IOUtils {

    /**
     * 关闭对象，连接
     * @param closeable
     */
    public static void closeQuietly(final Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (final IOException ioe) {
            // ignore
        }
    }
}
