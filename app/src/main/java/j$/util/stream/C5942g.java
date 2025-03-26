package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5942g implements BaseStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5947h f37699a;

    private /* synthetic */ C5942g(InterfaceC5947h interfaceC5947h) {
        this.f37699a = interfaceC5947h;
    }

    public static /* synthetic */ BaseStream j(InterfaceC5947h interfaceC5947h) {
        if (interfaceC5947h == null) {
            return null;
        }
        return interfaceC5947h instanceof C5937f ? ((C5937f) interfaceC5947h).f37680a : interfaceC5947h instanceof F ? E.j((F) interfaceC5947h) : interfaceC5947h instanceof IntStream ? IntStream.Wrapper.convert((IntStream) interfaceC5947h) : interfaceC5947h instanceof InterfaceC5983o0 ? C5978n0.j((InterfaceC5983o0) interfaceC5947h) : interfaceC5947h instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC5947h) : new C5942g(interfaceC5947h);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f37699a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC5947h interfaceC5947h = this.f37699a;
        if (obj instanceof C5942g) {
            obj = ((C5942g) obj).f37699a;
        }
        return interfaceC5947h.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f37699a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f37699a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f37699a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return j(this.f37699a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return j(this.f37699a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return j(this.f37699a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f37699a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return j(this.f37699a.unordered());
    }
}
