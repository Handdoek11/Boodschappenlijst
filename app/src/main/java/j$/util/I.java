package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class I implements IntConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f37254a;

    public /* synthetic */ I(Consumer consumer) {
        this.f37254a = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i8) {
        this.f37254a.accept(Integer.valueOf(i8));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }
}
