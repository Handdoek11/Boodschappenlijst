package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5937f implements InterfaceC5947h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseStream f37680a;

    private /* synthetic */ C5937f(BaseStream baseStream) {
        this.f37680a = baseStream;
    }

    public static /* synthetic */ InterfaceC5947h j(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C5942g ? ((C5942g) baseStream).f37699a : baseStream instanceof DoubleStream ? D.j((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C5973m0.j((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? Z2.j((java.util.stream.Stream) baseStream) : new C5937f(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f37680a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.f37680a;
        if (obj instanceof C5937f) {
            obj = ((C5937f) obj).f37680a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f37680a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final /* synthetic */ boolean isParallel() {
        return this.f37680a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* synthetic */ Iterator iterator() {
        return this.f37680a.iterator();
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final /* synthetic */ InterfaceC5947h onClose(Runnable runnable) {
        return j(this.f37680a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5947h parallel() {
        return j(this.f37680a.parallel());
    }

    @Override // j$.util.stream.InterfaceC5947h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5947h sequential() {
        return j(this.f37680a.sequential());
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.f0.a(this.f37680a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC5947h
    public final /* synthetic */ InterfaceC5947h unordered() {
        return j(this.f37680a.unordered());
    }
}
