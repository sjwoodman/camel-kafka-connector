/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.ironmq;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelIronmqSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_IRONMQ_PATH_QUEUE_NAME_CONF = "camel.sink.path.queueName";
    public static final String CAMEL_SINK_IRONMQ_PATH_QUEUE_NAME_DOC = "The name of the IronMQ queue";
    public static final String CAMEL_SINK_IRONMQ_PATH_QUEUE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_CLIENT_CONF = "camel.sink.endpoint.client";
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_CLIENT_DOC = "Reference to a io.iron.ironmq.Client in the Registry.";
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_IRON_MQCLOUD_CONF = "camel.sink.endpoint.ironMQCloud";
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_IRON_MQCLOUD_DOC = "IronMq Cloud url. Urls for public clusters: https://mq-aws-us-east-1-1.iron.io (US) and https://mq-aws-eu-west-1-1.iron.io (EU)";
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_IRON_MQCLOUD_DEFAULT = "https://mq-aws-us-east-1-1.iron.io";
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_PRESERVE_HEADERS_CONF = "camel.sink.endpoint.preserveHeaders";
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_PRESERVE_HEADERS_DOC = "Should message headers be preserved when publishing messages. This will add the Camel headers to the Iron MQ message as a json payload with a header list, and a message body. Useful when Camel is both consumer and producer.";
    public static final Boolean CAMEL_SINK_IRONMQ_ENDPOINT_PRESERVE_HEADERS_DEFAULT = false;
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_PROJECT_ID_CONF = "camel.sink.endpoint.projectId";
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_PROJECT_ID_DOC = "IronMQ projectId";
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_PROJECT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_TOKEN_CONF = "camel.sink.endpoint.token";
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_TOKEN_DOC = "IronMQ token";
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_IRONMQ_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_VISIBILITY_DELAY_CONF = "camel.sink.endpoint.visibilityDelay";
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_VISIBILITY_DELAY_DOC = "The item will not be available on the queue until this many seconds have passed. Default is 0 seconds.";
    public static final Integer CAMEL_SINK_IRONMQ_ENDPOINT_VISIBILITY_DELAY_DEFAULT = null;
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_IRONMQ_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_IRONMQ_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_IRONMQ_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_IRONMQ_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.ironmq.lazyStartProducer";
    public static final String CAMEL_SINK_IRONMQ_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_IRONMQ_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_IRONMQ_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.ironmq.basicPropertyBinding";
    public static final String CAMEL_SINK_IRONMQ_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_IRONMQ_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelIronmqSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelIronmqSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_IRONMQ_PATH_QUEUE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_IRONMQ_PATH_QUEUE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_IRONMQ_PATH_QUEUE_NAME_DOC);
        conf.define(CAMEL_SINK_IRONMQ_ENDPOINT_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_IRONMQ_ENDPOINT_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IRONMQ_ENDPOINT_CLIENT_DOC);
        conf.define(CAMEL_SINK_IRONMQ_ENDPOINT_IRON_MQCLOUD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_IRONMQ_ENDPOINT_IRON_MQCLOUD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IRONMQ_ENDPOINT_IRON_MQCLOUD_DOC);
        conf.define(CAMEL_SINK_IRONMQ_ENDPOINT_PRESERVE_HEADERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_IRONMQ_ENDPOINT_PRESERVE_HEADERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IRONMQ_ENDPOINT_PRESERVE_HEADERS_DOC);
        conf.define(CAMEL_SINK_IRONMQ_ENDPOINT_PROJECT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_IRONMQ_ENDPOINT_PROJECT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IRONMQ_ENDPOINT_PROJECT_ID_DOC);
        conf.define(CAMEL_SINK_IRONMQ_ENDPOINT_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_IRONMQ_ENDPOINT_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IRONMQ_ENDPOINT_TOKEN_DOC);
        conf.define(CAMEL_SINK_IRONMQ_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_IRONMQ_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IRONMQ_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_IRONMQ_ENDPOINT_VISIBILITY_DELAY_CONF, ConfigDef.Type.INT, CAMEL_SINK_IRONMQ_ENDPOINT_VISIBILITY_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IRONMQ_ENDPOINT_VISIBILITY_DELAY_DOC);
        conf.define(CAMEL_SINK_IRONMQ_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_IRONMQ_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IRONMQ_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_IRONMQ_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_IRONMQ_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IRONMQ_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_IRONMQ_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_IRONMQ_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IRONMQ_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_IRONMQ_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_IRONMQ_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_IRONMQ_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}