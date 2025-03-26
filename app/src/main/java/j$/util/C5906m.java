package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5906m implements Iterator, InterfaceC6047z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37403a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Iterator f37404b;

    public C5906m(C5907n c5907n) {
        this.f37404b = c5907n.f37405a.iterator();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC6047z
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f37403a) {
            case 0:
                AbstractC5897d.q(this.f37404b, consumer);
                break;
            default:
                AbstractC5897d.q(this.f37404b, new C5910q(consumer));
                break;
        }
    }

    public C5906m(C6041t c6041t) {
        this.f37404b = c6041t.f37405a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f37403a) {
        }
        return this.f37404b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f37403a) {
            case 0:
                return this.f37404b.next();
            default:
                return new r((Map.Entry) this.f37404b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f37403a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
