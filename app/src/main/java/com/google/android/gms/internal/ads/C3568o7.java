package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.o7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3568o7 {

    /* renamed from: a, reason: collision with root package name */
    private final int f25122a;

    /* renamed from: b, reason: collision with root package name */
    private final List f25123b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25124c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f25125d;

    public C3568o7(int i8, List list, int i9, InputStream inputStream) {
        this.f25122a = i8;
        this.f25123b = list;
        this.f25124c = i9;
        this.f25125d = inputStream;
    }

    public final int a() {
        return this.f25124c;
    }

    public final int b() {
        return this.f25122a;
    }

    public final InputStream c() {
        InputStream inputStream = this.f25125d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List d() {
        return DesugarCollections.unmodifiableList(this.f25123b);
    }
}
