package com.google.android.gms.common.api.internal;

import X2.InterfaceC0759g;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C1103b;
import com.google.android.gms.common.C1108g;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class L extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: s, reason: collision with root package name */
    protected volatile boolean f13277s;

    /* renamed from: t, reason: collision with root package name */
    protected final AtomicReference f13278t;

    /* renamed from: u, reason: collision with root package name */
    private final Handler f13279u;

    /* renamed from: v, reason: collision with root package name */
    protected final C1108g f13280v;

    L(InterfaceC0759g interfaceC0759g, C1108g c1108g) {
        super(interfaceC0759g);
        this.f13278t = new AtomicReference(null);
        this.f13279u = new m3.h(Looper.getMainLooper());
        this.f13280v = c1108g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(C1103b c1103b, int i8) {
        this.f13278t.set(null);
        m(c1103b, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f13278t.set(null);
        n();
    }

    private static final int p(I i8) {
        if (i8 == null) {
            return -1;
        }
        return i8.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i8, int i9, Intent intent) {
        I i10 = (I) this.f13278t.get();
        if (i8 != 1) {
            if (i8 == 2) {
                int g8 = this.f13280v.g(b());
                if (g8 == 0) {
                    o();
                    return;
                } else {
                    if (i10 == null) {
                        return;
                    }
                    if (i10.b().A0() == 18 && g8 == 18) {
                        return;
                    }
                }
            }
        } else if (i9 == -1) {
            o();
            return;
        } else if (i9 == 0) {
            if (i10 != null) {
                l(new C1103b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, i10.b().toString()), p(i10));
                return;
            }
            return;
        }
        if (i10 != null) {
            l(i10.b(), i10.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f13278t.set(bundle.getBoolean("resolving_error", false) ? new I(new C1103b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        I i8 = (I) this.f13278t.get();
        if (i8 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", i8.a());
        bundle.putInt("failed_status", i8.b().A0());
        bundle.putParcelable("failed_resolution", i8.b().C0());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.f13277s = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f13277s = false;
    }

    protected abstract void m(C1103b c1103b, int i8);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new C1103b(13, null), p((I) this.f13278t.get()));
    }

    public final void s(C1103b c1103b, int i8) {
        AtomicReference atomicReference;
        I i9 = new I(c1103b, i8);
        do {
            atomicReference = this.f13278t;
            if (X2.D.a(atomicReference, null, i9)) {
                this.f13279u.post(new K(this, i9));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
