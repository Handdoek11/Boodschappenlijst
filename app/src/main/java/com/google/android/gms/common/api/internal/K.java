package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.C1103b;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
final class K implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final I f13275o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ L f13276s;

    K(L l8, I i8) {
        this.f13276s = l8;
        this.f13275o = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f13276s.f13277s) {
            C1103b b8 = this.f13275o.b();
            if (b8.D0()) {
                L l8 = this.f13276s;
                l8.f13281o.startActivityForResult(GoogleApiActivity.a(l8.b(), (PendingIntent) Z2.r.l(b8.C0()), this.f13275o.a(), false), 1);
                return;
            }
            L l9 = this.f13276s;
            if (l9.f13280v.b(l9.b(), b8.A0(), null) != null) {
                L l10 = this.f13276s;
                l10.f13280v.v(l10.b(), l10.f13281o, b8.A0(), 2, this.f13276s);
                return;
            }
            if (b8.A0() != 18) {
                this.f13276s.l(b8, this.f13275o.a());
                return;
            }
            L l11 = this.f13276s;
            Dialog q8 = l11.f13280v.q(l11.b(), l11);
            L l12 = this.f13276s;
            l12.f13280v.r(l12.b().getApplicationContext(), new J(this, q8));
        }
    }
}
