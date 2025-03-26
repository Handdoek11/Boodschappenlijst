package j$.util.stream;

import j$.util.C5900g;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5912a implements Supplier, Consumer, BooleanSupplier, DoubleFunction, Function, LongFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37614a;

    /* renamed from: b, reason: collision with root package name */
    public Object f37615b;

    public /* synthetic */ C5912a(int i8) {
        this.f37614a = i8;
    }

    public /* synthetic */ C5912a(int i8, Object obj) {
        this.f37614a = i8;
        this.f37615b = obj;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f37614a) {
            case 1:
                ((InterfaceC5985o2) this.f37615b).accept((InterfaceC5985o2) obj);
                break;
            default:
                ((ArrayList) this.f37615b).add(obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f37614a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f37614a) {
            case 0:
                return ((AbstractC5917b) this.f37615b).L();
            default:
                return (Spliterator) this.f37615b;
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object apply = ((Function) this.f37615b).apply(obj);
        if (apply == null) {
            return null;
        }
        if (apply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) apply);
        }
        if (apply instanceof java.util.stream.Stream) {
            return Z2.j((java.util.stream.Stream) apply);
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        if (apply instanceof F) {
            return E.j((F) apply);
        }
        if (apply instanceof DoubleStream) {
            return D.j((DoubleStream) apply);
        }
        if (apply instanceof InterfaceC5983o0) {
            return C5978n0.j((InterfaceC5983o0) apply);
        }
        if (apply instanceof LongStream) {
            return C5973m0.j((LongStream) apply);
        }
        C5900g.a("java.util.stream.*Stream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d8) {
        Object apply = ((DoubleFunction) this.f37615b).apply(d8);
        if (apply == null) {
            return null;
        }
        if (apply instanceof F) {
            return E.j((F) apply);
        }
        if (apply instanceof DoubleStream) {
            return D.j((DoubleStream) apply);
        }
        C5900g.a("java.util.stream.DoubleStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j8) {
        Object apply = ((LongFunction) this.f37615b).apply(j8);
        if (apply == null) {
            return null;
        }
        if (apply instanceof InterfaceC5983o0) {
            return C5978n0.j((InterfaceC5983o0) apply);
        }
        if (apply instanceof LongStream) {
            return C5973m0.j((LongStream) apply);
        }
        C5900g.a("java.util.stream.LongStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f37614a) {
            case 2:
                C5986o3 c5986o3 = (C5986o3) this.f37615b;
                return c5986o3.f37687d.tryAdvance(c5986o3.f37688e);
            case 3:
                C5996q3 c5996q3 = (C5996q3) this.f37615b;
                return c5996q3.f37687d.tryAdvance(c5996q3.f37688e);
            case 4:
                C6005s3 c6005s3 = (C6005s3) this.f37615b;
                return c6005s3.f37687d.tryAdvance(c6005s3.f37688e);
            default:
                H3 h32 = (H3) this.f37615b;
                return h32.f37687d.tryAdvance(h32.f37688e);
        }
    }
}
