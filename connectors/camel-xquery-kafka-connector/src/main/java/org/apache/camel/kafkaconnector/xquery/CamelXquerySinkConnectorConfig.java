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
package org.apache.camel.kafkaconnector.xquery;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelXquerySinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_XQUERY_PATH_RESOURCE_URI_CONF = "camel.sink.path.resourceUri";
    public static final String CAMEL_SINK_XQUERY_PATH_RESOURCE_URI_DOC = "The name of the template to load from classpath or file system";
    public static final String CAMEL_SINK_XQUERY_PATH_RESOURCE_URI_DEFAULT = null;
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_ALLOW_ST_AXCONF = "camel.sink.endpoint.allowStAX";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_ALLOW_ST_AXDOC = "Whether to allow using StAX mode";
    public static final Boolean CAMEL_SINK_XQUERY_ENDPOINT_ALLOW_ST_AXDEFAULT = false;
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_HEADER_NAME_CONF = "camel.sink.endpoint.headerName";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_HEADER_NAME_DOC = "To use a Camel Message header as the input source instead of Message body.";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_HEADER_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_NAMESPACE_PREFIXES_CONF = "camel.sink.endpoint.namespacePrefixes";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_NAMESPACE_PREFIXES_DOC = "Allows to control which namespace prefixes to use for a set of namespace mappings";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_NAMESPACE_PREFIXES_DEFAULT = null;
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_RESULTS_FORMAT_CONF = "camel.sink.endpoint.resultsFormat";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_RESULTS_FORMAT_DOC = "What output result to use One of: [Bytes] [BytesSource] [DOM] [DOMSource] [List] [String] [StringSource]";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_RESULTS_FORMAT_DEFAULT = "DOM";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_RESULT_TYPE_CONF = "camel.sink.endpoint.resultType";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_RESULT_TYPE_DOC = "What output result to use defined as a class";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_RESULT_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_STRIPS_ALL_WHITE_SPACE_CONF = "camel.sink.endpoint.stripsAllWhiteSpace";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_STRIPS_ALL_WHITE_SPACE_DOC = "Whether to strip all whitespaces";
    public static final Boolean CAMEL_SINK_XQUERY_ENDPOINT_STRIPS_ALL_WHITE_SPACE_DEFAULT = true;
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_XQUERY_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_XQUERY_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_CONFIGURATION_CONF = "camel.sink.endpoint.configuration";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_CONFIGURATION_DOC = "To use a custom Saxon configuration";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_CONFIGURATION_PROPERTIES_CONF = "camel.sink.endpoint.configurationProperties";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_CONFIGURATION_PROPERTIES_DOC = "To set custom Saxon configuration properties";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_CONFIGURATION_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_MODULE_URIRESOLVER_CONF = "camel.sink.endpoint.moduleURIResolver";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_MODULE_URIRESOLVER_DOC = "To use the custom ModuleURIResolver";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_MODULE_URIRESOLVER_DEFAULT = null;
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_PARAMETERS_CONF = "camel.sink.endpoint.parameters";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_PARAMETERS_DOC = "Additional parameters";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_PROPERTIES_CONF = "camel.sink.endpoint.properties";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_PROPERTIES_DOC = "Properties to configure the serialization parameters";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_STATIC_QUERY_CONTEXT_CONF = "camel.sink.endpoint.staticQueryContext";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_STATIC_QUERY_CONTEXT_DOC = "To use a custom Saxon StaticQueryContext";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_STATIC_QUERY_CONTEXT_DEFAULT = null;
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_XQUERY_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_XQUERY_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_XQUERY_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.xquery.lazyStartProducer";
    public static final String CAMEL_SINK_XQUERY_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_XQUERY_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_XQUERY_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.xquery.basicPropertyBinding";
    public static final String CAMEL_SINK_XQUERY_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_XQUERY_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_XQUERY_COMPONENT_CONFIGURATION_CONF = "camel.component.xquery.configuration";
    public static final String CAMEL_SINK_XQUERY_COMPONENT_CONFIGURATION_DOC = "To use a custom Saxon configuration";
    public static final String CAMEL_SINK_XQUERY_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_XQUERY_COMPONENT_CONFIGURATION_PROPERTIES_CONF = "camel.component.xquery.configurationProperties";
    public static final String CAMEL_SINK_XQUERY_COMPONENT_CONFIGURATION_PROPERTIES_DOC = "To set custom Saxon configuration properties";
    public static final String CAMEL_SINK_XQUERY_COMPONENT_CONFIGURATION_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SINK_XQUERY_COMPONENT_MODULE_URIRESOLVER_CONF = "camel.component.xquery.moduleURIResolver";
    public static final String CAMEL_SINK_XQUERY_COMPONENT_MODULE_URIRESOLVER_DOC = "To use the custom ModuleURIResolver";
    public static final String CAMEL_SINK_XQUERY_COMPONENT_MODULE_URIRESOLVER_DEFAULT = null;

    public CamelXquerySinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelXquerySinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_XQUERY_PATH_RESOURCE_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XQUERY_PATH_RESOURCE_URI_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_XQUERY_PATH_RESOURCE_URI_DOC);
        conf.define(CAMEL_SINK_XQUERY_ENDPOINT_ALLOW_ST_AXCONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XQUERY_ENDPOINT_ALLOW_ST_AXDEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_ENDPOINT_ALLOW_ST_AXDOC);
        conf.define(CAMEL_SINK_XQUERY_ENDPOINT_HEADER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XQUERY_ENDPOINT_HEADER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_ENDPOINT_HEADER_NAME_DOC);
        conf.define(CAMEL_SINK_XQUERY_ENDPOINT_NAMESPACE_PREFIXES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XQUERY_ENDPOINT_NAMESPACE_PREFIXES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_ENDPOINT_NAMESPACE_PREFIXES_DOC);
        conf.define(CAMEL_SINK_XQUERY_ENDPOINT_RESULTS_FORMAT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XQUERY_ENDPOINT_RESULTS_FORMAT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_ENDPOINT_RESULTS_FORMAT_DOC);
        conf.define(CAMEL_SINK_XQUERY_ENDPOINT_RESULT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XQUERY_ENDPOINT_RESULT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_ENDPOINT_RESULT_TYPE_DOC);
        conf.define(CAMEL_SINK_XQUERY_ENDPOINT_STRIPS_ALL_WHITE_SPACE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XQUERY_ENDPOINT_STRIPS_ALL_WHITE_SPACE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_ENDPOINT_STRIPS_ALL_WHITE_SPACE_DOC);
        conf.define(CAMEL_SINK_XQUERY_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XQUERY_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_XQUERY_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XQUERY_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_XQUERY_ENDPOINT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XQUERY_ENDPOINT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_ENDPOINT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_XQUERY_ENDPOINT_CONFIGURATION_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XQUERY_ENDPOINT_CONFIGURATION_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_ENDPOINT_CONFIGURATION_PROPERTIES_DOC);
        conf.define(CAMEL_SINK_XQUERY_ENDPOINT_MODULE_URIRESOLVER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XQUERY_ENDPOINT_MODULE_URIRESOLVER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_ENDPOINT_MODULE_URIRESOLVER_DOC);
        conf.define(CAMEL_SINK_XQUERY_ENDPOINT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XQUERY_ENDPOINT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_ENDPOINT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_XQUERY_ENDPOINT_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XQUERY_ENDPOINT_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_ENDPOINT_PROPERTIES_DOC);
        conf.define(CAMEL_SINK_XQUERY_ENDPOINT_STATIC_QUERY_CONTEXT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XQUERY_ENDPOINT_STATIC_QUERY_CONTEXT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_ENDPOINT_STATIC_QUERY_CONTEXT_DOC);
        conf.define(CAMEL_SINK_XQUERY_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XQUERY_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_XQUERY_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XQUERY_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_XQUERY_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_XQUERY_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_XQUERY_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XQUERY_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_XQUERY_COMPONENT_CONFIGURATION_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XQUERY_COMPONENT_CONFIGURATION_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_COMPONENT_CONFIGURATION_PROPERTIES_DOC);
        conf.define(CAMEL_SINK_XQUERY_COMPONENT_MODULE_URIRESOLVER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_XQUERY_COMPONENT_MODULE_URIRESOLVER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_XQUERY_COMPONENT_MODULE_URIRESOLVER_DOC);
        return conf;
    }
}