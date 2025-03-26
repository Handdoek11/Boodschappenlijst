package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.rb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3939rb0 extends C4266ub0 {

    /* renamed from: u, reason: collision with root package name */
    private static final C3939rb0 f26197u = new C3939rb0();

    private C3939rb0() {
    }

    public static C3939rb0 i() {
        return f26197u;
    }

    @Override // com.google.android.gms.internal.ads.C4266ub0
    public final void b(boolean z7) {
        Iterator it = C4048sb0.a().c().iterator();
        while (it.hasNext()) {
            ((C2200bb0) it.next()).g().k(z7);
        }
    }

    @Override // com.google.android.gms.internal.ads.C4266ub0
    public final boolean c() {
        Iterator it = C4048sb0.a().b().iterator();
        while (it.hasNext()) {
            View f8 = ((C2200bb0) it.next()).f();
            if (f8 != null && f8.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
