package com.google.android.gms.common.api;

import W2.f;
import Z2.AbstractC0777p;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1103b;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes.dex */
public final class Status extends AbstractC0813a implements f, ReflectedParcelable {

    /* renamed from: o, reason: collision with root package name */
    private final int f13223o;

    /* renamed from: s, reason: collision with root package name */
    private final String f13224s;

    /* renamed from: t, reason: collision with root package name */
    private final PendingIntent f13225t;

    /* renamed from: u, reason: collision with root package name */
    private final C1103b f13226u;

    /* renamed from: v, reason: collision with root package name */
    public static final Status f13218v = new Status(-1);

    /* renamed from: w, reason: collision with root package name */
    public static final Status f13219w = new Status(0);

    /* renamed from: x, reason: collision with root package name */
    public static final Status f13220x = new Status(14);

    /* renamed from: y, reason: collision with root package name */
    public static final Status f13221y = new Status(8);

    /* renamed from: z, reason: collision with root package name */
    public static final Status f13222z = new Status(15);

    /* renamed from: A, reason: collision with root package name */
    public static final Status f13215A = new Status(16);

    /* renamed from: C, reason: collision with root package name */
    public static final Status f13217C = new Status(17);

    /* renamed from: B, reason: collision with root package name */
    public static final Status f13216B = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new e();

    Status(int i8, String str, PendingIntent pendingIntent, C1103b c1103b) {
        this.f13223o = i8;
        this.f13224s = str;
        this.f13225t = pendingIntent;
        this.f13226u = c1103b;
    }

    public C1103b A0() {
        return this.f13226u;
    }

    public int B0() {
        return this.f13223o;
    }

    public String C0() {
        return this.f13224s;
    }

    public boolean D0() {
        return this.f13225t != null;
    }

    public boolean E0() {
        return this.f13223o <= 0;
    }

    public final String F0() {
        String str = this.f13224s;
        return str != null ? str : W2.a.a(this.f13223o);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f13223o == status.f13223o && AbstractC0777p.a(this.f13224s, status.f13224s) && AbstractC0777p.a(this.f13225t, status.f13225t) && AbstractC0777p.a(this.f13226u, status.f13226u);
    }

    public int hashCode() {
        return AbstractC0777p.b(Integer.valueOf(this.f13223o), this.f13224s, this.f13225t, this.f13226u);
    }

    @Override // W2.f
    public Status m0() {
        return this;
    }

    public String toString() {
        AbstractC0777p.a c8 = AbstractC0777p.c(this);
        c8.a("statusCode", F0());
        c8.a("resolution", this.f13225t);
        return c8.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, B0());
        AbstractC0814b.s(parcel, 2, C0(), false);
        AbstractC0814b.r(parcel, 3, this.f13225t, i8, false);
        AbstractC0814b.r(parcel, 4, A0(), i8, false);
        AbstractC0814b.b(parcel, a8);
    }

    public Status(int i8) {
        this(i8, (String) null);
    }

    public Status(C1103b c1103b, String str) {
        this(c1103b, str, 17);
    }

    public Status(int i8, String str) {
        this(i8, str, (PendingIntent) null);
    }

    public Status(C1103b c1103b, String str, int i8) {
        this(i8, str, c1103b.C0(), c1103b);
    }

    public Status(int i8, String str, PendingIntent pendingIntent) {
        this(i8, str, pendingIntent, null);
    }
}
