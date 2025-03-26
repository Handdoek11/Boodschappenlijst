package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4173tj0 {

    /* renamed from: a, reason: collision with root package name */
    private Uri f26914a;

    /* renamed from: b, reason: collision with root package name */
    private Map f26915b;

    /* renamed from: c, reason: collision with root package name */
    private long f26916c;

    /* renamed from: d, reason: collision with root package name */
    private final long f26917d;

    /* renamed from: e, reason: collision with root package name */
    private int f26918e;

    /* synthetic */ C4173tj0(C4393vk0 c4393vk0, Uj0 uj0) {
        this.f26914a = c4393vk0.f27331a;
        this.f26915b = c4393vk0.f27334d;
        this.f26916c = c4393vk0.f27335e;
        this.f26917d = c4393vk0.f27336f;
        this.f26918e = c4393vk0.f27337g;
    }

    public final C4173tj0 a(int i8) {
        this.f26918e = 6;
        return this;
    }

    public final C4173tj0 b(Map map) {
        this.f26915b = map;
        return this;
    }

    public final C4173tj0 c(long j8) {
        this.f26916c = j8;
        return this;
    }

    public final C4173tj0 d(Uri uri) {
        this.f26914a = uri;
        return this;
    }

    public final C4393vk0 e() {
        if (this.f26914a == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        return new C4393vk0(this.f26914a, this.f26915b, this.f26916c, this.f26917d, this.f26918e);
    }

    public C4173tj0() {
        this.f26915b = Collections.emptyMap();
        this.f26917d = -1L;
    }
}
