package NotificationDesign;

import java.util.HashMap;
import java.util.Map;

//    // modern way
    class NotificationServiceFactoryModified {
        private static final Map<NotificationType,Notificationhandler> HANLDER_MAP = new HashMap<>();

        static {
            HANLDER_MAP.put(NotificationType.SMS, new SMSNotificationhandler());
            HANLDER_MAP.put(NotificationType.EMAIL, new EmailNotificationhandler());
        }

        public static Notificationhandler getNotificationhandler(final NotificationType notificationType) {
            return HANLDER_MAP.get(notificationType);
        }
        public void send(){}
    }
