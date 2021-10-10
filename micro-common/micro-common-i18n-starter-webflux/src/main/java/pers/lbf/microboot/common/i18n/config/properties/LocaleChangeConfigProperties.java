/*
 * Copyright 2020 赖柄沣 bingfengdev@aliyun.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package pers.lbf.microboot.common.i18n.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

import static pers.lbf.microboot.common.i18n.constants.I18nConstants.AUTO_CONFIGURATION_PREFIX;


/**
 * TODO
 *
 * @author 赖柄沣 bingfengdev@aliyun.com
 * @version 1.0
 * @date 2021/10/9 9:33
 */
@ConfigurationProperties(prefix = AUTO_CONFIGURATION_PREFIX)
@Getter
@Setter
public class LocaleChangeConfigProperties {

    private boolean enabled = true;
    private String baseName = "i18n/messages";
    private Locale defaultLanguage = Locale.CHINA;
    private String defaultEncoding = StandardCharsets.UTF_8.name();
    private boolean useCodeAsDefaultMessage = false;
    private long cacheMillis = 60;
    private boolean fallbackToSystemLocale;
    
}