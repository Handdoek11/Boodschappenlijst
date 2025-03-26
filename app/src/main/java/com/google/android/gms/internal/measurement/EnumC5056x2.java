package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC5056x2 implements InterfaceC5050w4 {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);


    /* renamed from: o, reason: collision with root package name */
    private final int f29641o;

    EnumC5056x2(int i8) {
        this.f29641o = i8;
    }

    public static EnumC5056x2 a(int i8) {
        if (i8 == 0) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        }
        if (i8 == 1) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        if (i8 == 2) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        }
        if (i8 == 3) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        }
        if (i8 == 4) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        if (i8 != 5) {
            return null;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
    }

    public static InterfaceC5042v4 c() {
        return C5040v2.f29604a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC5056x2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f29641o + " name=" + name() + '>';
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5050w4
    public final int zza() {
        return this.f29641o;
    }
}
