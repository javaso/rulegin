/**
 * Copyright © 2016-2017 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tb.rulegin.server.dao.plugin;

import tb.rulegin.server.common.data.id.PluginId;
import tb.rulegin.server.common.data.id.UserId;
import tb.rulegin.server.common.data.page.TextPageData;
import tb.rulegin.server.common.data.page.TextPageLink;
import tb.rulegin.server.common.data.plugin.PluginMetaData;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

public interface PluginService {

    PluginMetaData savePlugin(PluginMetaData plugin);

    List<PluginMetaData> findAll();

    PluginMetaData findPluginById(PluginId pluginId);

    ListenableFuture<PluginMetaData> findPluginByIdAsync(PluginId pluginId);

    PluginMetaData findPluginByApiToken(String apiToken);

    TextPageData<PluginMetaData> findSystemPlugins(TextPageLink pageLink);

    TextPageData<PluginMetaData> findTenantPlugins(UserId tenantId, TextPageLink pageLink);

    List<PluginMetaData> findSystemPlugins();

    //TextPageData<PluginMetaData> findAllTenantPluginsByTenantIdAndPageLink(TenantId userId, TextPageLink pageLink);

    //List<PluginMetaData> findAllTenantPluginsByTenantId(TenantId userId);

    void activatePluginById(PluginId pluginId);

    void suspendPluginById(PluginId pluginId);

    void deletePluginById(PluginId pluginId);

    //void deletePluginsByTenantId(TenantId userId);

}
