package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.k3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5966k3 extends AbstractC5971l3 implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    final Object[] f37728b;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    C5966k3(int i8) {
        this.f37728b = new Object[i8];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i8 = this.f37736a;
        this.f37736a = i8 + 1;
        this.f37728b[i8] = obj;
    }
}
