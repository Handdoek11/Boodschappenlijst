package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes3.dex */
final class P0 extends R0 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f37540k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P0(AbstractC5917b abstractC5917b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, int i8) {
        super(abstractC5917b, spliterator, longFunction, binaryOperator);
        this.f37540k = i8;
    }

    @Override // j$.util.stream.R0, j$.util.stream.AbstractC5932e
    protected final AbstractC5932e e(Spliterator spliterator) {
        switch (this.f37540k) {
        }
        return new R0(this, spliterator);
    }

    @Override // j$.util.stream.R0, j$.util.stream.AbstractC5932e
    protected final /* bridge */ /* synthetic */ Object a() {
        switch (this.f37540k) {
        }
        return a();
    }
}
