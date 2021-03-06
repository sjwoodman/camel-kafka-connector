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
package org.apache.camel.kafkaconnector.sjmsbatch;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSjmsbatchSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_SJMSBATCH_PATH_DESTINATION_NAME_CONF = "camel.source.path.destinationName";
    public static final String CAMEL_SOURCE_SJMSBATCH_PATH_DESTINATION_NAME_DOC = "The destination name. Only queues are supported, names may be prefixed by 'queue:'.";
    public static final String CAMEL_SOURCE_SJMSBATCH_PATH_DESTINATION_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_AGGREGATION_STRATEGY_CONF = "camel.source.endpoint.aggregationStrategy";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_AGGREGATION_STRATEGY_DOC = "The aggregation strategy to use, which merges all the batched messages into a single message";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_AGGREGATION_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_ALLOW_NULL_BODY_CONF = "camel.source.endpoint.allowNullBody";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_ALLOW_NULL_BODY_DOC = "Whether to allow sending messages with no body. If this option is false and the message body is null, then an JMSException is thrown.";
    public static final Boolean CAMEL_SOURCE_SJMSBATCH_ENDPOINT_ALLOW_NULL_BODY_DEFAULT = true;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_SJMSBATCH_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_INTERVAL_CONF = "camel.source.endpoint.completionInterval";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_INTERVAL_DOC = "The completion interval in millis, which causes batches to be completed in a scheduled fixed rate every interval. The batch may be empty if the timeout triggered and there was no messages in the batch. Notice you cannot use both completion timeout and completion interval at the same time, only one can be configured.";
    public static final Integer CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_INTERVAL_DEFAULT = 1000;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_PREDICATE_CONF = "camel.source.endpoint.completionPredicate";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_PREDICATE_DOC = "The completion predicate, which causes batches to be completed when the predicate evaluates as true. The predicate can also be configured using the simple language using the string syntax. You may want to set the option eagerCheckCompletion to true to let the predicate match the incoming message, as otherwise it matches the aggregated message.";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_PREDICATE_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_SIZE_CONF = "camel.source.endpoint.completionSize";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_SIZE_DOC = "The number of messages consumed at which the batch will be completed";
    public static final Integer CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_SIZE_DEFAULT = 200;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_TIMEOUT_CONF = "camel.source.endpoint.completionTimeout";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_TIMEOUT_DOC = "The timeout in millis from receipt of the first first message when the batch will be completed. The batch may be empty if the timeout triggered and there was no messages in the batch. Notice you cannot use both completion timeout and completion interval at the same time, only one can be configured.";
    public static final Integer CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_TIMEOUT_DEFAULT = 500;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_CONSUMER_COUNT_CONF = "camel.source.endpoint.consumerCount";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_CONSUMER_COUNT_DOC = "The number of JMS sessions to consume from";
    public static final Integer CAMEL_SOURCE_SJMSBATCH_ENDPOINT_CONSUMER_COUNT_DEFAULT = 1;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EAGER_CHECK_COMPLETION_CONF = "camel.source.endpoint.eagerCheckCompletion";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EAGER_CHECK_COMPLETION_DOC = "Use eager completion checking which means that the completionPredicate will use the incoming Exchange. As opposed to without eager completion checking the completionPredicate will use the aggregated Exchange.";
    public static final Boolean CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EAGER_CHECK_COMPLETION_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_CONF = "camel.source.endpoint.includeAllJMSXProperties";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_DOC = "Whether to include all JMSXxxx properties when mapping from JMS to Camel Message. Setting this to true will include properties such as JMSXAppID, and JMSXUserID etc. Note: If you are using a custom headerFilterStrategy then this option does not apply.";
    public static final Boolean CAMEL_SOURCE_SJMSBATCH_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_MAP_JMS_MESSAGE_CONF = "camel.source.endpoint.mapJmsMessage";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_MAP_JMS_MESSAGE_DOC = "Specifies whether Camel should auto map the received JMS message to a suited payload type, such as javax.jms.TextMessage to a String etc. See section about how mapping works below for more details.";
    public static final Boolean CAMEL_SOURCE_SJMSBATCH_ENDPOINT_MAP_JMS_MESSAGE_DEFAULT = true;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_POLL_DURATION_CONF = "camel.source.endpoint.pollDuration";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_POLL_DURATION_DOC = "The duration in milliseconds of each poll for messages. completionTimeOut will be used if it is shorter and a batch has started.";
    public static final Integer CAMEL_SOURCE_SJMSBATCH_ENDPOINT_POLL_DURATION_DEFAULT = 1000;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF = "camel.source.endpoint.sendEmptyMessageWhenIdle";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC = "If using completion timeout or interval, then the batch may be empty if the timeout triggered and there was no messages in the batch. If this option is true and the batch is empty then an empty message is added to the batch so an empty message is routed.";
    public static final Boolean CAMEL_SOURCE_SJMSBATCH_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_ASYNC_START_LISTENER_CONF = "camel.source.endpoint.asyncStartListener";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_ASYNC_START_LISTENER_DOC = "Whether to startup the consumer message listener asynchronously, when starting a route. For example if a JmsConsumer cannot get a connection to a remote JMS broker, then it may block while retrying and/or failover. This will cause Camel to block while starting routes. By setting this option to true, you will let routes startup, while the JmsConsumer connects to the JMS broker using a dedicated thread in asynchronous mode. If this option is used, then beware that if the connection could not be established, then an exception is logged at WARN level, and the consumer will not be able to receive messages; You can then restart the route to retry.";
    public static final Boolean CAMEL_SOURCE_SJMSBATCH_ENDPOINT_ASYNC_START_LISTENER_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_SJMSBATCH_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_HEADER_FILTER_STRATEGY_CONF = "camel.source.endpoint.headerFilterStrategy";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_HEADER_FILTER_STRATEGY_DOC = "To use a custom HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_CONF = "camel.source.endpoint.jmsKeyFormatStrategy";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_DOC = "Pluggable strategy for encoding and decoding JMS keys so they can be compliant with the JMS specification. Camel provides two implementations out of the box: default and passthrough. The default strategy will safely marshal dots and hyphens (. and -). The passthrough strategy leaves the key as is. Can be used for JMS brokers which do not care whether JMS header keys contain illegal characters. You can provide your own implementation of the org.apache.camel.component.jms.JmsKeyFormatStrategy and refer to it using the # notation.";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_KEEP_ALIVE_DELAY_CONF = "camel.source.endpoint.keepAliveDelay";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_KEEP_ALIVE_DELAY_DOC = "The delay in millis between attempts to re-establish a valid session. If this is a positive value the SjmsBatchConsumer will attempt to create a new session if it sees an IllegalStateException during message consumption. This delay value allows you to pause between attempts to prevent spamming the logs. If this is a negative value (default is -1) then the SjmsBatchConsumer will behave as it always has before - that is it will bail out and the route will shut down if it sees an IllegalStateException.";
    public static final Integer CAMEL_SOURCE_SJMSBATCH_ENDPOINT_KEEP_ALIVE_DELAY_DEFAULT = -1;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_MESSAGE_CREATED_STRATEGY_CONF = "camel.source.endpoint.messageCreatedStrategy";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_MESSAGE_CREATED_STRATEGY_DOC = "To use the given MessageCreatedStrategy which are invoked when Camel creates new instances of javax.jms.Message objects when Camel is sending a JMS message.";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_MESSAGE_CREATED_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_RECOVERY_INTERVAL_CONF = "camel.source.endpoint.recoveryInterval";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_RECOVERY_INTERVAL_DOC = "Specifies the interval between recovery attempts, i.e. when a connection is being refreshed, in milliseconds. The default is 5000 ms, that is, 5 seconds.";
    public static final Integer CAMEL_SOURCE_SJMSBATCH_ENDPOINT_RECOVERY_INTERVAL_DEFAULT = 5000;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_SJMSBATCH_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_TIMEOUT_CHECKER_EXECUTOR_SERVICE_CONF = "camel.source.endpoint.timeoutCheckerExecutorService";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_TIMEOUT_CHECKER_EXECUTOR_SERVICE_DOC = "If using the completionInterval option a background thread is created to trigger the completion interval. Set this option to provide a custom thread pool to be used rather than creating a new thread for every consumer.";
    public static final String CAMEL_SOURCE_SJMSBATCH_ENDPOINT_TIMEOUT_CHECKER_EXECUTOR_SERVICE_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMSBATCH_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.sjms-batch.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_SJMSBATCH_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_SJMSBATCH_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMSBATCH_COMPONENT_ASYNC_START_LISTENER_CONF = "camel.component.sjms-batch.asyncStartListener";
    public static final String CAMEL_SOURCE_SJMSBATCH_COMPONENT_ASYNC_START_LISTENER_DOC = "Whether to startup the consumer message listener asynchronously, when starting a route. For example if a JmsConsumer cannot get a connection to a remote JMS broker, then it may block while retrying and/or failover. This will cause Camel to block while starting routes. By setting this option to true, you will let routes startup, while the JmsConsumer connects to the JMS broker using a dedicated thread in asynchronous mode. If this option is used, then beware that if the connection could not be established, then an exception is logged at WARN level, and the consumer will not be able to receive messages; You can then restart the route to retry.";
    public static final Boolean CAMEL_SOURCE_SJMSBATCH_COMPONENT_ASYNC_START_LISTENER_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMSBATCH_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.sjms-batch.basicPropertyBinding";
    public static final String CAMEL_SOURCE_SJMSBATCH_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_SJMSBATCH_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_SJMSBATCH_COMPONENT_CONNECTION_FACTORY_CONF = "camel.component.sjms-batch.connectionFactory";
    public static final String CAMEL_SOURCE_SJMSBATCH_COMPONENT_CONNECTION_FACTORY_DOC = "A ConnectionFactory is required to enable the SjmsBatchComponent.";
    public static final String CAMEL_SOURCE_SJMSBATCH_COMPONENT_CONNECTION_FACTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SJMSBATCH_COMPONENT_RECOVERY_INTERVAL_CONF = "camel.component.sjms-batch.recoveryInterval";
    public static final String CAMEL_SOURCE_SJMSBATCH_COMPONENT_RECOVERY_INTERVAL_DOC = "Specifies the interval between recovery attempts, i.e. when a connection is being refreshed, in milliseconds. The default is 5000 ms, that is, 5 seconds.";
    public static final Integer CAMEL_SOURCE_SJMSBATCH_COMPONENT_RECOVERY_INTERVAL_DEFAULT = 5000;
    public static final String CAMEL_SOURCE_SJMSBATCH_COMPONENT_HEADER_FILTER_STRATEGY_CONF = "camel.component.sjms-batch.headerFilterStrategy";
    public static final String CAMEL_SOURCE_SJMSBATCH_COMPONENT_HEADER_FILTER_STRATEGY_DOC = "To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SOURCE_SJMSBATCH_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT = null;

    public CamelSjmsbatchSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSjmsbatchSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_SJMSBATCH_PATH_DESTINATION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMSBATCH_PATH_DESTINATION_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SJMSBATCH_PATH_DESTINATION_NAME_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_AGGREGATION_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_AGGREGATION_STRATEGY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_AGGREGATION_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_ALLOW_NULL_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_ALLOW_NULL_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_ALLOW_NULL_BODY_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_INTERVAL_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_INTERVAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_INTERVAL_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_PREDICATE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_PREDICATE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_PREDICATE_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_SIZE_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_COMPLETION_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_CONSUMER_COUNT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_CONSUMER_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_CONSUMER_COUNT_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EAGER_CHECK_COMPLETION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EAGER_CHECK_COMPLETION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EAGER_CHECK_COMPLETION_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_MAP_JMS_MESSAGE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_MAP_JMS_MESSAGE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_MAP_JMS_MESSAGE_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_POLL_DURATION_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_POLL_DURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_POLL_DURATION_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_ASYNC_START_LISTENER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_ASYNC_START_LISTENER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_ASYNC_START_LISTENER_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_KEEP_ALIVE_DELAY_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_KEEP_ALIVE_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_KEEP_ALIVE_DELAY_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_MESSAGE_CREATED_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_MESSAGE_CREATED_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_MESSAGE_CREATED_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_RECOVERY_INTERVAL_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_RECOVERY_INTERVAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_RECOVERY_INTERVAL_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_ENDPOINT_TIMEOUT_CHECKER_EXECUTOR_SERVICE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_TIMEOUT_CHECKER_EXECUTOR_SERVICE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_ENDPOINT_TIMEOUT_CHECKER_EXECUTOR_SERVICE_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMSBATCH_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_COMPONENT_ASYNC_START_LISTENER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMSBATCH_COMPONENT_ASYNC_START_LISTENER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_COMPONENT_ASYNC_START_LISTENER_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SJMSBATCH_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_COMPONENT_CONNECTION_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMSBATCH_COMPONENT_CONNECTION_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_COMPONENT_CONNECTION_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_COMPONENT_RECOVERY_INTERVAL_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SJMSBATCH_COMPONENT_RECOVERY_INTERVAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_COMPONENT_RECOVERY_INTERVAL_DOC);
        conf.define(CAMEL_SOURCE_SJMSBATCH_COMPONENT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SJMSBATCH_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SJMSBATCH_COMPONENT_HEADER_FILTER_STRATEGY_DOC);
        return conf;
    }
}