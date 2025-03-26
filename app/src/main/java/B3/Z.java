package B3;

import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes2.dex */
final class Z implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ DataHolder f451o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ E f452s;

    Z(E e8, DataHolder dataHolder) {
        this.f451o = dataHolder;
        this.f452s = e8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0390i c0390i = new C0390i(this.f451o);
        try {
            this.f452s.f404s.e(c0390i);
        } finally {
            c0390i.d();
        }
    }
}
