package s5;

import com.google.protobuf.h;

/* renamed from: s5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC6742h {
    AD_CONSENT_UNKNOWN(0, 0),
    AD_CONSENT_NOT_REQUIRED(1, 1),
    AD_CONSENT_REQUIRED(2, 2);


    /* renamed from: v, reason: collision with root package name */
    private static h.a f43187v = new h.a() { // from class: s5.h.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f43189o;

    EnumC6742h(int i8, int i9) {
        this.f43189o = i9;
    }

    public static EnumC6742h c(int i8) {
        if (i8 == 0) {
            return AD_CONSENT_UNKNOWN;
        }
        if (i8 == 1) {
            return AD_CONSENT_NOT_REQUIRED;
        }
        if (i8 != 2) {
            return null;
        }
        return AD_CONSENT_REQUIRED;
    }

    public final int e() {
        return this.f43189o;
    }
}
