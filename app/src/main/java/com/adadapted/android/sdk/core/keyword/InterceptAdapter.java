package com.adadapted.android.sdk.core.keyword;

import A6.d;
import com.adadapted.android.sdk.core.session.Session;
import java.util.Set;

/* loaded from: classes.dex */
public interface InterceptAdapter {

    public interface Listener {
        void onSuccess(Intercept intercept);
    }

    Object retrieve(Session session, Listener listener, d dVar);

    Object sendEvents(Session session, Set<InterceptEvent> set, d dVar);
}
