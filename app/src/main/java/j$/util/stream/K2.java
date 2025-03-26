package j$.util.stream;

import j$.util.AbstractC5897d;
import j$.util.Collection;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class K2 extends C2 {

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f37498d;

    @Override // j$.util.stream.AbstractC5965k2, j$.util.stream.InterfaceC5985o2
    public final void l(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f37498d = j8 >= 0 ? new ArrayList((int) j8) : new ArrayList();
    }

    @Override // j$.util.stream.AbstractC5965k2, j$.util.stream.InterfaceC5985o2
    public final void k() {
        AbstractC5897d.r(this.f37498d, this.f37436b);
        long size = this.f37498d.size();
        InterfaceC5985o2 interfaceC5985o2 = this.f37727a;
        interfaceC5985o2.l(size);
        if (!this.f37437c) {
            ArrayList arrayList = this.f37498d;
            Objects.requireNonNull(interfaceC5985o2);
            Collection.EL.a(arrayList, new C5912a(1, interfaceC5985o2));
        } else {
            Iterator it = this.f37498d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (interfaceC5985o2.n()) {
                    break;
                } else {
                    interfaceC5985o2.accept((InterfaceC5985o2) next);
                }
            }
        }
        interfaceC5985o2.k();
        this.f37498d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f37498d.add(obj);
    }
}
