/**
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
package io.streamnative.pulsar.handlers.amqp.proxy;

import lombok.Getter;
import lombok.Setter;
import org.apache.pulsar.common.configuration.Category;
import org.apache.pulsar.common.configuration.FieldContext;

/**
 * Configuration for AMQP proxy service.
 */
@Getter
@Setter
public class ProxyConfiguration {

    @Category
    private static final String CATEGORY_AMQP = "AMQP on Pulsar";
    @Category
    private static final String CATEGORY_AMQP_PROXY = "AMQP Proxy";
    @Category
    private static final String CATEGORY_BROKER_DISCOVERY = "Broker Discovery";

    @FieldContext(
            category = CATEGORY_AMQP,
            required = true,
            doc = "Amqp on Pulsar Broker tenant"
    )
    private String amqpTenant = "public";

    @FieldContext(
            category = CATEGORY_AMQP_PROXY,
            required = false,
            doc = "The amqp proxy port"
    )
    private int amqpProxyPort = 5682;

    @FieldContext(
            category = CATEGORY_BROKER_DISCOVERY,
            doc = "The service url points to the broker cluster"
    )
    private String brokerServiceURL;

}
