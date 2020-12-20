/*
 * Copyright ©2015-2020 Jaemon. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jaemon.dingerframework.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Dinger Definition工厂类
 *
 * @author Jaemon
 * @since 4.0
 */
public class DingerDefinitionGeneratorFactory {
    /** 解析 */
    static final Map<String, DingerDefinitionGenerator> dingTalkDefinitionGeneratorMap = new HashMap<>();

    /**
     * 根据key获取对应生成处理逻辑类
     *
     * @param key
     *          key
     * @return
     *          dingerDefinitionGenerator {@link DingerDefinitionGenerator}
     * */
    public static DingerDefinitionGenerator get(String key) {
        DingerDefinitionGenerator dingTalkDefinitionGenerator = dingTalkDefinitionGeneratorMap.get(key);
        if (dingTalkDefinitionGenerator == null) {
            // TODO throw
        }
        return dingTalkDefinitionGenerator;
    }

    static void clear() {
        dingTalkDefinitionGeneratorMap.clear();
    }

}