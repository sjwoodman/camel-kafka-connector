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
package org.apache.camel.kafkaconnector.yammer;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelYammerSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_YAMMER_PATH_FUNCTION_CONF = "camel.source.path.function";
    public static final String CAMEL_SOURCE_YAMMER_PATH_FUNCTION_DOC = "The function to use One of: [MESSAGES] [MY_FEED] [ALGO] [FOLLOWING] [SENT] [PRIVATE] [RECEIVED] [USERS] [CURRENT]";
    public static final String CAMEL_SOURCE_YAMMER_PATH_FUNCTION_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_USE_JSON_CONF = "camel.source.endpoint.useJson";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_USE_JSON_DOC = "Set to true if you want to use raw JSON rather than converting to POJOs.";
    public static final Boolean CAMEL_SOURCE_YAMMER_ENDPOINT_USE_JSON_DEFAULT = false;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_YAMMER_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_DELAY_CONF = "camel.source.endpoint.delay";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_DELAY_DOC = "Delay between polling in millis";
    public static final Long CAMEL_SOURCE_YAMMER_ENDPOINT_DELAY_DEFAULT = 5000L;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_LIMIT_CONF = "camel.source.endpoint.limit";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_LIMIT_DOC = "Return only the specified number of messages. Works for threaded=true and threaded=extended.";
    public static final Integer CAMEL_SOURCE_YAMMER_ENDPOINT_LIMIT_DEFAULT = -1;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_NEWER_THAN_CONF = "camel.source.endpoint.newerThan";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_NEWER_THAN_DOC = "Returns messages newer than the message ID specified as a numeric string. This should be used when polling for new messages. If you're looking at messages, and the most recent message returned is 3516, you can make a request with the parameter newerThan=3516� to ensure that you do not get duplicate copies of messages already on your page.";
    public static final Long CAMEL_SOURCE_YAMMER_ENDPOINT_NEWER_THAN_DEFAULT = -1L;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_OLDER_THAN_CONF = "camel.source.endpoint.olderThan";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_OLDER_THAN_DOC = "Returns messages older than the message ID specified as a numeric string. This is useful for paginating messages. For example, if you're currently viewing 20 messages and the oldest is number 2912, you could append olderThan=2912� to your request to get the 20 messages prior to those you're seeing.";
    public static final Long CAMEL_SOURCE_YAMMER_ENDPOINT_OLDER_THAN_DEFAULT = -1L;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF = "camel.source.endpoint.sendEmptyMessageWhenIdle";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC = "If the polling consumer did not poll any files, you can enable this option to send an empty message (no body) instead.";
    public static final Boolean CAMEL_SOURCE_YAMMER_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT = false;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_THREADED_CONF = "camel.source.endpoint.threaded";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_THREADED_DOC = "threaded=true will only return the first message in each thread. This parameter is intended for apps which display message threads collapsed. threaded=extended will return the thread starter messages in order of most recently active as well as the two most recent messages, as they are viewed in the default view on the Yammer web interface. One of: [true] [extended]";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_THREADED_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_USER_ID_CONF = "camel.source.endpoint.userId";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_USER_ID_DOC = "The user id";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_USER_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_POLL_STRATEGY_CONF = "camel.source.endpoint.pollStrategy";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_POLL_STRATEGY_DOC = "A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing you to provide your custom implementation to control error handling usually occurred during the poll operation before an Exchange have been created and being routed in Camel.";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_POLL_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_YAMMER_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_REQUESTOR_CONF = "camel.source.endpoint.requestor";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_REQUESTOR_DOC = "To use a specific requester to communicate with Yammer.";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_REQUESTOR_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_YAMMER_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF = "camel.source.endpoint.backoffErrorThreshold";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC = "The number of subsequent error polls (failed due some error) that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF = "camel.source.endpoint.backoffIdleThreshold";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC = "The number of subsequent idle polls that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_MULTIPLIER_CONF = "camel.source.endpoint.backoffMultiplier";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_MULTIPLIER_DOC = "To let the scheduled polling consumer backoff if there has been a number of subsequent idles/errors in a row. The multiplier is then the number of polls that will be skipped before the next actual attempt is happening again. When this option is in use then backoffIdleThreshold and/or backoffErrorThreshold must also be configured.";
    public static final Integer CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_GREEDY_CONF = "camel.source.endpoint.greedy";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_GREEDY_DOC = "If greedy is enabled, then the ScheduledPollConsumer will run immediately again, if the previous run polled 1 or more messages.";
    public static final Boolean CAMEL_SOURCE_YAMMER_ENDPOINT_GREEDY_DEFAULT = false;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_INITIAL_DELAY_CONF = "camel.source.endpoint.initialDelay";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_INITIAL_DELAY_DOC = "Milliseconds before the first poll starts. You can also specify time values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30 seconds), and 1h (1 hour).";
    public static final Long CAMEL_SOURCE_YAMMER_ENDPOINT_INITIAL_DELAY_DEFAULT = 1000L;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_REPEAT_COUNT_CONF = "camel.source.endpoint.repeatCount";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_REPEAT_COUNT_DOC = "Specifies a maximum limit of number of fires. So if you set it to 1, the scheduler will only fire once. If you set it to 5, it will only fire five times. A value of zero or negative means fire forever.";
    public static final Long CAMEL_SOURCE_YAMMER_ENDPOINT_REPEAT_COUNT_DEFAULT = 0L;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_RUN_LOGGING_LEVEL_CONF = "camel.source.endpoint.runLoggingLevel";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_RUN_LOGGING_LEVEL_DOC = "The consumer logs a start/complete log line when it polls. This option allows you to configure the logging level for that. One of: [TRACE] [DEBUG] [INFO] [WARN] [ERROR] [OFF]";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT = "TRACE";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF = "camel.source.endpoint.scheduledExecutorService";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC = "Allows for configuring a custom/shared thread pool to use for the consumer. By default each consumer has its own single threaded thread pool.";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULER_CONF = "camel.source.endpoint.scheduler";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULER_DOC = "To use a cron scheduler from either camel-spring or camel-quartz component One of: [none] [spring] [quartz]";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULER_DEFAULT = "none";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULER_PROPERTIES_CONF = "camel.source.endpoint.schedulerProperties";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULER_PROPERTIES_DOC = "To configure additional properties when using a custom scheduler or any of the Quartz, Spring based scheduler.";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_START_SCHEDULER_CONF = "camel.source.endpoint.startScheduler";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_START_SCHEDULER_DOC = "Whether the scheduler should be auto started.";
    public static final Boolean CAMEL_SOURCE_YAMMER_ENDPOINT_START_SCHEDULER_DEFAULT = true;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_TIME_UNIT_CONF = "camel.source.endpoint.timeUnit";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_TIME_UNIT_DOC = "Time unit for initialDelay and delay options. One of: [NANOSECONDS] [MICROSECONDS] [MILLISECONDS] [SECONDS] [MINUTES] [HOURS] [DAYS]";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_TIME_UNIT_DEFAULT = "MILLISECONDS";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_USE_FIXED_DELAY_CONF = "camel.source.endpoint.useFixedDelay";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_USE_FIXED_DELAY_DOC = "Controls if fixed delay or fixed rate is used. See ScheduledExecutorService in JDK for details.";
    public static final Boolean CAMEL_SOURCE_YAMMER_ENDPOINT_USE_FIXED_DELAY_DEFAULT = true;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_ACCESS_TOKEN_CONF = "camel.source.endpoint.accessToken";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_ACCESS_TOKEN_DOC = "The access token";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_CONSUMER_KEY_CONF = "camel.source.endpoint.consumerKey";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_CONSUMER_KEY_DOC = "The consumer key";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_CONSUMER_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_CONSUMER_SECRET_CONF = "camel.source.endpoint.consumerSecret";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_CONSUMER_SECRET_DOC = "The consumer secret";
    public static final String CAMEL_SOURCE_YAMMER_ENDPOINT_CONSUMER_SECRET_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.yammer.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_YAMMER_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.yammer.basicPropertyBinding";
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_YAMMER_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_CONFIG_CONF = "camel.component.yammer.config";
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_CONFIG_DOC = "To use a shared yammer configuration";
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_CONFIG_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_REQUESTOR_CONF = "camel.component.yammer.requestor";
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_REQUESTOR_DOC = "To use a specific requester to communicate with Yammer.";
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_REQUESTOR_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_ACCESS_TOKEN_CONF = "camel.component.yammer.accessToken";
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_ACCESS_TOKEN_DOC = "The access token";
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_CONSUMER_KEY_CONF = "camel.component.yammer.consumerKey";
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_CONSUMER_KEY_DOC = "The consumer key";
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_CONSUMER_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_CONSUMER_SECRET_CONF = "camel.component.yammer.consumerSecret";
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_CONSUMER_SECRET_DOC = "The consumer secret";
    public static final String CAMEL_SOURCE_YAMMER_COMPONENT_CONSUMER_SECRET_DEFAULT = null;

    public CamelYammerSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelYammerSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_YAMMER_PATH_FUNCTION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_PATH_FUNCTION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_YAMMER_PATH_FUNCTION_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_USE_JSON_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_YAMMER_ENDPOINT_USE_JSON_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_USE_JSON_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_YAMMER_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_YAMMER_ENDPOINT_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_DELAY_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_LIMIT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_YAMMER_ENDPOINT_LIMIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_LIMIT_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_NEWER_THAN_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_YAMMER_ENDPOINT_NEWER_THAN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_NEWER_THAN_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_OLDER_THAN_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_YAMMER_ENDPOINT_OLDER_THAN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_OLDER_THAN_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_YAMMER_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_THREADED_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_ENDPOINT_THREADED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_THREADED_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_USER_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_ENDPOINT_USER_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_USER_ID_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_POLL_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_ENDPOINT_POLL_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_POLL_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_YAMMER_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_REQUESTOR_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_ENDPOINT_REQUESTOR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_REQUESTOR_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_YAMMER_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_MULTIPLIER_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_BACKOFF_MULTIPLIER_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_GREEDY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_YAMMER_ENDPOINT_GREEDY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_GREEDY_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_INITIAL_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_YAMMER_ENDPOINT_INITIAL_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_INITIAL_DELAY_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_REPEAT_COUNT_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_YAMMER_ENDPOINT_REPEAT_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_REPEAT_COUNT_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_RUN_LOGGING_LEVEL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_RUN_LOGGING_LEVEL_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULER_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_SCHEDULER_PROPERTIES_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_START_SCHEDULER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_YAMMER_ENDPOINT_START_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_START_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_TIME_UNIT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_ENDPOINT_TIME_UNIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_TIME_UNIT_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_USE_FIXED_DELAY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_YAMMER_ENDPOINT_USE_FIXED_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_ENDPOINT_USE_FIXED_DELAY_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_ACCESS_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_ENDPOINT_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_YAMMER_ENDPOINT_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_CONSUMER_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_ENDPOINT_CONSUMER_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_YAMMER_ENDPOINT_CONSUMER_KEY_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_ENDPOINT_CONSUMER_SECRET_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_ENDPOINT_CONSUMER_SECRET_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_YAMMER_ENDPOINT_CONSUMER_SECRET_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_YAMMER_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_YAMMER_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_COMPONENT_CONFIG_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_COMPONENT_CONFIG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_COMPONENT_CONFIG_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_COMPONENT_REQUESTOR_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_COMPONENT_REQUESTOR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_COMPONENT_REQUESTOR_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_COMPONENT_ACCESS_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_COMPONENT_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_COMPONENT_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_COMPONENT_CONSUMER_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_COMPONENT_CONSUMER_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_COMPONENT_CONSUMER_KEY_DOC);
        conf.define(CAMEL_SOURCE_YAMMER_COMPONENT_CONSUMER_SECRET_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_YAMMER_COMPONENT_CONSUMER_SECRET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_YAMMER_COMPONENT_CONSUMER_SECRET_DOC);
        return conf;
    }
}