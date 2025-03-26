package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.wG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4458wG0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f27475a = new AtomicLong();

    public C4458wG0(long j8, C4393vk0 c4393vk0, Uri uri, Map map, long j9, long j10, long j11) {
    }

    public static long a() {
        return f27475a.getAndIncrement();
    }

    public C4458wG0(long j8, C4393vk0 c4393vk0, long j9) {
        Uri uri = c4393vk0.f27331a;
        Collections.emptyMap();
    }
}
