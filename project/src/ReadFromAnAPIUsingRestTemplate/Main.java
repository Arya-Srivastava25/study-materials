package ReadFromAnAPIUsingRestTemplate;

public class Main {
    public static void main(String[] args) {
//        int length = findLength();

    }
}
//    public static int findLength(){
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "https://coderbyte.com/api/challenges/json/all-posts";
//
//        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url,String.class);
//
//        JSONObject responseObject = new JSONObject(responseEntity.getBody());
//        JSONArray posts = responseObject.getJSONArray("posts");
//
//        return posts.size();
//    }
//
//    public enum KafkaConstants{
//        CHARGE_REQUEST,
//        REFUND_REQUEST;
//    }
//
//
//
//    @Component
//    @CreateKafkaProducer(producerConfig = {
//            @KafkaProducer(beanName = KafkaConstants.CHARGE_REQUEST, configName = KafkaConfig.ChargeRequest)
//            @KafkaProducer(beanName = KafkaConstants.REFUND_REQUEST, configName = KafkaConfig.RefundRequest)
//    })
//    public void KafkaProducerRequest(){
//
//    }
//
//
//    @Autowire
//            @Qualifier(KafkaConstants.CHARGE_REQUEST)
//    KafkaProducerRequest kafkaProducerRequest;
//}
//
//
//CREATE PROCEDURE proc @UserId VARCHAR(50)
//        AS
//                BEGIN
//SELECT * FROM USERS WHERE USERID = @UserId
//END;
//
//
//EXEC proc @UserId = "123";
//
