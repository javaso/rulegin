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
package tb.rulegin.server.dao.component;

import tb.rulegin.server.common.data.component.ComponentDescriptor;
import tb.rulegin.server.common.data.component.ComponentScope;
import tb.rulegin.server.common.data.component.ComponentType;
import tb.rulegin.server.common.data.id.ComponentDescriptorId;
import tb.rulegin.server.common.data.page.TextPageData;
import tb.rulegin.server.common.data.page.TextPageLink;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * @author Andrew Shvayka
 */
public interface ComponentDescriptorService {

    ComponentDescriptor saveComponent(ComponentDescriptor component);

    ComponentDescriptor findById(ComponentDescriptorId componentId);

    ComponentDescriptor findByClazz(String clazz);

    TextPageData<ComponentDescriptor> findByTypeAndPageLink(ComponentType type, TextPageLink pageLink);

    TextPageData<ComponentDescriptor> findByScopeAndTypeAndPageLink(ComponentScope scope, ComponentType type, TextPageLink pageLink);

    boolean validate(ComponentDescriptor component, JsonNode configuration);

    void deleteByClazz(String clazz);

}
