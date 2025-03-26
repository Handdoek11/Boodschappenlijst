package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5992q implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5985o2 f37771a;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        this.f37771a.accept(d8);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }
}
