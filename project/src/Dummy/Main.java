package Dummy;

public class Main {
    public static void main(String[] args) {

    }
}

enum KafkaProducerConstants{
    CHARGE_PRODUCER,
    REFUND_PRODUCER,
    CANCEL_PRODUCER
}

//@Component
//@CreateKafkaProducer(producerConfigs = {
//        @KafkaProducer(beanName = KafkaProducerConfig.CHARGE_PRODUCER, configName = CCMConfig.CHARGE_PRODUCER);
//})
//class KafkaProducerConfig{}

//    @Autowire
//            @Qualifier(KafkaProducerConstant.CHARGE_PRODUCER)
//CreateKafkaProducer createKafkaProducer;