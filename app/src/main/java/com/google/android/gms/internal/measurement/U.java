package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class U extends A {
    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC5013s b(String str, Z2 z22, List list) {
        if (str == null || str.isEmpty() || !z22.g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        InterfaceC5013s c8 = z22.c(str);
        if (c8 instanceof AbstractC4974n) {
            return ((AbstractC4974n) c8).f(z22, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
