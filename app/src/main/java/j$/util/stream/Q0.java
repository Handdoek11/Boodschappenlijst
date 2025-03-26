package j$.util.stream;

import j$.util.C5900g;
import j$.util.stream.IntStream;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* loaded from: classes3.dex */
public final /* synthetic */ class Q0 implements LongFunction, IntFunction {

    /* renamed from: a, reason: collision with root package name */
    public IntFunction f37551a;

    @Override // java.util.function.IntFunction
    public Object apply(int i8) {
        Object apply = this.f37551a.apply(i8);
        if (apply == null) {
            return null;
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        C5900g.a("java.util.stream.IntStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j8) {
        return AbstractC6032y0.D(j8, this.f37551a);
    }
}
