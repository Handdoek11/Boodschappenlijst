package com.google.android.gms.internal.ads;

import M2.AbstractC0656c;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.a90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2051a90 {
    public static InterfaceC2160b90 a(Context context, int i8) {
        boolean booleanValue;
        if (RunnableC3791q90.a()) {
            int i9 = i8 - 2;
            if (i9 != 20 && i9 != 21) {
                switch (i9) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) AbstractC2534eg.f21867c.e()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) AbstractC2534eg.f21868d.e()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) AbstractC2534eg.f21866b.e()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) AbstractC2534eg.f21869e.e()).booleanValue();
            }
            if (booleanValue) {
                return new C2377d90(context, i8);
            }
        }
        return new K90();
    }

    public static InterfaceC2160b90 b(Context context, int i8, int i9, D2.X1 x12) {
        InterfaceC2160b90 a8 = a(context, i8);
        if (a8 instanceof C2377d90) {
            a8.f();
            a8.x(i9);
            a8.b(AbstractC0656c.a(x12.f1172D));
            if (AbstractC3355m90.e(x12.f1175G)) {
                a8.n(x12.f1175G);
            }
        }
        return a8;
    }
}
