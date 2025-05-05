package NotificationDesign;

class NotificationServiceFactory {

        public static Notificationhandler getNotificationhandler(final NotificationType notificationType) {
            Notificationhandler notificationhandler;
            switch(notificationType) {
                case SMS:
                    notificationhandler = new SMSNotificationhandler();
                    break;
                case EMAIL:
                    notificationhandler = new EmailNotificationhandler();
                    break;
                default:
                    notificationhandler = null;
            }

            return notificationhandler;
        }

    }