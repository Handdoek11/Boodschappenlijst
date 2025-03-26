package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class V implements IntConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5985o2 f37588a;

    @Override // java.util.function.IntConsumer
    public final void accept(int i8) {
        this.f37588a.accept(i8);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }
}
