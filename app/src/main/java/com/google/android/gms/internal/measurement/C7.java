package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public enum C7 {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);

    C7(int i8) {
    }

    public static C7 a(int i8) {
        return i8 != 2 ? i8 != 3 ? i8 != 5 ? i8 != 6 ? INFO : ERROR : WARN : DEBUG : VERBOSE;
    }
}
