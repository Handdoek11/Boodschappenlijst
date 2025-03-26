package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ul, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1841Ul implements J2.e {

    /* renamed from: a, reason: collision with root package name */
    private final Date f19444a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19445b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f19446c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f19447d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f19448e;

    /* renamed from: f, reason: collision with root package name */
    private final int f19449f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f19450g;

    public C1841Ul(Date date, int i8, Set set, Location location, boolean z7, int i9, boolean z8, int i10, String str) {
        this.f19444a = date;
        this.f19445b = i8;
        this.f19446c = set;
        this.f19448e = location;
        this.f19447d = z7;
        this.f19449f = i9;
        this.f19450g = z8;
    }

    @Override // J2.e
    public final int b() {
        return this.f19449f;
    }

    @Override // J2.e
    public final boolean d() {
        return this.f19450g;
    }

    @Override // J2.e
    public final boolean e() {
        return this.f19447d;
    }

    @Override // J2.e
    public final Set f() {
        return this.f19446c;
    }
}
