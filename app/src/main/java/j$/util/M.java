package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class M implements LongConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f37257a;

    public /* synthetic */ M(Consumer consumer) {
        this.f37257a = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f37257a.accept(Long.valueOf(j8));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }
}
