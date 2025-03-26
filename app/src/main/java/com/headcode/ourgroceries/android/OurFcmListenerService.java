package com.headcode.ourgroceries.android;

import com.google.firebase.messaging.FirebaseMessagingService;
import q5.AbstractC6635a;

/* loaded from: classes2.dex */
public class OurFcmListenerService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void r(com.google.firebase.messaging.S s8) {
        String B02 = s8.B0();
        if (B02 == null) {
            AbstractC6635a.f("OG-FCM", "Got null from when receiving push");
            return;
        }
        if (B02.startsWith("/topics/")) {
            AbstractC6635a.f("OG-FCM", "Got unexpected topics push");
            return;
        }
        String A02 = s8.A0();
        if ("refresh".equals(A02)) {
            AbstractC6635a.d("OG-FCM", "Got push sync");
            OurApplication.f34286H.n().a0();
        } else {
            AbstractC6635a.f("OG-FCM", "Unknown push collapse key: " + A02);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void t(String str) {
        super.t(str);
        AbstractC6635a.d("OG-FCM", "Got new push token: " + str);
        OurApplication.f34286H.n().e1(str);
    }
}
