package com.adadapted.android.sdk.core.network;

import v5.AbstractC6844d;
import v5.C6841a;

/* loaded from: classes.dex */
public final class HttpConnector {
    public static final String API_HEADER = "X-API-KEY";
    public static final HttpConnector INSTANCE = new HttpConnector();
    private static final C6841a client = AbstractC6844d.a(HttpConnector$client$1.INSTANCE);
    public static final int $stable = 8;

    private HttpConnector() {
    }

    public final C6841a getClient() {
        return client;
    }
}
