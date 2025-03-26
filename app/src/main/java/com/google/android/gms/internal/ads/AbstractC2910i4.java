package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.i4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2910i4 {
    public static void a(InterfaceC3126k4 interfaceC3126k4, C3453n4 c3453n4, WE we) {
        for (int i8 = 0; i8 < interfaceC3126k4.zza(); i8++) {
            long A7 = interfaceC3126k4.A(i8);
            List a8 = interfaceC3126k4.a(A7);
            if (!a8.isEmpty()) {
                if (i8 == interfaceC3126k4.zza() - 1) {
                    throw new IllegalStateException();
                }
                long A8 = interfaceC3126k4.A(i8 + 1) - interfaceC3126k4.A(i8);
                if (A8 > 0) {
                    we.a(new C2692g4(a8, A7, A8));
                }
            }
        }
    }
}
