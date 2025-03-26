package com.adadapted.android.sdk.core.event;

import A6.d;
import com.adadapted.android.sdk.core.session.Session;
import java.util.Set;

/* loaded from: classes.dex */
public interface EventAdapter {
    Object publishAdEvents(Session session, Set<AdEvent> set, d dVar);

    Object publishSdkErrors(Session session, Set<SdkError> set, d dVar);

    Object publishSdkEvents(Session session, Set<SdkEvent> set, d dVar);
}
