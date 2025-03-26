package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C7;
import com.google.android.gms.internal.measurement.F7;
import java.util.List;

/* loaded from: classes2.dex */
final class N2 implements F7 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ I2 f30623a;

    N2(I2 i22) {
        this.f30623a = i22;
    }

    @Override // com.google.android.gms.internal.measurement.F7
    public final void a(C7 c72, String str, List list, boolean z7, boolean z8) {
        int i8 = O2.f30628a[c72.ordinal()];
        C5392p2 H7 = i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? this.f30623a.h().H() : this.f30623a.h().I() : z7 ? this.f30623a.h().L() : !z8 ? this.f30623a.h().K() : this.f30623a.h().J() : z7 ? this.f30623a.h().G() : !z8 ? this.f30623a.h().F() : this.f30623a.h().E() : this.f30623a.h().D();
        int size = list.size();
        if (size == 1) {
            H7.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            H7.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            H7.a(str);
        } else {
            H7.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
