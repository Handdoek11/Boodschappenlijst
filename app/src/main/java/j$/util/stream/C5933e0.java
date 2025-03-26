package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5933e0 implements LongBinaryOperator, Consumer, IntFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37673a;

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i8 = this.f37673a;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f37673a) {
            case 1:
                break;
            case 7:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j8, long j9) {
        return j8 + j9;
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i8) {
        switch (this.f37673a) {
            case 2:
                return new Object[i8];
            case 3:
                return new Object[i8];
            case 4:
                return new Integer[i8];
            case 5:
                return new Long[i8];
            case 6:
                return new Double[i8];
            case 7:
            case 8:
            default:
                return new Double[i8];
            case 9:
                return new Integer[i8];
            case 10:
                return new Integer[i8];
            case 11:
                return new Long[i8];
            case 12:
                return new Long[i8];
            case 13:
                return new Double[i8];
        }
    }
}
