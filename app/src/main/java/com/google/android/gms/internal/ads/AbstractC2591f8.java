package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.f8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2591f8 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet f21954a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private static String f21955b = "media3.common";

    public static synchronized String a() {
        String str;
        synchronized (AbstractC2591f8.class) {
            str = f21955b;
        }
        return str;
    }

    public static synchronized void b(String str) {
        synchronized (AbstractC2591f8.class) {
            if (f21954a.add(str)) {
                f21955b = f21955b + ", " + str;
            }
        }
    }
}
