# KafkaSpringBootZooKeeper
Simple message pass between two spring boot applications using kafka

File changes in kafka_2.12-3.7.1\config folder
Server.properties
advertised.listeners=PLAINTEXT://localhost:9092
log.dirs=H:\Murali\TECH\kafka_2.12-3.7.1\kafka-logs

Zookeepter.properties
dataDir=H:\Murali\TECH\kafka_2.12-3.7.1

command to start zookeeper:
$ ./bin/windows/zookeeper-server-start ./config/zookeeper.properties

command to start server:
$ ./bin/windows/kafka-server-start ./config/server.properties


