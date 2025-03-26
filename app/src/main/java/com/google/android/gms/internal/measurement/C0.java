package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes.dex */
public abstract class C0 {

    /* renamed from: a, reason: collision with root package name */
    private static C0 f28833a = new B0();

    public static synchronized C0 a() {
        C0 c02;
        synchronized (C0.class) {
            c02 = f28833a;
        }
        return c02;
    }

    public abstract URLConnection b(URL url, String str);
}
