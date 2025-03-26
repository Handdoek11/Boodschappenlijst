package B3;

import java.util.List;

/* renamed from: B3.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC0406z implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ List f491o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ E f492s;

    RunnableC0406z(E e8, List list) {
        this.f491o = list;
        this.f492s = e8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f492s.f404s.l(this.f491o);
    }
}
