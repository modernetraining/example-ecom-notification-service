package com.example.ecom.notification;

import com.example.ecom.common.event.OrderCreatedEvent;
import com.example.ecom.notification.listener.NotificationListener;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NotificationServiceIntegrationTest {

    @Autowired
    private NotificationListener notificationListener;

    @Test
    public void testHandleOrderCreated() {
        OrderCreatedEvent event = new OrderCreatedEvent();
        event.setOrderId("order-123");
        notificationListener.handleOrderCreated(event);
        // Verify no exception is thrown
    }
}
