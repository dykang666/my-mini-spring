package org.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:   资源的抽象和访问接口
 * @date 2024/8/3 17:05
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
