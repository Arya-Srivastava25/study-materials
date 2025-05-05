package NotificationDesign;

import java.util.Arrays;
import java.util.List;

class NofiticationService {

        public void notify(final String customerID) {
            List<NotificationType> noticationPreferences = Arrays.asList(NotificationType.SMS, NotificationType.EMAIL);

//            NotificationServiceFactoryModified notificationServiceFactoryModified = new NotificationServiceFactoryModified();

            for(NotificationType notificationType : noticationPreferences) {
                NotificationServiceFactory.getNotificationhandler(notificationType).send();
            }
        }

    }
