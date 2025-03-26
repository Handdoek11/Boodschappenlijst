package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class E implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f37251a;

    public /* synthetic */ E(Consumer consumer) {
        this.f37251a = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        this.f37251a.accept(Double.valueOf(d8));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }
}
