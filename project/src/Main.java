//import java.util.*;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

    }

//    public enum KafkaProducerConstant{
//        KAFKA_CHARGE_PRODUCER,
//        KAFKA_REFUND_PRODUCER,
//        KAFKA_CANCELLATION_PRODUCER;
//    }
//
//
//    @Component
//    @CreateKafkaProducer(producerConfig = {
//            @KafkaProducer(beanName = KafkaProducerConstant.KAFKA_CHARGE_PRODUCER, configName = KafkaConfigProperty.CHARGE)
//    })
//    public class KafkaProducerConfig{
//
//    }
//
//    @Autowired
//    @Qualifier(KafkaProducerConstant.KAFKA_CHARGE_PRODUCER)
//    KafkaProducerConfig kafkaProducerConfig;
//
//    ApplicationContext applicationContext = new AnnotaionConfigApplicationContext("");
//
//
//    @Query(value = "SELECT * FROM ORDERS O WHERE O.userId = :userId ", nativeQuery = true)
//    public Order fetchOrderByParameter(@Param("userId") String userId);
//


//    class NofiticationService {
//
//        public void notify(final String customerID) {
//            List<NotificationType> noticationPreferences = Arrays.asList(NotificationType.SMS, NotificationType.EMAIL);
//
//            for(NotificationType notificationType : noticationPreferences) {
//                NotificationServiceFactoryModified.getNotificationhandler(notificationType).send();
//            }
//        }
//
//    }
//    // class way
////    class NotificationServiceFactory {
////
////        public static Notificationhandler getNotificationhandler(final NotificationType notificationType) {
////            Notificationhandler notificationhandler;
////            switch(notificationType) {
////                case SMS:
////                    notificationhandler = new SMSNotificationhandler();
////                    break;
////                case EMAIL:
////                    notificationhandler = new EmailNotificationhandler();
////                    break;
////                default:
////                    notificationhandler = null;
////            }
////
////            return notificationhandler;
////        }
//
//    }
//    // modern way
//    class NotificationServiceFactoryModified {
//        private static final Map<NotificationType,Notificationhandler> HANLDER_MAP = new HashMap<>();
//
//        static {
//            HANLDER_MAP.put(NotificationType.SMS, new SMSNotificationhandler());
//            HANLDER_MAP.put(NotificationType.EMAIL, new EmailNotificationhandler());
//        }
//
//        public static Notificationhandler getNotificationhandler(final NotificationType notificationType) {
//            return HANLDER_MAP.get(notificationType);
//        }
//    }
//    public static void main(String[] args) {
//
//
//        List<List<String>> abc = Arrays.asList(Arrays.asList("Arya","Vignesh","Ariv","Arniya"), Arrays.asList("Sadhana","Ayushika","Madhu","Rakesh"),Arrays.asList("Vijay","Muralidharan","Mahalaxmi"));
//        abc.stream().flatMap(List::stream).sorted().filter(s -> s.startsWith("A") || s.endsWith("h")).forEach(System.out::println);
//
//        int n = 9835184;
////        String str = Integer.toString(n);
////        int sum1 = 0, sum2 = 0;
////
////        for(int i = 0 ; i < str.length(); i++){
////            if(Character.getNumericValue(str.charAt(i)) % 2 == 0)
////                sum1+= Character.getNumericValue(str.charAt(i));
////            else
////                sum2+= Character.getNumericValue(str.charAt(i));
////        }
////
////        System.out.println("Even : " + sum1 + " Odd: " + sum2);
//
//
//
//
//
//
//
//        System.out.println(Thread.currentThread().getName() + "=====================================");
//
//        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
//
//        final Runnable r1 = () -> System.out.println("Cutie Patootie Arya1 " + Thread.currentThread().getName());
//        final Runnable r2 = () -> System.out.println("Cutie Patootie Arya2 " + Thread.currentThread().getName());
//        final Runnable r3 = () -> System.out.println("Cutie Patootie Arya3 " + Thread.currentThread().getName());
//        final Runnable r4 = () -> System.out.println("Cutie Patootie Arya4 " + Thread.currentThread().getName());
//        newFixedThreadPool.execute(r1);
//        newFixedThreadPool.execute(r2);
//        newFixedThreadPool.execute(r3);
//        newFixedThreadPool.execute(r4);
//
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//        System.out.println(Thread.currentThread().getName() + "=====================================");
//
//
//
//
//
//
//
//
//
//
////        String str = "hi how is your family \n"
////                + "where is your family now \n"
////                + "how was your interview experience";
////
////        HashMap<String, List<Integer>> count = new HashMap<>();
////        String[] s = str.split(" \n");
////
////        for(int i = 0 ; i < s.length; i++){
////            String[] st = s[i].split(" ");
////            for(int j = 0 ;  j < st.length; j++) {
////                List<Integer> list = count.get(st[j]);
////                if (list == null) {
////                    list = new ArrayList<Integer>();
////                    count.put(st[j], list);
////                }
////                list.add(i + 1);
////            }
////        }
////
////        for(String key: count.keySet()){
////            System.out.println("Word:  "+key +"        line : " + count.get(key) + "                    count : "+ count.get(key).size());
////        }
////        output format : word : count : line numbers
////        family : 2 : 1,2
////        how : 2 : 1,3
//
//    }
//
//
//    public class Student{
//        int studentId;
//        String name;
//        int roll;
//        public Student(int studentId, String name, int roll){
//            this.studentId = studentId;
//            this.name = name;
//            this.roll = roll;
//        }
//
//        public Student(int studentId){
//            this.studentId = studentId;
//        }
//
//        public Student(int studentId,String name){
//            this.studentId = studentId;
//            this.name = name;
//        }
//
//        public Student(Student student){
//            this.studentId = student.studentId;
//            this.name = student.name;
//            this.roll = student.roll;
//        }
//
//        public boolean isRoll(int roll){
//            return true;
//        }
//
//        public Student(){}
//    }
//
//    public class OneA extends Student{
//        @Override
//        public boolean isRoll(int roll){
//            return (roll%2 == 0);
//        }
//
//        public String method(){
//            try{
//                return "Inside try";
//            }
//            catch (Exception exception){
//                return "Inside catch";
//            }
//            finally {
//                return "Inside finally";
//            }
//        }
//    }
//
//    class Jug{
//        private int quantity = 100;
//        private Jug(){
//
//        }
//        private Jug jug = null;
//
//        public int getQuantity(int quantity){
//            return quantity;
//        }
//
//        // we need to make below method static but removing for now because it's giving error
//        public  Jug createInstance(){
//            if(jug == null)
//                jug = new Jug();
//
//            return jug;
//        }
//    }
//
//    public class myClass implements Runnable{
//        public void run(){
//
//        }
//
//        public void create(){
//            Thread thread = new Thread(new myClass());
//            thread.start();
//        }
//    }
//
//// How spring boot application starts
//
////    @SpringBootApplication
//    public class MyClass{
//
//
//        public static void main(String[] args){
////            SpringApplication.run(myClass.class);
//        }
//    }
//
//    // IoC
//
//    interface EmailService {
//        default void send() {
//            System.out.println("Email sent hogaya");
//        }
//    }
//
//
//    class Gmail implements EmailService {
//
//    }
//
//
//    class Outlook implements EmailService {
//
//    }
//
//
//    class EmailNotificationService {
//
//        private EmailService emailService;
//
//        public EmailNotificationService (EmailService emailService) {
//            this.emailService = emailService;
//        }
//
//        public void send() {
//            emailService.send();
//        }
//
//        public void practice(){
//        List<String> list = Arrays.asList("Arya","Vignesh","Sadhana","Ayushika","Abc");
//        long count = list.stream().count();
//        list.stream().filter(s -> s.equals("Arya") || s.equals("Vignesh")).forEach(System.out::println);
//        System.out.println(count);
//        list.stream().filter(s -> s.startsWith("A")).sorted().forEach(System.out::println);
//
//
//        List<Integer> arr = Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,1,9);
//        arr.stream().distinct().filter(s -> s.equals(1)).forEach(System.out::println);
//
//        Singleton x = Singleton.getInstance();
//        System.out.println(x.quantity);
//
//
//
//        Map<String,String> map = new HashMap<>();
//        map.put("1","Abc");
//        map.put("2","Xyz");
//
//        Employee employee = new Employee(1,"QWERTY",map);
//        System.out.println(employee.getId());
//            System.out.println(employee.getName());
//            System.out.println(employee.getMetadata());
//
//            employee.getMetadata().put("3","asd");
//            System.out.println(employee.getMetadata());
//
//        }
//        }
//
//        class Singleton{
//            private int quantity;
//            private Singleton(){
//                quantity = 100;
//            }
//
//            private static Singleton singleton = null;
//
//            public static Singleton getInstance(){
//                if(singleton == null)
//                    singleton =new Singleton();
//                return singleton;
//            }
//        }
//
//        final class Employee{
//        private final int id;
//        private final String name;
//
//        private final Map<String,String> metadata;
//
//        public Employee(int id,String name,Map<String,String> metadata){
//            this.id = id;
//            this.name = name;
//            Map<String,String> temp = new HashMap<>();
//            for(Map.Entry<String,String> entry:metadata.entrySet())
//                temp.put(entry.getKey(),entry.getValue());
//            this.metadata = temp;
//        }
//
//        public int getId(){
//            return id;
//        }
//        public String getName(){
//            return name;
//        }
//
//        public Map<String,String> getMetadata(){
//            Map<String,String> temp = new HashMap<>();
//            for(Map.Entry<String,String> entry:metadata.entrySet())
//                temp.put(entry.getKey(),entry.getValue());
//
//            return temp;
//        }
//        }
//
//
//        enum NotificationType{
//            SMS, EMAIL, WHATSAPP;
//        }
//
//        abstract class Notification{
//            private int id;
//            private NotificationType notificationType;
//        }
//
//        class SMSNotification extends Notification{
//           String phoneNumber;
//
//           String content;
//
//        }
//
//        class EmailNotification extends Notification{
//            String from;
//            String to;
//            String content;
//        }
//
//        class WhatsappNotification extends Notification{
//
//        String phoneNumber;
//        String content;
//        }
//
//        interface NotificationHandler{
//            public void send();
//        }
//
//        class EmailNotificationHandler implements NotificationHandler{
//            @Override
//            public void send(){}
//        }
//    class SMSNotificationHandler implements NotificationHandler{
//        @Override
//        public void send(){}
//    }
//    class WhatsAppNotificationHandler implements NotificationHandler{
//        @Override
//        public void send(){}
//    }
//
//    class NotificationService{
//        public void notify(String customerid){
//            List<NotificationType> preferences = Arrays.asList(NotificationType.SMS,NotificationType.EMAIL,NotificationType.WHATSAPP);
//            for(NotificationType preference : preferences)
//                NotificationServiceFactory1.
//
//        }
//
//    }
//
//    class NotificationServiceFactory1{
//             private static Map<NotificationType,NotificationHandler> notificationHandlerMap = new HashMap<>();
//            static{
//                notificationHandlerMap.put(NotificationType.SMS, new SMSNotificationHandler());
//                notificationHandlerMap.put(NotificationType.EMAIL, new EmailNotificationHandler());
//            }
//
//        public NotificationHandler getType(NotificationType notificationType) {
//
//            return notificationHandlerMap.get(notificationType);
//        }
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//
//

//public class Main {
//    public static void main(String[] args) {
//        MultiThreadingClass multiThreading = new MultiThreadingClass();
//        multiThreading.start();
//
//
//    }
//
//}
//
//class MultiThreadingClass extends Thread{
//    @Override
//    public void run(){
//        try {
//            System.out.println(Thread.currentThread().getId());
//        }
//        catch (Exception ex){
//            System.out.println("Exception");
//        }
//    }
}























