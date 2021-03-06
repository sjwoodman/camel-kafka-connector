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
package org.apache.camel.kafkaconnector.restopenapi;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelRestopenapiSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_RESTOPENAPI_PATH_SPECIFICATION_URI_CONF = "camel.sink.path.specificationUri";
    public static final String CAMEL_SINK_RESTOPENAPI_PATH_SPECIFICATION_URI_DOC = "Path to the OpenApi specification file. The scheme, host base path are taken from this specification, but these can be overridden with properties on the component or endpoint level. If not given the component tries to load openapi.json resource from the classpath. Note that the host defined on the component and endpoint of this Component should contain the scheme, hostname and optionally the port in the URI syntax (i.e. http://api.example.com:8080). Overrides component configuration. The OpenApi specification can be loaded from different sources by prefixing with file: classpath: http: https:. Support for https is limited to using the JDK installed UrlHandler, and as such it can be cumbersome to setup TLS/SSL certificates for https (such as setting a number of javax.net.ssl JVM system properties). How to do that consult the JDK documentation for UrlHandler. Default value notice: By default loads openapi.json file";
    public static final String CAMEL_SINK_RESTOPENAPI_PATH_SPECIFICATION_URI_DEFAULT = "openapi.json";
    public static final String CAMEL_SINK_RESTOPENAPI_PATH_OPERATION_ID_CONF = "camel.sink.path.operationId";
    public static final String CAMEL_SINK_RESTOPENAPI_PATH_OPERATION_ID_DOC = "ID of the operation from the OpenApi specification.";
    public static final String CAMEL_SINK_RESTOPENAPI_PATH_OPERATION_ID_DEFAULT = null;
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_BASE_PATH_CONF = "camel.sink.endpoint.basePath";
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_BASE_PATH_DOC = "API basePath, for example /v2. Default is unset, if set overrides the value present in OpenApi specification and in the component configuration.";
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_BASE_PATH_DEFAULT = null;
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_COMPONENT_NAME_CONF = "camel.sink.endpoint.componentName";
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_COMPONENT_NAME_DOC = "Name of the Camel component that will perform the requests. The component must be present in Camel registry and it must implement RestProducerFactory service provider interface. If not set CLASSPATH is searched for single component that implements RestProducerFactory SPI. Overrides component configuration.";
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_COMPONENT_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_CONSUMES_CONF = "camel.sink.endpoint.consumes";
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_CONSUMES_DOC = "What payload type this component capable of consuming. Could be one type, like application/json or multiple types as application/json, application/xml; q=0.5 according to the RFC7231. This equates to the value of Accept HTTP header. If set overrides any value found in the OpenApi specification and. in the component configuration";
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_CONSUMES_DEFAULT = null;
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_HOST_CONF = "camel.sink.endpoint.host";
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_HOST_DOC = "Scheme hostname and port to direct the HTTP requests to in the form of https://hostname:port. Can be configured at the endpoint, component or in the corresponding REST configuration in the Camel Context. If you give this component a name (e.g. petstore) that REST configuration is consulted first, rest-openapi next, and global configuration last. If set overrides any value found in the OpenApi specification, RestConfiguration. Overrides all other configuration.";
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_RESTOPENAPI_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_PRODUCES_CONF = "camel.sink.endpoint.produces";
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_PRODUCES_DOC = "What payload type this component is producing. For example application/json according to the RFC7231. This equates to the value of Content-Type HTTP header. If set overrides any value present in the OpenApi specification. Overrides all other configuration.";
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_PRODUCES_DEFAULT = null;
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_RESTOPENAPI_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_RESTOPENAPI_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_RESTOPENAPI_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_BASE_PATH_CONF = "camel.component.rest-openapi.basePath";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_BASE_PATH_DOC = "API basePath, for example /v2. Default is unset, if set overrides the value present in OpenApi specification.";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_BASE_PATH_DEFAULT = null;
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_COMPONENT_NAME_CONF = "camel.component.rest-openapi.componentName";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_COMPONENT_NAME_DOC = "Name of the Camel component that will perform the requests. The component must be present in Camel registry and it must implement RestProducerFactory service provider interface. If not set CLASSPATH is searched for single component that implements RestProducerFactory SPI. Can be overridden in endpoint configuration.";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_COMPONENT_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_CONSUMES_CONF = "camel.component.rest-openapi.consumes";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_CONSUMES_DOC = "What payload type this component capable of consuming. Could be one type, like application/json or multiple types as application/json, application/xml; q=0.5 according to the RFC7231. This equates to the value of Accept HTTP header. If set overrides any value found in the OpenApi specification. Can be overridden in endpoint configuration";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_CONSUMES_DEFAULT = null;
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_HOST_CONF = "camel.component.rest-openapi.host";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_HOST_DOC = "Scheme hostname and port to direct the HTTP requests to in the form of https://hostname:port. Can be configured at the endpoint, component or in the corresponding REST configuration in the Camel Context. If you give this component a name (e.g. petstore) that REST configuration is consulted first, rest-openapi next, and global configuration last. If set overrides any value found in the OpenApi specification, RestConfiguration. Can be overridden in endpoint configuration.";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.rest-openapi.lazyStartProducer";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_RESTOPENAPI_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_PRODUCES_CONF = "camel.component.rest-openapi.produces";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_PRODUCES_DOC = "What payload type this component is producing. For example application/json according to the RFC7231. This equates to the value of Content-Type HTTP header. If set overrides any value present in the OpenApi specification. Can be overridden in endpoint configuration.";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_PRODUCES_DEFAULT = null;
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_SPECIFICATION_URI_CONF = "camel.component.rest-openapi.specificationUri";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_SPECIFICATION_URI_DOC = "Path to the OpenApi specification file. The scheme, host base path are taken from this specification, but these can be overridden with properties on the component or endpoint level. If not given the component tries to load openapi.json resource. Note that the host defined on the component and endpoint of this Component should contain the scheme, hostname and optionally the port in the URI syntax (i.e. https://api.example.com:8080). Can be overridden in endpoint configuration.";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_SPECIFICATION_URI_DEFAULT = "openapi.json";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.rest-openapi.basicPropertyBinding";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_RESTOPENAPI_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.rest-openapi.sslContextParameters";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC = "Customize TLS parameters used by the component. If not set defaults to the TLS parameters set in the Camel context";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.rest-openapi.useGlobalSslContextParameters";
    public static final String CAMEL_SINK_RESTOPENAPI_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SINK_RESTOPENAPI_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;

    public CamelRestopenapiSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelRestopenapiSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_RESTOPENAPI_PATH_SPECIFICATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_RESTOPENAPI_PATH_SPECIFICATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_PATH_SPECIFICATION_URI_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_PATH_OPERATION_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_RESTOPENAPI_PATH_OPERATION_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_RESTOPENAPI_PATH_OPERATION_ID_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_ENDPOINT_BASE_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_RESTOPENAPI_ENDPOINT_BASE_PATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_ENDPOINT_BASE_PATH_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_ENDPOINT_COMPONENT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_RESTOPENAPI_ENDPOINT_COMPONENT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_ENDPOINT_COMPONENT_NAME_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_ENDPOINT_CONSUMES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_RESTOPENAPI_ENDPOINT_CONSUMES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_ENDPOINT_CONSUMES_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_ENDPOINT_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_RESTOPENAPI_ENDPOINT_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_ENDPOINT_HOST_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_RESTOPENAPI_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_ENDPOINT_PRODUCES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_RESTOPENAPI_ENDPOINT_PRODUCES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_ENDPOINT_PRODUCES_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_RESTOPENAPI_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_RESTOPENAPI_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_COMPONENT_BASE_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_RESTOPENAPI_COMPONENT_BASE_PATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_COMPONENT_BASE_PATH_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_COMPONENT_COMPONENT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_RESTOPENAPI_COMPONENT_COMPONENT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_COMPONENT_COMPONENT_NAME_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_COMPONENT_CONSUMES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_RESTOPENAPI_COMPONENT_CONSUMES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_COMPONENT_CONSUMES_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_COMPONENT_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_RESTOPENAPI_COMPONENT_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_COMPONENT_HOST_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_RESTOPENAPI_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_COMPONENT_PRODUCES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_RESTOPENAPI_COMPONENT_PRODUCES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_COMPONENT_PRODUCES_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_COMPONENT_SPECIFICATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_RESTOPENAPI_COMPONENT_SPECIFICATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_COMPONENT_SPECIFICATION_URI_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_RESTOPENAPI_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_RESTOPENAPI_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_RESTOPENAPI_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_RESTOPENAPI_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_RESTOPENAPI_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        return conf;
    }
}