package com.vinsguru.reactive_kafka_playgroud.sec06;

/*
    Ensure that topic has multiple partitions
*/
public class KafkaConsumerGroup {

    private static class Consumer1 {
        public static void main(String[] args) {
            KafkaConsumer.start("1");
            // 0
        }
    }

    private static class Consumer2 {
        public static void main(String[] args) {
            KafkaConsumer.start("2");
            // 2
        }
    }

    private static class Consumer3 {
        public static void main(String[] args) {
            KafkaConsumer.start("3");
            // 1
        }
    }

}
