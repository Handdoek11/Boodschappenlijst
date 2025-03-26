package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5928d0 implements LongConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5985o2 f37643a;

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f37643a.accept(j8);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }
}
