package com.google.android.gms.common;

import Z2.AbstractC0777p;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.C1445Je;

/* renamed from: com.google.android.gms.common.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1103b extends AbstractC0813a {

    /* renamed from: o, reason: collision with root package name */
    final int f13386o;

    /* renamed from: s, reason: collision with root package name */
    private final int f13387s;

    /* renamed from: t, reason: collision with root package name */
    private final PendingIntent f13388t;

    /* renamed from: u, reason: collision with root package name */
    private final String f13389u;

    /* renamed from: v, reason: collision with root package name */
    public static final C1103b f13385v = new C1103b(0);
    public static final Parcelable.Creator<C1103b> CREATOR = new n();

    C1103b(int i8, int i9, PendingIntent pendingIntent, String str) {
        this.f13386o = i8;
        this.f13387s = i9;
        this.f13388t = pendingIntent;
        this.f13389u = str;
    }

    static String F0(int i8) {
        if (i8 == 99) {
            return "UNFINISHED";
        }
        if (i8 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i8) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i8) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case C1445Je.zzm /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i8 + ")";
                }
        }
    }

    public int A0() {
        return this.f13387s;
    }

    public String B0() {
        return this.f13389u;
    }

    public PendingIntent C0() {
        return this.f13388t;
    }

    public boolean D0() {
        return (this.f13387s == 0 || this.f13388t == null) ? false : true;
    }

    public boolean E0() {
        return this.f13387s == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1103b)) {
            return false;
        }
        C1103b c1103b = (C1103b) obj;
        return this.f13387s == c1103b.f13387s && AbstractC0777p.a(this.f13388t, c1103b.f13388t) && AbstractC0777p.a(this.f13389u, c1103b.f13389u);
    }

    public int hashCode() {
        return AbstractC0777p.b(Integer.valueOf(this.f13387s), this.f13388t, this.f13389u);
    }

    public String toString() {
        AbstractC0777p.a c8 = AbstractC0777p.c(this);
        c8.a("statusCode", F0(this.f13387s));
        c8.a("resolution", this.f13388t);
        c8.a("message", this.f13389u);
        return c8.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f13386o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.m(parcel, 2, A0());
        AbstractC0814b.r(parcel, 3, C0(), i8, false);
        AbstractC0814b.s(parcel, 4, B0(), false);
        AbstractC0814b.b(parcel, a8);
    }

    public C1103b(int i8) {
        this(i8, null, null);
    }

    public C1103b(int i8, PendingIntent pendingIntent) {
        this(i8, pendingIntent, null);
    }

    public C1103b(int i8, PendingIntent pendingIntent, String str) {
        this(1, i8, pendingIntent, str);
    }
}
