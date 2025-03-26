package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
enum EnumC5347j {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* renamed from: o, reason: collision with root package name */
    private final char f31010o;

    EnumC5347j(char c8) {
        this.f31010o = c8;
    }

    public static EnumC5347j c(char c8) {
        for (EnumC5347j enumC5347j : values()) {
            if (enumC5347j.f31010o == c8) {
                return enumC5347j;
            }
        }
        return UNSET;
    }
}
